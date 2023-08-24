package com.example.springMVC;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springMVC.model.entity.Course;
import com.example.springMVC.model.entity.CourseRepository;

@Controller
public class CourseController {
	
	@Autowired
	CourseRepository courseRepo;
	
	@GetMapping("")
	public String courses(Model model) {
		ArrayList<Course> courses = (ArrayList<Course>)courseRepo.findAll();
		model.addAttribute("courses", courses);
		return "courses";
	}
	
	@GetMapping(value="/addCourse")
	public String addCourse() {
		return "newCourseForm";
	}
	
//	@PostMapping(value="/addCourse")
//	public String addCourse(
//			@RequestBody Course course
//			) {
//		courseRepo.save(course);
//		return "courses";
//	}
	@PostMapping(value="/addCourse")
	public String addCourse(
			@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("price") float price
			) {
		Course course = new Course(title, description, price);
		courseRepo.save(course);
		return "redirect:/";
	}
	
	@GetMapping("/updateCourse/{id}")
	public String updateCourse(@PathVariable("id") int id, Model model) {
		Optional<Course> course = courseRepo.findById(id);
		if(course.isEmpty()) {
			return "redirect:/";
		}
		else {
			model.addAttribute("course", course.get());
			return "courseUpdateForm";
		}
	}
	
	@PostMapping("/updateCourse")
	public String updateCourse(@ModelAttribute Course course) {
		//System.out.println(course);
		this.courseRepo.save(course);
		return "redirect:/";
	}
	
	@ResponseBody
	@PostMapping("/deleteCourse/{id}")
	public String deleteCourse(@PathVariable("id") int id) {
		this.courseRepo.delete(this.courseRepo.findById(id).get());
		return "done";
	}

}
