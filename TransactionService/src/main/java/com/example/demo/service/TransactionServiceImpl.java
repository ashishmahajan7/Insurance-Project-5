package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Transaction;
import com.example.demo.model.TransactionDto;
import com.example.demo.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	TransactionRepository transactionRepository;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Transaction saveTransaction(Transaction transaction) {
		long transactionId1 = transaction.getTransactionId();
		
//		ResponseEntity<TransactionDto> responseEntity = restTemplate.getForEntity("http://localhost:8085/transaction/gettransaction/" + transactionId1, TransactionDto.class);
//		TransactionDto transactionDto = responseEntity.getBody();
//		
//		Transaction transaction2;
//		
//		if( transactionId1 != transactionDto.getTransactionId()  ) {
			Transaction transaction2 = transactionRepository.save(transaction);
			
			ResponseEntity<TransactionDto> responseEntity = restTemplate.getForEntity("http://localhost:8085/transaction/gettransaction/" + transactionId1, TransactionDto.class);
//			TransactionDto transactionDto = responseEntity.getBody();
			
			
			
//		}
//		else {
//			Transaction updatedTransaction = new Transaction();
//			updatedTransaction.setTransactionId(transactionDto.getTransactionId());
//			updatedTransaction.setPaymentId(transactionDto.getPaymentId());
//			updatedTransaction.setPremium(transactionDto.getPremium());
//			updatedTransaction.setStatus(transactionDto.getStatus());
//			updatedTransaction.setPremiumPaidAmount(transactionDto.getPremiumPaidAmount());
//			updatedTransaction.setPremiumBalanceAmount(transactionDto.getPremiumBalanceAmount());
//			updatedTransaction.setPremiumTotalamount(transactionDto.getPremiumTotalamount());
//			updatedTransaction.setDate(transactionDto.getTransactionDate());
//			
//			transaction2 = transactionRepository.save(updatedTransaction);
//		}
		
		return transaction2;
	}

	@Override
	public Optional<Transaction> getTransaction(long id) {
		Optional<Transaction> transaction = transactionRepository.findById(id);
		return transaction;
	}

	
	
	

}
