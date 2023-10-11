package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO {
	@JsonProperty("user_id")
	@JsonInclude(value = Include.NON_NULL)
	Long id;
	@JsonProperty("user_name")
	@JsonInclude(value = Include.NON_NULL)
	String name;
	@JsonProperty("user_email")
	@JsonInclude(value = Include.NON_NULL)
	String email;
	@JsonProperty("user_password")
	@JsonInclude(value = Include.NON_NULL)
	String password;
}
