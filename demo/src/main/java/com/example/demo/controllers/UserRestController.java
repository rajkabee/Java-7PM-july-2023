package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserRequestDTO;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("")
	public User addUsers(@RequestBody UserRequestDTO userReq) {
		User user = userService.saveUser(userReq);
		return user;
	}
	@GetMapping("")
	public List<User> getUsers(){
		return userService.getAllUsers();
	}
	@GetMapping("/{id}")
	public Optional<User> getUser(@PathVariable("id") Long id){
		return userService.getUser(id);
	}
	@PatchMapping("/{id}")
	public User updateUsers(@RequestBody UserRequestDTO userReq, @PathVariable("id") Long id) {
		return userService.updateUserDetails(userReq, id);
	}
	@DeleteMapping("/{id}")
	public int deleteUsers(@PathVariable("id") Long id){
		return userService.deleteUser(id);
	}
	
	
	
	
}





