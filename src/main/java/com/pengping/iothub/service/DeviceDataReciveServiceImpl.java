package com.pengping.iothub.service;

import com.pengping.iothub.entity.SensorData;
import com.pengping.iothub.mapper.SensorDataMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceDataReciveServiceImpl implements DeviceDataReciveService{

    private static final Logger logger = LoggerFactory.getLogger(DeviceDataReciveServiceImpl.class);

    @Autowired
    SensorDataMapper sensorDataMapper;

    public boolean saveData(List<SensorData> sensorDatas){
        int count = sensorDataMapper.insertSensorData(sensorDatas);
        if (count != -1) {
            logger.info("save count:"+count);
            return true;
        }
        return false;
    }

}
