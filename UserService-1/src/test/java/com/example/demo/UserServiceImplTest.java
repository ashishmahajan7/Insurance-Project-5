package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.ResponseDto;
import com.example.demo.model.User;
import com.example.demo.model.UserDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserServiceImpl;



@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class UserServiceImplTest {
	
	@InjectMocks
	UserServiceImpl userServiceImpl;

	@Mock
	UserRepository userRepository;
	
	@org.junit.Test
	public void saveUser() {
		
		User user = new User(1, "Ashish", "Mahajan", LocalDate.of(1999, 9, 20), "College Road", "Nashik", 422010, 111122223333l, 8999458282l, "ashish123", "ashish@123", "ashish@gmail.com", 24, "male", LocalDate.now(), "1");
		
		when(userRepository.save(user)).thenReturn(user);
		assertEquals(user, userServiceImpl.saveUser(user));
	}
	
	
	
	@Test
	public void getUserByPolicyIdTest() {
		when(userRepository.findByUserId(1)).thenReturn(new User(1, "Ashish", "Mahajan", LocalDate.of(1999, 9, 20), "College Road", "Nashik", 422010, 111122223333l, 8999458282l, "ashish123", "ashish@123", "ashish@gmail.com", 24, "male", LocalDate.now(), "1"));
		ResponseDto responseDto = userServiceImpl.getUserPolicyById(1);
		assertEquals(responseDto, responseDto.getUser());
	}

}
