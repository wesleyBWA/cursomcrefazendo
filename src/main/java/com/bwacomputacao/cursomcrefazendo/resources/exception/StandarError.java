package com.bwacomputacao.cursomcrefazendo.resources.exception;

import java.io.Serializable;

public class StandarError implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public StandarError(Integer status, String msg, long timeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}
	private Integer status;
	private String msg;
	private long timeStamp;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
