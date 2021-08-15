package com.pengping.iothub.entity;

import java.util.Date;

public class SensorData {

    private String uuid;
    private String deviceIp;
    private Date time;
    private int timestamp;
    private int pm2_5;
    private float temperature;
    private float humidity;
    private float pressure;
    private float lumination;
    private float co2;
    private float o2;
    private float co;
    private float battery;
    private float solarcell;
    private String color;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getPm2_5() {
        return pm2_5;
    }

    public void setPm2_5(int pm2_5) {
        this.pm2_5 = pm2_5;
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

    public float getCo2() {
        return co2;
    }

    public void setCo2(float co2) {
        this.co2 = co2;
    }

    public float getO2() {
        return o2;
    }

    public void setO2(float o2) {
        this.o2 = o2;
    }

    public float getCo() {
        return co;
    }

    public void setCo(float co) {
        this.co = co;
    }

    public float getBattery() {
        return battery;
    }

    public void setBattery(float battery) {
        this.battery = battery;
    }

    public float getSolarcell() {
        return solarcell;
    }

    public void setSolarcell(float solarcell) {
        this.solarcell = solarcell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "uuid='" + uuid + '\'' +
                ", deviceIp='" + deviceIp + '\'' +
                ", time=" + time +
                ", timestamp=" + timestamp +
                ", pm2_5=" + pm2_5 +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", lumination=" + lumination +
                ", co2=" + co2 +
                ", o2=" + o2 +
                ", co=" + co +
                ", battery=" + battery +
                ", solarcell=" + solarcell +
                ", color='" + color + '\'' +
                '}';
    }
}
