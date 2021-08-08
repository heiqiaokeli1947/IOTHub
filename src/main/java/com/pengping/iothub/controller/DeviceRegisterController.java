package com.pengping.iothub.controller;


import com.pengping.iothub.entity.DeviceInfo;
import com.pengping.iothub.service.DeviceRegisterService;
import com.pengping.iothub.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RegisterService")
public class DeviceRegisterController {
    @Autowired
    private DeviceRegisterService deviceRegisterService;

    @RequestMapping("getDeviceInfo")
    public CommonResponse<?> getDeviceInfo(@PathVariable String uuid){
        System.out.printf("getDeviceInfo:"+uuid);
        DeviceInfo deviceInfo = deviceRegisterService.queryDeviceInfoByUUID(uuid);
        System.out.printf("deviceInfo:"+deviceInfo);
       return new CommonResponse<>("-1", "balance id not found", deviceInfo);
    }


}
