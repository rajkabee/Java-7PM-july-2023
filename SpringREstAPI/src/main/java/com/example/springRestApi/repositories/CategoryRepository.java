package com.example.springRestApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.springRestApi.entity.Category;
@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
