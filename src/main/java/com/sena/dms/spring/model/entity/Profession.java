package com.sena.dms.spring.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profession")
public class Profession extends AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "profession_code")
	private String profession_code;

	@Column(name = "profession_name")
	private String profession_name;

	@Column(name = "profession_web_name")
	private String profession_web_name;

	@Column(name = "inserted_timestamp")
	private Timestamp inserted_timestamp;

	@Column(name = "updated_timestamp")
	private Timestamp updated_timestamp;

	@Column(name = "sequence_num")
	private String sequence_num;

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
