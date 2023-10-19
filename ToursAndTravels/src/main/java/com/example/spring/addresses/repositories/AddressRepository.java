package com.example.spring.addresses.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.spring.addresses.model.Address;
import com.example.spring.addresses.model.AddressResponseDTO;
@Repository
@RepositoryRestResource
public interface AddressRepository extends JpaRepository<Address, Long>{
	
	AddressResponseDTO findByCountry(String country);
	@Query(value="select * from addresses" , nativeQuery = true)
	List<AddressResponseDTO> findAllAddress();
	
}
