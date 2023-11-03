package com.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookRequestDTO {

	@NotNull(message = "Title cannot be null!")
	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "title")
	public
	String title;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "description")
	public
	String description;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "genre")
	public
	String genre;

	@Pattern(regexp = "\\d+", message = "invalid price!")
	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "price")
	public
	double price;

}
