package com.prj.springsecurityjpa.repoImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prj.springsecurityjpa.dto.UserDto;
import com.prj.springsecurityjpa.entity.User;
import com.prj.springsecurityjpa.repo.RegistrationRepo;
import com.prj.springsecurityjpa.repo.UserRepository;

@Repository
public class RegistrationRepoImpl implements RegistrationRepo {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public void createUser(UserDto userDto) {
		userRepository.save(modelMapper.map(userDto, User.class));
	}

}
