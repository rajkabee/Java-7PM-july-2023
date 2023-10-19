package com.example.spring.addresses.services;

import java.util.List;

import com.example.spring.addresses.model.Address;
import com.example.spring.addresses.model.AddressResponseDTO;

public interface AddressService {

	List<AddressResponseDTO> getAll();

	Address persist(Address address);

}
