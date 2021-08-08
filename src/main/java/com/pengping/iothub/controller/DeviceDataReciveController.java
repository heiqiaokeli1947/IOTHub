package com.pengping.iothub.controller;

import com.pengping.iothub.IothubApplication;
import com.pengping.iothub.entity.DeviceInfo;
import com.pengping.iothub.entity.SensorData;
import com.pengping.iothub.service.DeviceDataReciveService;
import com.pengping.iothub.util.CommonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@RestController
@RequestMapping(value = "/dataReciveService", method = RequestMethod.POST)
public class DeviceDataReciveController {

    private static final Logger logger = LoggerFactory.getLogger(DeviceDataReciveController.class);
    @Autowired
    private DeviceDataReciveService deviceDataReciveService;

    @ResponseBody
    @RequestMapping("reportData")
    public CommonResponse<?> reportData(@RequestBody SensorData sensorData){
        logger.info("reportData:"+sensorData);

        Date timeStamp = new Date(/*tm.longValue()*/);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT+8"));


        sensorData.setUuid(sensorData.getDeviceIp());
        sensorData.setTime(timeStamp);

        List<SensorData> datas= new ArrayList<>();
        datas.add(sensorData);

        boolean res = deviceDataReciveService.saveData(datas);
        if (res) {
            logger.info("save data success.");
            return new CommonResponse<>("0", "ok", null);
        }
        logger.info("save data failed.");
        return new CommonResponse<>("-1", "failed", null);
    }



}
