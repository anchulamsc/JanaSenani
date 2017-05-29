package com.sena.dms.spring.model.data;

import java.io.Serializable;

public class QualificationData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String qualification_code;
	private String qualification_name;
	private String qualification_web_name;

	public String getQualification_code() {
		return qualification_code;
	}

	public void setQualification_code(String qualification_code) {
		this.qualification_code = qualification_code;
	}

	public String getQualification_name() {
		return qualification_name;
	}

	public void setQualification_name(String qualification_name) {
		this.qualification_name = qualification_name;
	}

	public String getQualification_web_name() {
		return qualification_web_name;
	}

	public void setQualification_web_name(String qualification_web_name) {
		this.qualification_web_name = qualification_web_name;
	}

}
