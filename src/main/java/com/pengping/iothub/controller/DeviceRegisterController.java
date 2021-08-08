package com.pengping.iothub.controller;


import com.pengping.iothub.entity.DeviceInfo;
import com.pengping.iothub.service.DeviceRegisterService;
import com.pengping.iothub.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/RegisterService", method = RequestMethod.POST)
public class DeviceRegisterController {
    @Autowired
    private DeviceRegisterService deviceRegisterService;

    @ResponseBody
    @RequestMapping("getDeviceInfo")
    public CommonResponse<?> getDeviceInfo(@RequestParam String uuid){
        System.out.printf("getDeviceInfo:"+uuid);
        DeviceInfo deviceInfo = deviceRegisterService.queryDeviceInfoByUUID(uuid);
        System.out.printf("deviceInfo:"+deviceInfo);
       return new CommonResponse<>("0", "ok", deviceInfo);
    }


}
