package com.androidmov.metadata.common;

/**
 * @description: 统一响应结果类
 * @author: 卡卢比
 * @date: 2018-05-12 12:04
 **/
public class BackData<T> {
    /**响应代码*/
    private Integer code = BackStatus.SUCCESS.getCode();
    /**响应消息提示*/
    private String msg = BackStatus.SUCCESS.getMsg();
    /**响应数据*/
    private T data;

    public Integer getCode() {
        return code;
    }

    public BackData<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public BackData<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public BackData<T> setData(T data) {
        this.data = data;
        return this;
    }

}
