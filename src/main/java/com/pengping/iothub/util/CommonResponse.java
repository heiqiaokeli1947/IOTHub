package com.pengping.iothub.util;

//https://www.cnblogs.com/dand/p/10178500.html
public class CommonResponse<T> {
    private String errCode;
    private String msg;
    private T data;

    public CommonResponse(String code, String msg, T data) {
        this.errCode = code;
        this.msg = msg;
        this.data = data;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}