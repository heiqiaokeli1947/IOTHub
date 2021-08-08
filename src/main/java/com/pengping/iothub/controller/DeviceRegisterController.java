package com.pengping.iothub.controller;


import com.pengping.iothub.entity.DeviceInfo;
import com.pengping.iothub.entity.DeviceRegisterInfo;
import com.pengping.iothub.service.DeviceRegisterService;
import com.pengping.iothub.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/registerService", method = RequestMethod.POST)
public class DeviceRegisterController {
    @Autowired
    private DeviceRegisterService deviceRegisterService;

    @ResponseBody
    @RequestMapping("getDeviceInfo")
    public CommonResponse<?> getDeviceInfo(@RequestParam String uuid){
        System.out.println("getDeviceInfo:"+uuid);
        DeviceInfo deviceInfo = deviceRegisterService.queryDeviceInfoByUUID(uuid);
        System.out.println("deviceInfo:"+deviceInfo);
       return new CommonResponse<>("0", "ok", deviceInfo);
    }

    @ResponseBody
    @RequestMapping("register")
    public CommonResponse<?> register(@RequestParam String param/*DeviceRegisterInfo deviceRegisterInfo*/){

        System.out.println("param:"+param);

        /*System.out.printf("DeviceRegisterInfo:"+deviceRegisterInfo);
        boolean res = deviceRegisterService.deviceRegister(deviceRegisterInfo);
        if (res) {
            System.out.printf("register success.");
            return new CommonResponse<>("0", "register success", null);
        }*/

        System.out.println("register failed.");
        return new CommonResponse<>("-1", "register failed", null);
    }


}
