package com.prj.springsecurityjpa.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prj.springsecurityjpa.dto.UserDto;
import com.prj.springsecurityjpa.repo.RegistrationRepo;
import com.prj.springsecurityjpa.service.RegistrationService;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	private RegistrationRepo registrationRepo;
	
	@Override
	public void createUser(UserDto userDto) {
		registrationRepo.createUser(userDto);
	}
}
