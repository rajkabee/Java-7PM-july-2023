package com.example.springRestApi.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
//@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="sku")
	private String sku;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="unit_price")
	private float unitPrice;	
	@Column(name="image_url")
	private String imageUrl;
	private boolean active;
	@Column(name="units_in_stock")
	private int unitsInStock;
	@Column(name="date_created")
	private Date dateCreated;
	@Column(name="last_updated")
	private Date lastUpdated;
	@ManyToOne
	private Category category;
}
