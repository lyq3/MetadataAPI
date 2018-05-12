package com.androidmov.metadata.common;

/**
 * @description: 统一响应状态枚举
 * @author: 卡卢比
 * @date: 2018-05-12 12:47
 **/
public enum  BackStatus {
    SUCCESS(1, "SUCCESS"),
    ERROR(-1, "ERROR"),
    UNKNOWN(0, "UNKNOWN");

    private int code;
    private String msg;

    BackStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public BackStatus setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public BackStatus setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
