package com.androidmov.metadata.common;

/**
 * @Description 业务异常的封装
 * @author 卡卢比
 */
@SuppressWarnings("serial")
public class BussinessException extends RuntimeException{

	private int code;
	
	private String msg;
	
	//业务异常跳转的页面
	private String urlPath;
	
	public BussinessException(BackStatusEnum backStatusEnum){
	    this.code = backStatusEnum.getCode();
	    this.msg = backStatusEnum.getMsg();
	}

	public BussinessException(int code , String msg){
	    this.code = code;
	    this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public BussinessException setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public BussinessException setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public BussinessException setUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }
}
