package com.example.spring.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
