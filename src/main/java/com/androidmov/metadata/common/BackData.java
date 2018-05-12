package com.androidmov.metadata.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @description: 统一响应结果类
 * @author: 卡卢比
 * @date: 2018-05-12 12:04
 **/
@ApiModel("统一响应")
public class BackData<T> {
    @ApiModelProperty("响应代码(1=成功，-1=失败)")
    private Integer code = BackStatusEnum.SUCCESS.getCode();
    @ApiModelProperty("响应消息提示")
    private String msg = BackStatusEnum.SUCCESS.getMsg();
    @ApiModelProperty("响应数据")
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
