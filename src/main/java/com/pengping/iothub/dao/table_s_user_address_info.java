package com.pengping.iothub.dao;

import java.util.Date;

public class table_s_user_address_info {

    public String getUsedId() {
        return usedId;
    }

    public void setUsedId(String usedId) {
        this.usedId = usedId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private  String usedId;
    private  String id;
    private  String isDefault;
    private  Date addTime;
    private  String address;
    private  String reciver;
    private  String phone;
}
