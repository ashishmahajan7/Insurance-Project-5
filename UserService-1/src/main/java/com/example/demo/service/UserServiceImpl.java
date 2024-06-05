package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.PolicyDto;
import com.example.demo.model.ResponseDto;
import com.example.demo.model.User;
import com.example.demo.model.UserDto;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User saveUser(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

	@Override
	public Optional<User> getUserById(int id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}

	@Override
	public ResponseDto getUserPolicyById(int userId) {
		ResponseDto responseDto = new ResponseDto();

		User user = userRepository.findByUserId(userId);
		UserDto userDto = mapToUser(user);
		
		ResponseEntity<PolicyDto> responseEntity=restTemplate.getForEntity("http://localhost:8082/policy/getpolicy/"+user.getPolicyId(), PolicyDto.class);
		PolicyDto policyDto= responseEntity.getBody();
		
		responseDto.setUser(userDto);
		responseDto.setPolicy(policyDto);
		
		return responseDto;
	}

	private UserDto mapToUser(User user) {
		UserDto userDto = new UserDto();

		userDto.setUserId(user.getUserId());
		userDto.setfName(user.getfName());
		userDto.setlName(user.getlName());
		userDto.setAddress(user.getAddress());
		userDto.setMobileNumber(user.getMobileNumber());
		
		return userDto;
	}

}
