package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SpringSecurityIntroductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityIntroductionApplication.class, args);
	}
	

}
