package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.ResponseDto;
import com.example.demo.model.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public Optional<User> getUserById(int id);

	public ResponseDto getUserPolicyById(int userId);

}
