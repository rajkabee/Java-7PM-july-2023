package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/user")
	public String user() {
		return "user.html";
	}
	@GetMapping("/admin")
	public String admin() {
		return "admin.html";
	}
	@ResponseBody
	@GetMapping("/createUsers")
	public String cretaeUsers() {
		User user = new User(0, "user",passwordEncoder.encode("password"), true, true,true,true,"ROLE_USER");
		User admin = new User(0, "admin",passwordEncoder.encode("password"), true, true,true,true,"ROLE_ADMIN");
		userRepo.save(user);
		userRepo.save(admin);
		return "Users Created!!!";
	}
}
