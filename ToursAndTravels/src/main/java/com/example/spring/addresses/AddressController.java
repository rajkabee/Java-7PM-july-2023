package com.example.spring.addresses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.common.MyApiResponse;

@RestController
@RequestMapping("/addresses")
public class AddressController {
	
	@Autowired
	AddressRepository addressRepo;
	
	@GetMapping("")
	public MyApiResponse getAddresses(){
		MyApiResponse resp = new MyApiResponse();
		List<Address> addresses = addressRepo.findAll();
		resp.setResponseStatus("SUCCESS");
		resp.setDescription("List od addresses");
		resp.setData(addresses);
		return resp;
	}
}
