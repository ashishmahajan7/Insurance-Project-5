package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Transaction;

public interface TransactionService {
	
	public Transaction saveTransaction(Transaction transaction);
	
	public Optional<Transaction> getTransaction (long id);
	
//	public Transaction updateTransaction(long id , Transaction transaction);

}
