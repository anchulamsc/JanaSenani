package com.sena.dms.spring.model.data;

import java.io.Serializable;

public class MaritalStatusData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String marital_status_code;
	private String marital_status_name;
	private String marital_status_web_name;

	public String getMarital_status_code() {
		return marital_status_code;
	}

	public void setMarital_status_code(String marital_status_code) {
		this.marital_status_code = marital_status_code;
	}

	public String getMarital_status_name() {
		return marital_status_name;
	}

	public void setMarital_status_name(String marital_status_name) {
		this.marital_status_name = marital_status_name;
	}

	public String getMarital_status_web_name() {
		return marital_status_web_name;
	}

	public void setMarital_status_web_name(String marital_status_web_name) {
		this.marital_status_web_name = marital_status_web_name;
	}

}
