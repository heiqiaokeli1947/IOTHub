package com.pengping.iothub.pojo;

import java.util.Date;

public class TempSensorData {

    public String getNodeUUID() {
        return nodeUUID;
    }

    public void setNodeUUID(String nodeUUID) {
        this.nodeUUID = nodeUUID;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getIntensity() {
        return intensity;
    }

    public void setIntensity(float intensity) {
        this.intensity = intensity;
    }

/*    @Override
    public String toString() {
        return "A column data of s_sensor_data:"+"["+nodeUUID+"],["+timeStamp.toString()+"],["+String.valueOf(temperature)+"],["+String.valueOf(humidity)+"],["+String.valueOf(pressure)+"],["+String.valueOf(intensity)+"]";
    }*/

    @Override
    public String toString() {
        return "TempSensorData{" +
                "nodeUUID='" + nodeUUID + '\'' +
                ", timeStamp=" + timeStamp +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", intensity=" + intensity +
                '}';
    }

    private String nodeUUID;
    private Date timeStamp;
    private float temperature;
    private float humidity;
    private float pressure;
    private float intensity;
}
