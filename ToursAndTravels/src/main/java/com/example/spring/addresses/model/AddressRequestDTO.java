package com.example.spring.addresses.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

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
public class AddressRequestDTO {
	@NotNull(message="Country cannot be null!")
	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "country")
	String country;	


	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "state")
	String state;	


	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "city")
	String city;
	

	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "street")
	String street;
	

	@Pattern(regexp = "\\d+", message="invalid house number!")
	@JsonInclude(Include.NON_NULL)
	@JsonProperty(value = "house_number")
	String houseNumber;
}
