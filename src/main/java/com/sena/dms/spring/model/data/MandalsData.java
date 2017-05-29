package com.sena.dms.spring.model.data;

import java.io.Serializable;
import java.util.Comparator;

public class MandalsData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String mandal_code;
	private String mandal_name;
	private String mandal_web_name;

	public String getMandal_code() {
		return mandal_code;
	}

	public void setMandal_code(String mandal_code) {
		this.mandal_code = mandal_code;
	}

	public String getMandal_name() {
		return mandal_name;
	}

	public void setMandal_name(String mandal_name) {
		this.mandal_name = mandal_name;
	}

	public String getMandal_web_name() {
		return mandal_web_name;
	}

	public void setMandal_web_name(String mandal_web_name) {
		this.mandal_web_name = mandal_web_name;
	}

	public static Comparator<MandalsData> MandalsDataCompareByName = new Comparator<MandalsData>() {
		public int compare(MandalsData object1, MandalsData object2) {
			String name1 = object1.getMandal_web_name().toUpperCase();
			String name2 = object2.getMandal_web_name().toUpperCase();
			return name1.compareTo(name2);
		}
	};

}
