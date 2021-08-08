package com.pengping.iothub.service;

import com.pengping.iothub.entity.DeviceInfo;
import com.pengping.iothub.mapper.DeviceInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceRegisterService {
    @Autowired
    DeviceInfoMapper deviceInfoMapper;

    public DeviceInfo queryDeviceInfoByUUID(String uuid){
        return deviceInfoMapper.queryDeviceInfoByUUID(uuid);
    }


}
