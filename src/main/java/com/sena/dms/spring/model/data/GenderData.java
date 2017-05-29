package com.sena.dms.spring.model.data;

import java.io.Serializable;

public class GenderData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String gender_code;
	private String gender_name;
	private String gender_web_name;

	public String getGender_code() {
		return gender_code;
	}

	public void setGender_code(String gender_code) {
		this.gender_code = gender_code;
	}

	public String getGender_name() {
		return gender_name;
	}

	public void setGender_name(String gender_name) {
		this.gender_name = gender_name;
	}

	public String getGender_web_name() {
		return gender_web_name;
	}

	public void setGender_web_name(String gender_web_name) {
		this.gender_web_name = gender_web_name;
	}

}
