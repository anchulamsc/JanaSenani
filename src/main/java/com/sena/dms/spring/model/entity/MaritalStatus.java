package com.sena.dms.spring.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marital_status")
public class MaritalStatus extends AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "marital_status_code")
	private String marital_status_code;

	@Column(name = "marital_status_name")
	private String marital_status_name;

	@Column(name = "marital_status_web_name")
	private String marital_status_web_name;

	@Column(name = "inserted_timestamp")
	private Timestamp inserted_timestamp;

	@Column(name = "updated_timestamp")
	private Timestamp updated_timestamp;

	@Column(name = "sequence_num")
	private String sequence_num;

	public String getMarital_status_code() {
		return marital_status_code;
	}

	public void setMarital_status_code(String marital_status_code) {
		this.marital_status_code = marital_status_code;
	}

	public String getMarital_status_name() {
		return marital_status_name;
	}

	public void setMarital_status_name(String marital_status_name) {
		this.marital_status_name = marital_status_name;
	}

	public String getMarital_status_web_name() {
		return marital_status_web_name;
	}

	public void setMarital_status_web_name(String marital_status_web_name) {
		this.marital_status_web_name = marital_status_web_name;
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
