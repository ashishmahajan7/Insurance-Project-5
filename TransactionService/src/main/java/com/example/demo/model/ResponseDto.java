package com.example.demo.model;

public class ResponseDto {

	private TransactionDto transaction;
	private PaymentDto payment;

	public TransactionDto getTransaction() {
		return transaction;
	}

	public void setTransaction(TransactionDto transaction) {
		this.transaction = transaction;
	}

	public PaymentDto getPayment() {
		return payment;
	}

	public void setPayment(PaymentDto payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "ResponseDto [transaction=" + transaction + ", payment=" + payment + "]";
	}

}
