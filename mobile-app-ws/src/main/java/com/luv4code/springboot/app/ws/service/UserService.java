package com.luv4code.springboot.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.luv4code.springboot.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto create(UserDto userDto);

	UserDto getUser(String email);

	UserDto getUserByUserId(String id);

	UserDto updateUser(String id, UserDto userDto);
}
