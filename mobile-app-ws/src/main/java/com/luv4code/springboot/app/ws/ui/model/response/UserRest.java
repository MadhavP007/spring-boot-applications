package com.luv4code.springboot.app.ws.ui.model.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRest {

	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private List<AddressesRest> addresses;

}
