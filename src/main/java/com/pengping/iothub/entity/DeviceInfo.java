package com.pengping.iothub.entity;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class DeviceInfo {
    private String uuid;
    private String deviceIp;
    private String deviceName;
    private String devicetype;
    private Date addTime;
    private String description;
    private String userName;
    private String password;
    private String productKey;
    private String deviceSecret;
    private String regionId;
    private Double longitude;
    private Double latitude;
    private Double altitude;

    public DeviceInfo() {

    }

    public DeviceInfo(DeviceRegisterInfo deviceRegisterInfo) {

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //从前端或者自己模拟一个日期格式，转为String即可
        String now = format.format(date);


        this.uuid = UUID.randomUUID().toString().replaceAll("-","");;
        this.addTime = new Date();
        this.deviceIp = deviceRegisterInfo.getDeviceIp();
        this.deviceName = deviceRegisterInfo.getDeviceName();
        this.devicetype = deviceRegisterInfo.getDevicetype();
        this.description = deviceRegisterInfo.getDescription();
        this.userName = deviceRegisterInfo.getUserName();
        this.password = deviceRegisterInfo.getPassword();
        this.productKey = deviceRegisterInfo.getProductKey();
        this.deviceSecret = deviceRegisterInfo.getDeviceSecret();
        this.regionId = deviceRegisterInfo.getRegionId();
        this.longitude = deviceRegisterInfo.getLongitude();
        this.latitude = deviceRegisterInfo.getLatitude();
        this.altitude = deviceRegisterInfo.getAltitude();
    }

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

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    public String getDeviceSecret() {
        return deviceSecret;
    }

    public void setDeviceSecret(String deviceSecret) {
        this.deviceSecret = deviceSecret;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "DeviceInfo{" +
                "uuid='" + uuid + '\'' +
                ", deviceIp='" + deviceIp + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", devicetype='" + devicetype + '\'' +
                ", addTime=" + addTime +
                ", desc='" + description + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", productKey='" + productKey + '\'' +
                ", deviceSecret='" + deviceSecret + '\'' +
                ", regionId='" + regionId + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", altitude=" + altitude +
                '}';
    }
}
