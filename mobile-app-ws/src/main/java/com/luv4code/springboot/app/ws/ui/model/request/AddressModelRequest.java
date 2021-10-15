package com.luv4code.springboot.app.ws.ui.model.request;

import lombok.Data;

@Data
public class AddressModelRequest {

	private String city;
	private String country;
	private String streetName;
	private String postalCode;
	private String type;

}
