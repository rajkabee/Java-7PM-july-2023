package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/user")
	public String user() {
		return "user.html";
	}
	@GetMapping("/admin")
	public String admin() {
		return "admin.html";
	}
}
