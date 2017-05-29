package com.sena.dms.spring.model.data;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataDisplayInfoWrapper extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String status = "S";

	private List<StatesData> statesData = null;

	private List<MandalsData> mandalsData = null;

	private List<GenderData> gendersData = null;

	private List<MaritalStatusData> maritalStatusesData = null;

	private List<QualificationData> qualificationsData = null;

	private List<ProfessionalData> professionalsData = null;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<StatesData> getStatesData() {
		return statesData;
	}

	public void setStatesData(List<StatesData> statesData) {
		this.statesData = statesData;
	}

	public List<MandalsData> getMandalsData() {
		return mandalsData;
	}

	public void setMandalsData(List<MandalsData> mandalsData) {
		this.mandalsData = mandalsData;
	}

	public List<GenderData> getGendersData() {
		return gendersData;
	}

	public void setGendersData(List<GenderData> gendersData) {
		this.gendersData = gendersData;
	}

	public List<MaritalStatusData> getMaritalStatusesData() {
		return maritalStatusesData;
	}

	public void setMaritalStatusesData(List<MaritalStatusData> maritalStatusesData) {
		this.maritalStatusesData = maritalStatusesData;
	}

	public List<QualificationData> getQualificationsData() {
		return qualificationsData;
	}

	public void setQualificationsData(List<QualificationData> qualificationsData) {
		this.qualificationsData = qualificationsData;
	}

	public List<ProfessionalData> getProfessionalsData() {
		return professionalsData;
	}

	public void setProfessionalsData(List<ProfessionalData> professionalsData) {
		this.professionalsData = professionalsData;
	}

}
