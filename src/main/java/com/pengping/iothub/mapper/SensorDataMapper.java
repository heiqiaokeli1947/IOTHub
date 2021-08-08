package com.pengping.iothub.mapper;

import com.pengping.iothub.entity.SensorData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorDataMapper {

    public List<SensorData> queryAllSensorData();
    public List<SensorData> querySensorDataByUUID(String uuid);
    public int insertSensorData(List<SensorData> sensorData);

    public int deleteSensorDataByID(String uuid);
}
