package com.pengping.iothub.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DeviceRegisterInfo {
    private String deviceIp;
    private String deviceName;
    private String devicetype;
    private String description;
    private String userName;
    private String password;
    private String productKey;
    private String deviceSecret;
    private String regionId;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private BigDecimal altitude;

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

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getAltitude() {
        return altitude;
    }

    public void setAltitude(BigDecimal altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "DeviceRegisterInfo{" +
                "deviceIp='" + deviceIp + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", devicetype='" + devicetype + '\'' +
                ", description='" + description + '\'' +
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
