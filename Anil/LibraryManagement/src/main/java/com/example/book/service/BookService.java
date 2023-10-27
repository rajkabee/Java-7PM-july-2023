package com.example.book.service;

import java.util.List;

import com.example.book.model.Book;
import com.example.book.model.BookResponseDTO;


public interface BookService {

	List<BookResponseDTO> getAll();

	Book persist(Book book);
}
