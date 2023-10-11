package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(req->{
						req.requestMatchers("/api/v1/admin").hasRole("ADMIN")
						.requestMatchers("/api/v1/user").hasAnyRole("USER", "ADMIN")
						.requestMatchers("/api/v1").permitAll()
						.anyRequest().authenticated();
		}).formLogin();
		
		return http.build();
	}
	
	@Bean
	public UserDetailsManager userDetailsManager() {
		UserDetails admin =  User.builder().username("admin").password("password").roles("ADMIN").build();
		UserDetails user =  User.builder().username("user").password("password").roles("USER").build();
		return new InMemoryUserDetailsManager(user, admin);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
