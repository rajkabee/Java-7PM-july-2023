package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/admin")
	public String admin() {
		return "This api is secured by JWT Authentication!";
	}
}
