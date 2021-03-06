package com.sena.dms.spring.model.entity;

import java.io.Serializable;

public class DistrictsPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private String state_code;

	private String district_code;

	public DistrictsPK() {
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof DistrictsPK)) {
			return false;
		}
		final DistrictsPK other = (DistrictsPK) obj;
		if (state_code != null ? !state_code.equals(other.state_code) : other.state_code != null)
			return false;
		if (district_code != null ? !district_code.equals(other.district_code) : other.district_code != null)
			return false;
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		StringBuilder sb = new StringBuilder();
		sb.append(state_code);
		sb.append(district_code);
		return sb.hashCode();
	}

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

}
