package com.pengping.iothub.util;

public class CommonException extends RuntimeException{

    private String errorCode;
    private String msg;

    public CommonException(String message) {
        super(message);
    }

    public CommonException(String errorCode, String msg) {
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}