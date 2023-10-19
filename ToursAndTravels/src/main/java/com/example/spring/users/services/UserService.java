package com.example.spring.users.services;

import com.example.spring.users.model.User;
import com.example.spring.users.model.UserRequestDTO;

public interface UserService {

	User save(UserRequestDTO userRequest);

}
