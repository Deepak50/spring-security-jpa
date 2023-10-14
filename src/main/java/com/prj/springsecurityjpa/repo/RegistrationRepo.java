package com.prj.springsecurityjpa.repo;

import com.prj.springsecurityjpa.dto.UserDto;

public interface RegistrationRepo {
	public void createUser(UserDto userDto);
}
