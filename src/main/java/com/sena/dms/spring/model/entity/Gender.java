package com.sena.dms.spring.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gender")
public class Gender extends AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "gender_code")
	private String gender_code;

	@Column(name = "gender_name")
	private String gender_name;

	@Column(name = "gender_web_name")
	private String gender_web_name;

	@Column(name = "inserted_timestamp")
	private Timestamp inserted_timestamp;

	@Column(name = "updated_timestamp")
	private Timestamp updated_timestamp;

	@Column(name = "sequence_num")
	private String sequence_num;

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
