package com.luv4code.springboot.app.ws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv4code.springboot.app.ws.io.entity.UserEntity;
import com.luv4code.springboot.app.ws.repository.UserRepository;
import com.luv4code.springboot.app.ws.service.UserService;
import com.luv4code.springboot.app.ws.shared.Utils;
import com.luv4code.springboot.app.ws.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private Utils utils;

	@Override
	public UserDto create(UserDto userDto) {

		if (userRepository.findByEmail(userDto.getEmail()) != null)
			throw new RuntimeException("Record Already Exists");

		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);

		String userId = utils.generateUserId(30);
		userEntity.setEncryptedPassword("test");
		userEntity.setUserId(userId);

		UserEntity storedUserDetails = userRepository.save(userEntity);

		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);

		return returnValue;
	}

}
