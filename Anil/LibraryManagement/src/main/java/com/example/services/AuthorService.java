package com.example.services;

import java.util.List;

import com.example.dto.AuthorResponseDTO;
import com.example.entity.Author;


public interface AuthorService {

	List<AuthorResponseDTO> getAll();

	Author persist(Author author);
}
