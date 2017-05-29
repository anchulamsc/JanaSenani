package com.sena.dms.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.sena.dms.spring.model.entity.Districts;
import com.sena.dms.spring.model.entity.Gender;
import com.sena.dms.spring.model.entity.Mandals;
import com.sena.dms.spring.model.entity.MaritalStatus;
import com.sena.dms.spring.model.entity.Profession;
import com.sena.dms.spring.model.entity.Qualification;
import com.sena.dms.spring.model.entity.States;

@Repository
public class DataDisplayDAOImpl implements DataDisplayDAO {

	private static final Logger logger = LoggerFactory.getLogger(DataDisplayDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public Session openSession() {
		return this.sessionFactory.openSession();
	}

	public void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<States> fetchStatesData() {
		Session session = null;
		List<States> listofStates = null;
		List<Districts> listOfDistricts = null;
		try {
			session = openSession();
			listofStates = session.createQuery("from States").list();
			if (listofStates != null && !listofStates.isEmpty()) {
				for (States states : listofStates) {
					String districtsQueryString = "from Districts where state_code = :state_code";
					Query districtsQuery = session.createQuery(districtsQueryString);
					districtsQuery.setString("state_code", states.getState_code());
					listOfDistricts = new ArrayList<Districts>();
					listOfDistricts.addAll(districtsQuery.list());
					if (listOfDistricts != null && !listOfDistricts.isEmpty()) {
						states.setDistricts(listOfDistricts);
					}
				}
			}
		} finally {
			closeSession(session);
		}
		return listofStates;
	}

	@SuppressWarnings("unchecked")
	public List<Mandals> fetchMandalsData(String stateCode, String districtCode) {
		Session session = null;
		List<Mandals> listOfMandals = null;
		try {
			session = openSession();
			String mandalsQueryString = "from Mandals where state_code = :state_code and district_code = :district_code";
			Query mandalsQuery = session.createQuery(mandalsQueryString);
			mandalsQuery.setString("state_code", stateCode);
			mandalsQuery.setString("district_code", districtCode);
			listOfMandals = mandalsQuery.list();
		} finally {
			closeSession(session);
		}
		return listOfMandals;
	}

	@SuppressWarnings("unchecked")
	public List<Gender> fetchGenderData() {
		Session session = null;
		List<Gender> listofGenders = null;
		try {
			session = openSession();
			listofGenders = session.createQuery("from Gender").list();
		} finally {
			closeSession(session);
		}
		return listofGenders;

	}

	@SuppressWarnings("unchecked")
	public List<MaritalStatus> fetchMaritalStatusData() {
		Session session = null;
		List<MaritalStatus> listofMaritalStatuses = null;
		try {
			session = openSession();
			listofMaritalStatuses = session.createQuery("from MaritalStatus").list();
		} finally {
			closeSession(session);
		}
		return listofMaritalStatuses;

	}

	@SuppressWarnings("unchecked")
	public List<Qualification> fetchQualificationData() {
		Session session = null;
		List<Qualification> listofQualifications = null;
		try {
			session = openSession();
			listofQualifications = session.createQuery("from Qualification").list();
		} finally {
			closeSession(session);
		}
		return listofQualifications;

	}

	@SuppressWarnings("unchecked")
	public List<Profession> fetchProfessionData() {
		Session session = null;
		List<Profession> listofProfessions = null;
		try {
			session = openSession();
			listofProfessions = session.createQuery("from Profession").list();
		} finally {
			closeSession(session);
		}
		return listofProfessions;

	}

}
