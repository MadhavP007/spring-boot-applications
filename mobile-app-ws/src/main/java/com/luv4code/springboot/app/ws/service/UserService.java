package com.luv4code.springboot.app.ws.service;

import com.luv4code.springboot.app.ws.shared.dto.UserDto;

public interface UserService {
	UserDto create(UserDto userDto);
}
