package com.sena.dms.spring.model.data;

import java.io.Serializable;

public class ProfessionalData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String profession_code;
	private String profession_name;
	private String profession_web_name;

	public String getProfession_code() {
		return profession_code;
	}

	public void setProfession_code(String profession_code) {
		this.profession_code = profession_code;
	}

	public String getProfession_name() {
		return profession_name;
	}

	public void setProfession_name(String profession_name) {
		this.profession_name = profession_name;
	}

	public String getProfession_web_name() {
		return profession_web_name;
	}

	public void setProfession_web_name(String profession_web_name) {
		this.profession_web_name = profession_web_name;
	}

}
