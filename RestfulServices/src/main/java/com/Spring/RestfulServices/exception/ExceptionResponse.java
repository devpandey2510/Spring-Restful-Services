package com.Spring.RestfulServices.exception;

public class ExceptionResponse {

	private String errMsg;
	private String errUrl;
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrUrl() {
		return errUrl;
	}
	public void setErrUrl(String errUrl) {
		this.errUrl = errUrl;
	}
}
