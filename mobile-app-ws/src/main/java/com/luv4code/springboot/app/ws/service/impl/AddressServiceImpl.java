package com.luv4code.springboot.app.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv4code.springboot.app.ws.io.entity.AddressEntity;
import com.luv4code.springboot.app.ws.io.entity.UserEntity;
import com.luv4code.springboot.app.ws.repository.AddressRepository;
import com.luv4code.springboot.app.ws.repository.UserRepository;
import com.luv4code.springboot.app.ws.service.AddressService;
import com.luv4code.springboot.app.ws.shared.dto.AddressDTO;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public List<AddressDTO> getAddresses(String id) {
		List<AddressDTO> returnValue = new ArrayList<>();
		ModelMapper modelMapper = new ModelMapper();

		UserEntity userEntity = userRepository.findByUserId(id);
		if (userEntity == null)
			return returnValue;

		Iterable<AddressEntity> addresses = addressRepository.findAllByUserDetails(userEntity);
		for (AddressEntity addressEntity : addresses) {
			returnValue.add(modelMapper.map(addressEntity, AddressDTO.class));
		}

		return returnValue;
	}

	@Override
	public AddressDTO getAddress(String addressId) {
		AddressDTO returnValue = null;

		AddressEntity addressEntity = addressRepository.findByAddressId(addressId);
		if (addressEntity != null)
			returnValue = new ModelMapper().map(addressEntity, AddressDTO.class);

		return returnValue;
	}

}
