package com.example.spring.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
