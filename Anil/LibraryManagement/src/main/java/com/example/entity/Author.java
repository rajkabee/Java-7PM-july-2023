package com.example.entity;

import java.util.List;

import com.example.common.PersistenceEntity;
import com.example.dto.AuthorRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
		
	
}}
