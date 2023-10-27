package com.example.author.model;

import com.example.common.PersistenceEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Author extends PersistenceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	String name;
	String nationality;

	 public Author (AuthorRequestDTO add) {
		 this.name = add.name;
		 this.nationality = add.nationality;
		
		
//	 @OneToMany(mappedBy = "author")
//	    private List<Book> books;
//	
}}
