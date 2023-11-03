package com.example.entity;

import com.example.common.PersistenceEntity;
import com.example.dto.BookRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book extends PersistenceEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 Long id;
	 String title;
	 String description;
	 String genre;
	 double price;
	
	 public Book (BookRequestDTO add) {
		 this.title = add.title;
		 this.description = add.description;
		 this.genre = add.genre;
		 this.price = add.price;
	 }
	
	@ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
