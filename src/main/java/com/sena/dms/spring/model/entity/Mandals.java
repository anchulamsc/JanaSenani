package com.sena.dms.spring.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "mandals")
@IdClass(MandalsPK.class)
public class Mandals extends AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "state_code")
	private String state_code;

	@Id
	@Column(name = "district_code")
	private String district_code;

	@Id
	@Column(name = "mandal_code")
	private String mandal_code;

	@Column(name = "mandal_name")
	private String mandal_name;

	@Column(name = "mandal_web_name")
	private String mandal_web_name;

	@Column(name = "inserted_timestamp")
	private Timestamp inserted_timestamp;

	@Column(name = "updated_timestamp")
	private Timestamp updated_timestamp;

	@Column(name = "sequence_num")
	private String sequence_num;

	public String getState_code() {
		return state_code;
	}

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	public String getDistrict_code() {
		return district_code;
	}

	public void setDistrict_code(String district_code) {
		this.district_code = district_code;
	}

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

	public Timestamp getInserted_timestamp() {
		return inserted_timestamp;
	}

	public void setInserted_timestamp(Timestamp inserted_timestamp) {
		this.inserted_timestamp = inserted_timestamp;
	}

	public Timestamp getUpdated_timestamp() {
		return updated_timestamp;
	}

	public void setUpdated_timestamp(Timestamp updated_timestamp) {
		this.updated_timestamp = updated_timestamp;
	}

	public String getSequence_num() {
		return sequence_num;
	}

	public void setSequence_num(String sequence_num) {
		this.sequence_num = sequence_num;
	}

}
