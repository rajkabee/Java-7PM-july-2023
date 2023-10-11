package com.example.spring.addresses;

import com.example.spring.common.PersistenceEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="addresses")
public class Address extends PersistenceEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	Long id;
	
	@Column(name="country")
	String country;
	
	@Column(name="state")
	String state;
	
	@Column(name="city")
	String city;
	
	@Column(name="street")
	String street;
	
	@Column(name="house_number")
	String houseNumber;
}
