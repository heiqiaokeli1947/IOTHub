package com.pengping.iothub.mapper;

import com.pengping.iothub.entity.DeviceInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceInfoMapper {

    public List<DeviceInfo> queryAllDeviceInfo();

    public DeviceInfo queryDeviceInfoByUUID(String uuid);
    public DeviceInfo queryDeviceInfoByIP(String deviceIp);

    public int insertDeviceInfo(List<DeviceInfo> deviceInfos);

    public int deleteDeviceInfoByUUID(String uuid);


}
