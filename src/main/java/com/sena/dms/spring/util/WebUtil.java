package com.sena.dms.spring.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.sena.dms.spring.model.data.ErrorInfoData;
import com.sena.dms.spring.model.data.UserSession;

public class WebUtil {

	private static final Logger logger = LoggerFactory.getLogger(WebUtil.class);

	public static UserSession getUserSession(HttpServletRequest request) {
		logger.info(">>> Getting User Session Details from Http Session  >>>");
		HttpSession httpSession = request.getSession();
		logger.info(">>> Session Creation time  >>>" + httpSession.getCreationTime());
		UserSession userSession = (UserSession) httpSession.getAttribute("userSession");
		if (userSession == null) {
			logger.info(">>> Creating the new User Session  >>>");
			userSession = new UserSession();

		}
		httpSession.setAttribute("userSession", userSession);
		return userSession;
	}

	public static void setSessionTimout(HttpServletRequest request) {
		logger.info(">>> Setting Session Time Out Value to User Session >>>");
		HttpSession httpSession = request.getSession();
		// setting session to expiry in 20 mins
		httpSession.setMaxInactiveInterval(20 * 60);
	}

	public static void invalidateSession(HttpServletRequest request) {
		logger.info(">>> invalidateSession >>>");
		HttpSession httpSession = request.getSession();
		httpSession.invalidate();
	}

	public static ErrorInfoData prepareErrorInfoData(BindingResult result) {
		ErrorInfoData errorInfoData = new ErrorInfoData();
		if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			if (errors != null) {
				for (ObjectError error : errors) {
					errorInfoData.addErrorInfo(error.getDefaultMessage());
				}
			}
		}
		return errorInfoData;
	}

}
