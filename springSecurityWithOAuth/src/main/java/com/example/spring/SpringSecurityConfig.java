package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig{
	
	@Bean
	SecurityFilterChain web(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				request->{
					request
					.requestMatchers("/").permitAll()
					.anyRequest()
					.authenticated();
				}
				).oauth2Login();
		return http.build();
	}
	
	
	
}
