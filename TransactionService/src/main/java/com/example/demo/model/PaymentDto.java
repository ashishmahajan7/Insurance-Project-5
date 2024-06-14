package com.example.demo.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PaymentDto {

	private Long paymentId;
	private Double amountPaid;
	private double balanceAmount;
	private double totalAmount;
	private String accountNumber;
	private LocalDate transactionDate;
	private String modeOfPayment;
	private String paymentStatus;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public PaymentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public PaymentDto(Long paymentId, Double amountPaid, double balanceAmount, double totalAmount, String accountNumber,
			LocalDate transactionDate, String modeOfPayment, String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.amountPaid = amountPaid;
		this.balanceAmount = balanceAmount;
		this.totalAmount = totalAmount;
		this.accountNumber = accountNumber;
		this.transactionDate = transactionDate;
		this.modeOfPayment = modeOfPayment;
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "PaymentDto [paymentId=" + paymentId + ", amountPaid=" + amountPaid + ", balanceAmount=" + balanceAmount
				+ ", totalAmount=" + totalAmount + ", accountNumber=" + accountNumber + ", transactionDate="
				+ transactionDate + ", modeOfPayment=" + modeOfPayment + ", paymentStatus=" + paymentStatus + "]";
	}

	

}
