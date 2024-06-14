package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Transaction;
import com.example.demo.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@PostMapping("/savetransaction")
	public Transaction saveTransaction(@RequestBody Transaction transaction) {
		Transaction transaction2 = transactionService.saveTransaction(transaction);
		return transaction2;
	}
	
	@GetMapping("/gettransaction/{id}")
	public Optional<Transaction> getTransaction(@PathVariable long id) {
		Optional<Transaction> transaction = transactionService.getTransaction(id);
		return transaction;
	}

}
