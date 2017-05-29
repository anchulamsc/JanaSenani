package com.sena.dms.spring.model.entity;

import java.io.Serializable;

public class ImageDetailsPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private String user_id;

	private String person_id;

	private String sequence_num;

	public ImageDetailsPK() {
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ImageDetailsPK)) {
			return false;
		}
		final ImageDetailsPK other = (ImageDetailsPK) obj;
		if (user_id != null ? !user_id.equals(other.user_id) : other.user_id != null)
			return false;
		if (person_id != null ? !person_id.equals(other.person_id) : other.person_id != null)
			return false;
		if (sequence_num != null ? !sequence_num.equals(other.sequence_num) : other.sequence_num != null)
			return false;
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		StringBuilder sb = new StringBuilder();
		sb.append(user_id);
		sb.append(person_id);
		sb.append(sequence_num);
		return sb.hashCode();
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPerson_id() {
		return person_id;
	}

	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}

	public String getSequence_num() {
		return sequence_num;
	}

	public void setSequence_num(String sequence_num) {
		this.sequence_num = sequence_num;
	}

}
