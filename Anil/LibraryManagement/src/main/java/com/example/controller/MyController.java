package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.example.dto.UserRequestDTO;
import com.example.entity.User;
import com.example.repositories.UserRepository;

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
	
	 @GetMapping("/register")
	    public String showRegistrationForm(WebRequest request,Model model){
	        // create model object to store form data
	        UserRequestDTO user = new UserRequestDTO();
	        model.addAttribute("user", user);
	        return "register";
}}
