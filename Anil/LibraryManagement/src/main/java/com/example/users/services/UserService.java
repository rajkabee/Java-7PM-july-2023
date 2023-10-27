package com.example.users.services;

import com.example.users.model.User;
import com.example.users.model.UserRequestDTO;

public interface UserService {

	User save(UserRequestDTO userRequest);

}
