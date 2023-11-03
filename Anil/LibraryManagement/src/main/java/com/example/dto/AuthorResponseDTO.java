package com.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public interface AuthorResponseDTO {

	@JsonInclude(Include.NON_NULL)
	String getName();

	@JsonInclude(Include.NON_NULL)
	String getNationality();
}
