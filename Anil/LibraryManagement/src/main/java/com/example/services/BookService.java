package com.example.services;

import java.util.List;

import com.example.dto.BookResponseDTO;
import com.example.entity.Book;


public interface BookService {

	List<BookResponseDTO> getAll();

	Book persist(Book book);
}
