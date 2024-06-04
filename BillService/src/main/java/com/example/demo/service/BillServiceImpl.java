package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Bill;
import com.example.demo.model.BillDto;
import com.example.demo.model.ResponseDto;
import com.example.demo.model.UserDto;
import com.example.demo.repository.BillRepository;

@Service
public class BillServiceImpl implements BillService{
	
	@Autowired
	private BillRepository billRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Bill addBill(Bill bill) {
		Bill bill1 = billRepository.save(bill);
		return bill1;
	}

	@Override
	public ResponseDto getBillById(int id) {
		ResponseDto responseDto = new ResponseDto();
		
		Bill bill = billRepository.findById(id);
		BillDto billDto = mapToBill(bill);
		
		ResponseEntity<UserDto> responseEntity = restTemplate.getForEntity("http://localhost:8081/user/getuser/" + bill.getUserId(), UserDto.class);
		UserDto userDto = responseEntity.getBody();
		
		responseDto.setBill(billDto);
		responseDto.setUser(userDto);
		
		return responseDto;
	}
	
	private BillDto mapToBill(Bill bill) {
		BillDto billDto = new BillDto();
		
		billDto.setId(bill.getId());
		billDto.setDownPayment(bill.getDownPayment());
		billDto.setBalance(bill.getBalance());
		billDto.setTotalAmount(bill.getTotalAmount());
		billDto.setGenerateDate(bill.getGenerateDate());
		billDto.setDueDate(bill.getDueDate());
		
		return billDto; 
	}
	
	

}
