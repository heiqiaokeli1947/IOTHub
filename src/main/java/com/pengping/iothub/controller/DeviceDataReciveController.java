package com.pengping.iothub.controller;

import com.pengping.iothub.entity.DeviceInfo;
import com.pengping.iothub.entity.SensorData;
import com.pengping.iothub.service.DeviceDataReciveService;
import com.pengping.iothub.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/dataReciveService", method = RequestMethod.POST)
public class DeviceDataReciveController {
    @Autowired
    private DeviceDataReciveService deviceDataReciveService;

    @ResponseBody
    @RequestMapping("reportData")
    public CommonResponse<?> reportData(@RequestParam String newData){
        System.out.println("reportData:"+newData);

        SensorData sensorData = new SensorData();
        List<SensorData> datas= new ArrayList<>();
        datas.add(sensorData);

        boolean res = deviceDataReciveService.saveData(datas);
        if (res) {
            System.out.println("save data success.");
            return new CommonResponse<>("0", "ok", null);
        }
        System.out.println("save data failed.");
        return new CommonResponse<>("-1", "failed", null);
    }



}
