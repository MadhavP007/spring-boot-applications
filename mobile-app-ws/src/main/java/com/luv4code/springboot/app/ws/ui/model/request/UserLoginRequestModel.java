package com.luv4code.springboot.app.ws.ui.model.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserLoginRequestModel {
	private String email;
	private String password;
}
