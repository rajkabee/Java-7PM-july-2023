package com.example.spring.blogs;

import java.util.List;

import com.example.spring.comments.Comment;
import com.example.spring.common.PersistenceEntity;
import com.example.spring.common.services.StringListConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name="blogs")
public class Blog extends PersistenceEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	Long id;
	
	@Column(name="title")
	String title;
	
	@Convert(converter = StringListConverter.class)
	@Column(name="description")
	List<String> description;
	
	@OneToMany
	List<Comment> comments;
	
	@Convert(converter = StringListConverter.class)
	@Column(name="image_url")
	List<String> imageUrl;
}
