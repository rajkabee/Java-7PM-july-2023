package com.example.services;

import com.example.dto.UserRequestDTO;
import com.example.entity.User;

public interface UserService {

	User save(UserRequestDTO userRequest);

}
