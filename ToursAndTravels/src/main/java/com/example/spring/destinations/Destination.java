package com.example.spring.destinations;

import java.util.List;

import com.example.spring.addresses.Address;
import com.example.spring.blogs.Blog;
import com.example.spring.common.PersistenceEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="destinations")
public class Destination extends PersistenceEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	Long id;
	
	@Column(name="name")
	String name;
	
	@OneToOne
	Address address;
	
	@OneToMany
	List<Destination> detours;
	
	@OneToOne
	Blog blog;
}
