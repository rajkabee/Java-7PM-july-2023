package com.example.spring.comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
