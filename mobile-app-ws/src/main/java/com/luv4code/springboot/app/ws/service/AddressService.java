package com.luv4code.springboot.app.ws.service;

import java.util.List;

import com.luv4code.springboot.app.ws.shared.dto.AddressDTO;

public interface AddressService {

	List<AddressDTO> getAddresses(String id);

	AddressDTO getAddress(String addressId);
	
}
