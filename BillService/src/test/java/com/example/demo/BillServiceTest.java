package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Bill;
import com.example.demo.repository.BillRepository;
import com.example.demo.service.BillServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class BillServiceTest {

	@InjectMocks
	BillServiceImpl billService;

	@Mock
	BillRepository billRepository;

	@Test
	public void addBillTest() {
		Bill bill = new Bill(1, "1", 1000, 70000, 100000, null, null);
		when(billRepository.save(bill)).thenReturn(bill);
		Bill billActual = billService.addBill(bill);
		assertEquals(bill, billActual);
	}

	
}
