/*
 * Copyright © Foremost Insurance 2010

 * All Rights Reserved
 *
 * Foremost NSS Application.
 *
 * Created:  Dec 16, 2010 3:08:29 PM
 * Author:   usw4w72
 * Project:  nssEJB
 *
 * $LastChangedBy$ usw4w72
 * $LastChangedRevision$
 * $LastChangedDate$ Dec 15, 2010 11:08:29 AM
 */
package com.sena.dms.spring.data.util;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sena.dms.spring.model.data.RegistrationInfo;
import com.sena.dms.spring.model.entity.PersonalDetails;
import com.sena.dms.spring.model.entity.RegistrationDetails;
import com.sena.dms.spring.model.entity.Users;
import com.sena.dms.spring.util.DateUtil;

/**
 * 
 * @author venkat
 *
 */
public class DataTransformationUtil {

	private static final Logger logger = LoggerFactory.getLogger(DataTransformationUtil.class);

	public static Users prepareRegistrationUsersBusinessData(RegistrationInfo registrationInfo) {
		Users users = new Users();

		RegistrationDetails registrationDetails = new RegistrationDetails();
		List<PersonalDetails> personalDetailsList = new ArrayList<PersonalDetails>();
		PersonalDetails personalDetails = new PersonalDetails();

		users.setUser_name(registrationInfo.getUser_name());
		users.setPassword(registrationInfo.getPassword());
		users.setMobile_num(registrationInfo.getMobile_num());

		registrationDetails.setFirst_name(registrationInfo.getFirst_name());
		registrationDetails.setLast_name(registrationInfo.getLast_name());
		if (registrationInfo.getBirth_date() != null && DateUtil.isValidDate(registrationInfo.getBirth_date())) {
			registrationDetails.setBirth_date(DateUtil.convertStringToDate(registrationInfo.getBirth_date()));
		}
		registrationDetails.setGender(registrationInfo.getGender());
		registrationDetails.setMarital_status(registrationInfo.getMarital_status());

		personalDetailsList.add(personalDetails);
		registrationDetails.setPersonalDetails(personalDetailsList);
		users.setRegistrationDetails(registrationDetails);
		return users;

	}

	public static Users prepareLoginUsersBusinessData(RegistrationInfo registrationInfo) {
		Users users = new Users();
		users.setUser_name(registrationInfo.getUser_name());
		users.setPassword(registrationInfo.getPassword());
		return users;

	}

}