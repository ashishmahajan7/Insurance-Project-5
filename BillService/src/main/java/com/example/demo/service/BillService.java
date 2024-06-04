package com.example.demo.service;

import com.example.demo.model.Bill;
import com.example.demo.model.ResponseDto;

public interface BillService {
	
	public Bill addBill(Bill bill);
	
	public ResponseDto getBillById(int id);

}
