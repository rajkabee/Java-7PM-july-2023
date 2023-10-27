package com.example.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.users.model.User;
import com.example.users.repository.UserRepository;

@RestController
@RequestMapping("/api/v1")

public class MyController {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1>This is admin's page</h1>";
	}
	@GetMapping("/user")
	public String user() {
		return "<h1>This is user's page</h1>";
	}

	
	@GetMapping("/addusers")
	public String addUser() {
		userRepo.save(new User(0, "sanjay", passwordEncoder.encode("p@ssw0rd"), "ROLE_ADMIN", true));
		userRepo.save(new User(0, "mandip", passwordEncoder.encode("p@ssw0rd"), "ROLE_USER", true));
		return "Users created";
	}
}
