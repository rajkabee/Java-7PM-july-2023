package com.endPointTech.springCore;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component("comment1")
public class Comment {
	int userId;
	int id;
	String message;
}
