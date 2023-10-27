package com.example.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.model.Book;
import com.example.book.model.BookResponseDTO;
import com.example.book.repositories.BookRepositories;


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
