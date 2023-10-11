package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.model.UserRequestDTO;
import com.example.demo.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User saveUser(UserRequestDTO userReq) {
		User user = new User(userReq);
		
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getUser(Long id) {
		return userRepo.findById(id);
	}

	@Override
	public User updateUserDetails(UserRequestDTO userReq, Long id) {
		User user = new User(userReq);
		user.setId(id);
		return userRepo.save(user);
	}

	@Override
	public int deleteUser(Long id) {
		Optional<User> user = userRepo.findById(id);
		if(!user.isEmpty()) {
			userRepo.delete(user.get());
			return 1;
		}
		return 0;
	}

}
