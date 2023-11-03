package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.dto.BookResponseDTO;
import com.example.entity.Book;

@Repository
@RepositoryRestResource
public interface BookRepositories extends JpaRepository<Book, Long> {

	BookResponseDTO findByTitle(String title);

	@Query(value = "select * from book", nativeQuery = true)
	List<BookResponseDTO> findAllBook();

}
