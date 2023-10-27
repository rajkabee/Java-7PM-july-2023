package com.example.author.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.validation.constraints.NotNull;

public class AuthorRequestDTO {
	
	
	@NotNull(message = "Author name cannot be null!")
	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "name")
	 String name;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "nationality")
	 String nationality;
	
}
