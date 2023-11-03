package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.ApiResponse;
import com.example.dto.BookRequestDTO;
import com.example.dto.BookResponseDTO;
import com.example.entity.Book;
import com.example.services.BookService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/v1/books")
public class BookController {
	Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired 
	BookService bookService;
	
	@GetMapping("")
	public ApiResponse getAddresses(){
		ApiResponse  resp = new ApiResponse();
		List<BookResponseDTO> books = bookService.getAll();
		resp.setResponseStatus("SUCCESS");
		resp.setDescription("List of books");
		resp.setData(books);
		return resp;
	}
	
	@PostMapping("")
	public ApiResponse addAddresses(@Valid @RequestBody BookRequestDTO bookDto){
		ApiResponse resp = new ApiResponse();
		logger.info(bookDto.toString());
		try {
			Book book = new Book(bookDto);
			book = bookService.persist(book);
			resp.setResponseStatus("SUCCESS");
			resp.setDescription("Book saved to the database!");
			resp.setData(book);
		}catch (Exception e) {
			logger.error(e.getMessage());
			resp.setResponseStatus("Failure");
			resp.setDescription("Book could not be saved to the database!");
		}
		return resp;
	}

}
