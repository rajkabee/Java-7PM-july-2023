package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping
	public String hello() {
		return "hi, this is client 2.";
	}
	
	@GetMapping("/helloClient1")
	public String helloClient1(){
		return restTemplate.getForObject("http://client1", String.class);
	}
	
}
