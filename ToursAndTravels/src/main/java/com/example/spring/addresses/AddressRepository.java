package com.example.spring.addresses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
@Repository
@RepositoryRestResource
public interface AddressRepository extends JpaRepository<Address, Long>{

}
