package com.pengping.iothub.service;

import com.pengping.iothub.entity.SensorData;
import com.pengping.iothub.mapper.SensorDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceDataReciveService {

    @Autowired
    SensorDataMapper sensorDataMapper;

    public boolean saveData(List<SensorData> sensorDatas){
        int count = sensorDataMapper.insertSensorData(sensorDatas);
        if (count == -1) {
            System.out.println("save count:"+count);
            return true;
        }
        return false;
    }

}
