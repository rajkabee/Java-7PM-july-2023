package com.example.book.model;

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
	String title;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "description")
	String description;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "genre")
	String genre;

	@Pattern(regexp = "\\d+", message = "invalid price!")
	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "price")
	double price;

}
