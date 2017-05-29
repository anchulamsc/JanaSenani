package com.sena.dms.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sena.dms.spring.dao.DataDisplayDAO;
import com.sena.dms.spring.model.entity.Gender;
import com.sena.dms.spring.model.entity.Mandals;
import com.sena.dms.spring.model.entity.MaritalStatus;
import com.sena.dms.spring.model.entity.Profession;
import com.sena.dms.spring.model.entity.Qualification;
import com.sena.dms.spring.model.entity.States;

@Service
public class DataDisplayServiceImpl implements DataDisplayService {

	private static final Logger logger = LoggerFactory.getLogger(DataDisplayServiceImpl.class);

	private DataDisplayDAO dataDisplayDAO;

	@Autowired(required = true)
	@Qualifier(value = "dataDisplayDAO")
	public void setRegistrationDAO(DataDisplayDAO dataDisplayDAO) {
		this.dataDisplayDAO = dataDisplayDAO;
	}

	public List<States> fetchStatesData() {
		return dataDisplayDAO.fetchStatesData();
	}
	
	public List<Mandals> fetchMandalsData(String stateCode,String districtCode) {
		return dataDisplayDAO.fetchMandalsData(stateCode,districtCode);
	}

	public List<Gender> fetchGenderData() {
		return dataDisplayDAO.fetchGenderData();
	}

	public List<MaritalStatus> fetchMaritalStatusData() {
		return dataDisplayDAO.fetchMaritalStatusData();
	}

	public List<Qualification> fetchQualificationData() {
		return dataDisplayDAO.fetchQualificationData();
	}

	public List<Profession> fetchProfessionData() {
		return dataDisplayDAO.fetchProfessionData();
	}

}
