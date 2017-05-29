package com.sena.dms.spring.model.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StatesData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String state_code;
	private String state_name;
	private String state_web_name;

	private List<DistrictsData> districtsInfos = new ArrayList<DistrictsData>();

	public String getState_code() {
		return state_code;
	}

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	public String getState_web_name() {
		return state_web_name;
	}

	public void setState_web_name(String state_web_name) {
		this.state_web_name = state_web_name;
	}

	public List<DistrictsData> getDistrictsInfos() {
		return districtsInfos;
	}

	public void setDistrictsInfos(List<DistrictsData> districtsInfos) {
		this.districtsInfos = districtsInfos;
	}

}
