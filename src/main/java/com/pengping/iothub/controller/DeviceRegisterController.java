package com.pengping.iothub.controller;


import com.pengping.iothub.entity.DeviceInfo;
import com.pengping.iothub.entity.DeviceRegisterInfo;
import com.pengping.iothub.service.DeviceRegisterService;
import com.pengping.iothub.util.CommonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/registerService", method = RequestMethod.POST)
public class DeviceRegisterController {

    private static final Logger logger = LoggerFactory.getLogger(DeviceRegisterController.class);

    @Autowired
    private DeviceRegisterService deviceRegisterService;

    @ResponseBody
    @RequestMapping("getDeviceInfo")
    public CommonResponse<?> getDeviceInfo(@RequestParam String uuid){
        logger.info("getDeviceInfo:"+uuid);
        DeviceInfo deviceInfo = deviceRegisterService.queryDeviceInfoByUUID(uuid);
        logger.info("deviceInfo:"+deviceInfo);
       return new CommonResponse<>("0", "ok", deviceInfo);
    }

    @ResponseBody
    @RequestMapping("register")
    public CommonResponse<?> register(@RequestBody DeviceRegisterInfo deviceRegisterInfo){

        //System.out.println("param:"+param);

        logger.info("DeviceRegisterInfo:"+deviceRegisterInfo);
        boolean res = deviceRegisterService.deviceRegister(deviceRegisterInfo);
        if (res) {
            logger.info("register success.");
            return new CommonResponse<>("0", "register success", null);
        }

        logger.info("register failed.");
        return new CommonResponse<>("-1", "register failed", null);
    }


}
