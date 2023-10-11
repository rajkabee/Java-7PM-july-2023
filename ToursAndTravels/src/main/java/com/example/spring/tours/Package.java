package com.example.spring.tours;

import java.sql.Date;

import com.example.spring.common.PersistenceEntity;
import com.example.spring.destinations.Destination;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name="packages")
public class Package extends PersistenceEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	Long id;
	
	@Column(name="name")
	String name;
	
	@OneToOne
	Destination destination;
	
	@Column(name="duration_in_days")
	int durationDays;
	
	@Column(name="duration_in_nights")
	int durationNights;
	
	@Column(name="start_date")
	Date startDate;
	
	@Column(name="end_date")
	Date endDate;
	
	@Column(name="cost_per_person")
	Float costPerPerson;
	
	@Column(name="notes")
	String notes;
	
	
}
