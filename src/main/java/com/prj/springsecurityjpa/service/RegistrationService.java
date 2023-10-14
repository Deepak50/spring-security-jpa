package com.prj.springsecurityjpa.service;

import com.prj.springsecurityjpa.dto.UserDto;

public interface RegistrationService {
	public void createUser(UserDto userDto);
}
