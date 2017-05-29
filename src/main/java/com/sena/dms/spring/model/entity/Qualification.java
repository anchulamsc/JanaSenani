package com.sena.dms.spring.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "qualification")
public class Qualification extends AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "qualification_code")
	private String qualification_code;

	@Column(name = "qualification_name")
	private String qualification_name;

	@Column(name = "qualification_web_name")
	private String qualification_web_name;

	@Column(name = "inserted_timestamp")
	private Timestamp inserted_timestamp;

	@Column(name = "updated_timestamp")
	private Timestamp updated_timestamp;

	@Column(name = "sequence_num")
	private String sequence_num;

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
