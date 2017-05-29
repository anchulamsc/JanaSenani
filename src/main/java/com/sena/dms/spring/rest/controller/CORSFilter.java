package com.sena.dms.spring.rest.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CORSFilter implements Filter {

	private static final Logger logger = LoggerFactory.getLogger(RegistrationRestController.class);

	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		logger.info(">>>>> doFilter >>>>");
		HttpServletRequest request = (HttpServletRequest) servletRequest;

		HttpServletResponse resp = (HttpServletResponse) servletResponse;
		resp.addHeader("Access-Control-Allow-Origin", "*");
		resp.addHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin,Origin, X-Requested-With, Content-Type, Accept,authorization");
		resp.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
		resp.addHeader("Access-Control-Allow-Credentials", "true");

		// Just ACCEPT and REPLY OK if OPTIONS
		if (request.getMethod().equals("OPTIONS")) {
			resp.setStatus(HttpServletResponse.SC_OK);
			return;
		}
		chain.doFilter(request, servletResponse);
	}

	public void destroy() {
	}
}
