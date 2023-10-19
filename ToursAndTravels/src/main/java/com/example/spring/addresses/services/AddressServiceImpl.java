package com.example.spring.addresses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.addresses.model.Address;
import com.example.spring.addresses.model.AddressResponseDTO;
import com.example.spring.addresses.repositories.AddressRepository;
@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	AddressRepository addressRepo;
	
	@Override
	public List<AddressResponseDTO> getAll() {
		
		return addressRepo.findAllAddress();
	}

	@Override
	public Address persist(Address address) {
		return addressRepo.save(address);
	}

}
