package com.example.demo.model;

import java.time.LocalDate;

public class TransactionDto {

	private long transactionId;
	private Long paymentId;
	private String premium;
	private String status;

	private int premiumPaidAmount;
	private int premiumBalanceAmount;
	private int premiumTotalamount;
	private LocalDate transactionDate;

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getPremium() {
		return premium;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPremiumPaidAmount() {
		return premiumPaidAmount;
	}

	public void setPremiumPaidAmount(int premiumPaidAmount) {
		this.premiumPaidAmount = premiumPaidAmount;
	}

	public int getPremiumBalanceAmount() {
		return premiumBalanceAmount;
	}

	public void setPremiumBalanceAmount(int premiumBalanceAmount) {
		this.premiumBalanceAmount = premiumBalanceAmount;
	}

	public int getPremiumTotalamount() {
		return premiumTotalamount;
	}

	public void setPremiumTotalamount(int premiumTotalamount) {
		this.premiumTotalamount = premiumTotalamount;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	

	public TransactionDto(long transactionId, Long paymentId, String premium, String status, int premiumPaidAmount,
			int premiumBalanceAmount, int premiumTotalamount, LocalDate transactionDate) {
		super();
		this.transactionId = transactionId;
		this.paymentId = paymentId;
		this.premium = premium;
		this.status = status;
		this.premiumPaidAmount = premiumPaidAmount;
		this.premiumBalanceAmount = premiumBalanceAmount;
		this.premiumTotalamount = premiumTotalamount;
		this.transactionDate = transactionDate;
	}

	public TransactionDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TransactionDto [transactionId=" + transactionId + ", premium=" + premium + ", status=" + status
				+ ", premiumPaidAmount=" + premiumPaidAmount + ", premiumBalanceAmount=" + premiumBalanceAmount
				+ ", premiumTotalamount=" + premiumTotalamount + ", transactionDate=" + transactionDate + "]";
	}

}
