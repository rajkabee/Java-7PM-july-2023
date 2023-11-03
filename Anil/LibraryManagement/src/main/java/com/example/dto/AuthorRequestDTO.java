package com.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class AuthorRequestDTO {
	
	
	@NotNull(message = "Author name cannot be null!")
	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "name")
	public
	 String name;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "nationality")
	public
	 String nationality;
	
}
