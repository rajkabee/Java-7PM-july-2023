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
import com.example.dto.AuthorRequestDTO;
import com.example.dto.AuthorResponseDTO;
import com.example.entity.Author;
import com.example.services.AuthorService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {
	Logger logger = LoggerFactory.getLogger(AuthorController.class);
	
	@Autowired
	AuthorService authorService;
	

	@GetMapping("")
	public ApiResponse getAuthor(){
		ApiResponse  resp = new ApiResponse();
		List<AuthorResponseDTO> authors = authorService.getAll();
		resp.setResponseStatus("SUCCESS");
		resp.setDescription("List of authors");
		resp.setData(authors);
		return resp;
	}
	
	@PostMapping("")
	public ApiResponse addAuthor(@Valid @RequestBody AuthorRequestDTO authorDto){
		ApiResponse resp = new ApiResponse();
		logger.info(authorDto.toString());
		try {
			Author author = new Author(authorDto);
			author = authorService.persist(author);
			resp.setResponseStatus("SUCCESS");
			resp.setDescription("Author saved to the database!");
			resp.setData(author);
		}catch (Exception e) {
			logger.error(e.getMessage());
			resp.setResponseStatus("Failure");
			resp.setDescription("Author could not be saved to the database!");
		}
		return resp;
	}


}
