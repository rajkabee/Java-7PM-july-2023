package com.example.springRestApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.springRestApi.entity.Product;
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long>{

}
