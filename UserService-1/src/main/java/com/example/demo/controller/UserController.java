package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ResponseDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveuser")
	public User saveUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return user1;
	}

	@GetMapping("/getuser/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		Optional<User> user = userService.getUserById(id);
		return user;
	}
	
	@GetMapping("/getuserpolicy/{id}")
	public ResponseDto getUserPolicyById(@PathVariable("id") int userId) {
	ResponseDto responseDto= userService.getUserPolicyById(userId);
		return responseDto;
	}

}
