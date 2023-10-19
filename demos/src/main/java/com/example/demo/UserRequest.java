package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class UserRequest {
	
	@JsonProperty("username")
	String username;
	
	@JsonProperty("password")
	String password;
	
}
