package com.example.author.service;

import java.util.List;


import com.example.author.model.Author;
import com.example.author.model.AuthorResponseDTO;


public interface AuthorService {

	List<AuthorResponseDTO> getAll();

	Author persist(Author author);
}
