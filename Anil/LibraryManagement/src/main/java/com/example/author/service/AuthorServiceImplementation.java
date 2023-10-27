package com.example.author.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.author.model.Author;
import com.example.author.model.AuthorResponseDTO;
import com.example.author.repositories.AuthorRepositories;

@Service
public class AuthorServiceImplementation implements AuthorService {

	@Autowired
	AuthorRepositories authorRepo;
	
	
	@Override
	public List<AuthorResponseDTO> getAll() {
		return  authorRepo.findAllName();
	}

	@Override
	public Author persist(Author author) {
		
		return authorRepo.save(author);
	}

}
