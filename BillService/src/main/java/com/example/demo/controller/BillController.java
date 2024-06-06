package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bill;
import com.example.demo.model.ResponseDto;
import com.example.demo.service.BillService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	private BillService billService;
	
	@PostMapping("/addbill")
	public Bill addbill(@RequestBody Bill bill) {
		Bill bill2 = billService.addBill(bill);
		return bill2;
	}
	
	@GetMapping("/getbill/{id}")
	@ApiOperation(value="It will return bill based on bill id.")
	public ResponseDto getBillById(@PathVariable int id) {
		ResponseDto responseDto = billService.getBillById(id);
		return responseDto;
	}

}
