package com.sena.dms.spring.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "states")
public class States extends AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "state_code")
	private String state_code;

	@Column(name = "state_name")
	private String state_name;

	@Column(name = "state_web_name")
	private String state_web_name;

	@Column(name = "inserted_timestamp")
	private Timestamp inserted_timestamp;

	@Column(name = "updated_timestamp")
	private Timestamp updated_timestamp;

	@Column(name = "sequence_num")
	private String sequence_num;

	@Transient
	private List<Districts> districts = new ArrayList<Districts>();

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

	public List<Districts> getDistricts() {
		return districts;
	}

	public void setDistricts(List<Districts> districts) {
		this.districts = districts;
	}

}
