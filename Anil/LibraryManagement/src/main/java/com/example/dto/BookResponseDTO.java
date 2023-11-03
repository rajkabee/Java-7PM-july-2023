package com.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public interface BookResponseDTO {

	@JsonInclude(Include.NON_NULL)
	Long getId();
	
	@JsonInclude(Include.NON_NULL)
	String getTitle();
	
	@JsonInclude(Include.NON_NULL)
	String getDescription();
	
	@JsonInclude(Include.NON_NULL)
	String getGenre();
	
	@JsonInclude(Include.NON_NULL)
	double getPrice();
	
}
