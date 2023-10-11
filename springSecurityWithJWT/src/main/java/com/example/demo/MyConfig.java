package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
@Configuration
public class MyConfig {

	
//	@Bean
//	SecurityFilterChain web(HttpSecurity http) throws Exception {
//		http.authorizeHttpRequests(
//				request->{
//					request.requestMatchers("/admin").hasRole("ADMIN")
//							.requestMatchers("/user").hasAnyRole("USER","ADMIN")
//							.requestMatchers("/").permitAll()
//							.anyRequest()
//							.authenticated();
//				}
//				).formLogin();
//		return http.build();
//	}
	
	@Bean
	UserDetailsManager userDetailsService() {
		UserDetails user = User.builder().username("user").password("password").roles("USER").build();
		UserDetails admin = User.builder().username("admin").password("password").roles("ADMIN").build();
		return new InMemoryUserDetailsManager(user, admin);
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	@Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}
