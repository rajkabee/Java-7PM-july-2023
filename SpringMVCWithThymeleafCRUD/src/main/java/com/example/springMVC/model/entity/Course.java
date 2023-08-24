package com.example.springMVC.model.entity;

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

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="courses")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="course_id")
	int id;
	@Column(name="course_title")
	String title;
	@Column(name="course_description")
	String description;
	@Column(name="course_price")
	float price;
	public Course(String title, String description, float price) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
	}
	
	
}
