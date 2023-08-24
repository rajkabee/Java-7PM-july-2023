package com.example.springMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springMVC.model.entity.Course;
import com.example.springMVC.model.entity.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseApi {
	
	@Autowired
	CourseRepository courseRepo;
	
	@GetMapping("")
	public List<Course> courses(){
		List<Course> courses = this.courseRepo.findAll();
		return courses;
	}
	@GetMapping("/{id}")
	public Course courses(@PathVariable("id") int id){
		Course course = this.courseRepo.findById(id).get();
		return course;
	}

}
