package com.endPointTech.springCore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component("post2")
public class Post {
	
	int userId;
	int id;
	String title;
	String body;
	@Autowired
	@Qualifier("comment2")
	Comment comment;
	@Value("${post.userId}")
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Value("${post.id}")
	public void setId(int id) {
		this.id = id;
	}
	@Value("${post.title}")
	public void setTitle(String title) {
		this.title = title;
	}
	@Value("${post.body}")
	public void setBody(String body) {
		this.body = body;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	@PostConstruct
	private void init() {
		System.err.println("Post bean instantiaied!");
	}
	@PreDestroy
	private void destroy() {
		System.out.println("Post bean destroyed!");
	}
	
	
}
