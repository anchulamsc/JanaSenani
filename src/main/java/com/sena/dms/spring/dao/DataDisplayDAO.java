package com.sena.dms.spring.dao;

import java.util.List;

import com.sena.dms.spring.model.entity.Gender;
import com.sena.dms.spring.model.entity.Mandals;
import com.sena.dms.spring.model.entity.MaritalStatus;
import com.sena.dms.spring.model.entity.Profession;
import com.sena.dms.spring.model.entity.Qualification;
import com.sena.dms.spring.model.entity.States;

public interface DataDisplayDAO {

	public List<States> fetchStatesData();

	public List<Mandals> fetchMandalsData(String stateCode,String districtCode);

	public List<Gender> fetchGenderData();

	public List<MaritalStatus> fetchMaritalStatusData();

	public List<Qualification> fetchQualificationData();

	public List<Profession> fetchProfessionData();

}
