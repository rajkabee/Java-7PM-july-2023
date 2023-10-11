package com.example.demo.services;


import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;
import com.example.demo.model.UserRequestDTO;

public interface UserService {

	User saveUser(UserRequestDTO userReq);

	List<User> getAllUsers();

	Optional<User> getUser(Long id);

	User updateUserDetails(UserRequestDTO userReq, Long id);

	int deleteUser(Long id);

}
