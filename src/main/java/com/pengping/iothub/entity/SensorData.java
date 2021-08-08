package com.pengping.iothub.entity;

import java.util.Date;

public class SensorData {

    private String uuid;
    private Date time;
    private float temperature;
    private float humidity;
    private float pressure;
    private float lumination;
    private String color;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public float getLumination() {
        return lumination;
    }

    public void setLumination(float lumination) {
        this.lumination = lumination;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TempSensorData{" +
                "uuid='" + uuid + '\'' +
                ", time=" + time +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", lumination=" + lumination +
                ", color='" + color + '\'' +
                '}';
    }
}
