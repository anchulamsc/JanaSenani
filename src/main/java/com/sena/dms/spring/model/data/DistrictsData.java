package com.sena.dms.spring.model.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DistrictsData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String district_code;
	private String district_name;
	private String district_web_name;

	private List<MandalsData> mandalsInfos = new ArrayList<MandalsData>();

	public String getDistrict_code() {
		return district_code;
	}

	public void setDistrict_code(String district_code) {
		this.district_code = district_code;
	}

	public String getDistrict_name() {
		return district_name;
	}

	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}

	public String getDistrict_web_name() {
		return district_web_name;
	}

	public void setDistrict_web_name(String district_web_name) {
		this.district_web_name = district_web_name;
	}

	public List<MandalsData> getMandalsInfos() {
		return mandalsInfos;
	}

	public void setMandalsInfos(List<MandalsData> mandalsInfos) {
		this.mandalsInfos = mandalsInfos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static Comparator<DistrictsData> DistrictsDataCompareByName = new Comparator<DistrictsData>() {
		public int compare(DistrictsData object1, DistrictsData object2) {
			String name1 = object1.getDistrict_web_name().toUpperCase();
			String name2 = object2.getDistrict_web_name().toUpperCase();
			return name1.compareTo(name2);
		}
	};

}
