package com.sena.dms.spring.service;

import java.util.List;

import com.sena.dms.spring.model.data.ServiceResponse;
import com.sena.dms.spring.model.entity.Users;

public interface RegistrationService {

	public ServiceResponse enrollRegistrationDetails(Users users);

	public Users performUserLogin(Users users);

	public ServiceResponse emailVerification(String emailId, String verificationCode);
	
	public List<Users> fetchRegisteredUsers();

}
