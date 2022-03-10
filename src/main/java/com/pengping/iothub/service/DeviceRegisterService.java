package com.pengping.iothub.service;

import com.pengping.iothub.entity.DeviceInfo;
import com.pengping.iothub.entity.DeviceRegisterInfo;

public interface DeviceRegisterService {

    public DeviceInfo queryDeviceInfoByUUID(String uuid);

    public boolean deviceRegister(DeviceRegisterInfo deviceRegisterInfo);
}
