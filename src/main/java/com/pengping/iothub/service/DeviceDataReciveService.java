package com.pengping.iothub.service;

import com.pengping.iothub.entity.SensorData;

import java.util.List;

public interface DeviceDataReciveService {

    public boolean saveData(List<SensorData> sensorDatas);
}
