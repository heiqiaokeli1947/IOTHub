package com.pengping.iothub.dao;

import com.pengping.iothub.pojo.TempSensorData;

import java.util.List;

public interface TempSensorDataMapper {

    public List<TempSensorData> queryTempSensorALLData();

    public int insertTempSensorData(List<TempSensorData> tempSensorDatas);
}
