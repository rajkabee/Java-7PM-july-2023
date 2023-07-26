package com.example.j2se.hibernate;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name")
	private String name;

	@Column(name="product_description")
	private String description;

	@Column(name="product_price")
	private float price;

	public Product(String name, String description, float price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	
}
