package com.sena.dms.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sena.dms.spring.model.data.PersonalInfo;
import com.sena.dms.spring.service.ContactUsService;
import com.sena.dms.spring.util.EmailSenderUtil;
import com.sena.dms.spring.util.WebUtil;
import com.sena.dms.spring.validator.ContactInfoValidator;

@Controller
@RequestMapping("/contactus")
public class ContactUsController {
	private static final Logger logger = LoggerFactory.getLogger(ContactUsController.class);

	private ContactUsService contactUsService;

	@Autowired
	private ContactInfoValidator validator;

	@Autowired(required = true)
	@Qualifier(value = "contactUsService")
	public void setContactUsService(ContactUsService contactUsService) {
		this.contactUsService = contactUsService;
	}

	@RequestMapping(value = "/locadcontactus", method = RequestMethod.GET)
	public String loadContactUsPage(HttpServletRequest request, Model model) {
		logger.info(">>>>> loadContactUsPage >>>>");
		model.addAttribute("userSession", WebUtil.getUserSession(request));
		model.addAttribute("contactInfo", new PersonalInfo());
		return "contactus";
	}

	@RequestMapping(value = "/sendmessage", method = RequestMethod.POST)
	public String sendMessage(HttpServletRequest request, Model model, @ModelAttribute("contactInfo") PersonalInfo contactInfo, BindingResult result) {
		logger.info(">>>>> sendMessage >>>>");
		model.addAttribute("userSession", WebUtil.getUserSession(request));
		// Validation code
		validator.validate(contactInfo, result);

		// Check validation errors
		if (result.hasErrors()) {
			return "contactus";
		}

		EmailSenderUtil.sendMessage(contactInfo);

		return "home";
	}

}
