package com.sena.dms.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sena.dms.spring.dao.ContactUsDAO;

@Service
public class ContactUsServiceImpl implements ContactUsService {
	private static final Logger logger = LoggerFactory.getLogger(ContactUsServiceImpl.class);

	private ContactUsDAO contactUsDAO;

	@Autowired(required = true)
	@Qualifier(value = "contactUsDAO")
	public void setContactUsDAO(ContactUsDAO contactUsDAO) {
		this.contactUsDAO = contactUsDAO;
	}

}
