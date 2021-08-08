package com.pengping.iothub.service;

import com.pengping.iothub.entity.DeviceInfo;
import com.pengping.iothub.entity.DeviceRegisterInfo;
import com.pengping.iothub.mapper.DeviceInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceRegisterService {
    @Autowired
    DeviceInfoMapper deviceInfoMapper;

    public DeviceInfo queryDeviceInfoByUUID(String uuid){
        return deviceInfoMapper.queryDeviceInfoByUUID(uuid);
    }

    public boolean deviceRegister(DeviceRegisterInfo deviceRegisterInfo){


        DeviceInfo deviceInfo = deviceInfoMapper.queryDeviceInfoByIP(deviceRegisterInfo.getDeviceIp());
        if (deviceInfo == null) {
            return false;
        }

        List<DeviceInfo> newDeviceInfo = new ArrayList<>();
        newDeviceInfo.add(new DeviceInfo(deviceRegisterInfo));

        int count = deviceInfoMapper.insertDeviceInfo(newDeviceInfo);
        if (count != -1) {
            return true;
        }

        return false;

    }





}
