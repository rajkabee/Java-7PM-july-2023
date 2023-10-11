package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {
	@RequestMapping("/hello")
	public String hello() {
		return "hi, Welcome to spring REST API.";
	}
	
	@PostMapping("/hi")
	public String hello1(@RequestParam("name") String name) {
		return "hi "+name+", Welcome to spring REST API. using @RequestParam";
	}
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "hi "+name+", Welcome to spring REST API.";
	}
	
}
