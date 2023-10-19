package com.example.spring.addresses.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.addresses.model.Address;
import com.example.spring.addresses.model.AddressRequestDTO;
import com.example.spring.addresses.model.AddressResponseDTO;
import com.example.spring.addresses.repositories.AddressRepository;
import com.example.spring.addresses.services.AddressService;
import com.example.spring.common.MyApiResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/addresses")
public class AddressController {
	
	Logger logger = LoggerFactory.getLogger(AddressController.class);
	
	@Autowired
	AddressService addressService;
	
	@GetMapping("")
	public MyApiResponse getAddresses(){
		MyApiResponse resp = new MyApiResponse();
		List<AddressResponseDTO> addresses = addressService.getAll();
		resp.setResponseStatus("SUCCESS");
		resp.setDescription("List of addresses");
		resp.setData(addresses);
		return resp;
	}
	
	@PostMapping("")
	public MyApiResponse addAddresses(@Valid @RequestBody AddressRequestDTO addressDto){
		MyApiResponse resp = new MyApiResponse();
		logger.info(addressDto.toString());
		try {
			Address address = new Address(addressDto);
			address = addressService.persist(address);
			resp.setResponseStatus("SUCCESS");
			resp.setDescription("address saved to the database!");
			resp.setData(address);
		}catch (Exception e) {
			logger.error(e.getMessage());
			resp.setResponseStatus("Failure");
			resp.setDescription("address could not be saved to the database!");
		}
		return resp;
	}
}
