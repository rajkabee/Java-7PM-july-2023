package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.BookResponseDTO;
import com.example.entity.Book;
import com.example.repositories.BookRepositories;


@Service
public class BookServiceImplementation implements BookService{

	@Autowired
	BookRepositories bookRepo;
	
	
	@Override
	public List<BookResponseDTO> getAll() {
		// TODO Auto-generated method stub
		return  bookRepo.findAllBook();
	}

	@Override
	public Book persist(Book book) {
		
		return bookRepo.save(book);
	}

}
