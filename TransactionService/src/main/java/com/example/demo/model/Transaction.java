package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transactionId;
	private Long paymentId;
	private String premium;
	private String status;

	private double premiumPaidAmount;
	private double premiumBalanceAmount;
	private double premiumTotalamount;
	private LocalDate date;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
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

	public double getPremiumPaidAmount() {
		return premiumPaidAmount;
	}

	public void setPremiumPaidAmount(double premiumPaidAmount) {
		this.premiumPaidAmount = premiumPaidAmount;
	}

	public double getPremiumBalanceAmount() {
		return premiumBalanceAmount;
	}

	public void setPremiumBalanceAmount(double premiumBalanceAmount) {
		this.premiumBalanceAmount = premiumBalanceAmount;
	}

	public double getPremiumTotalamount() {
		return premiumTotalamount;
	}

	public void setPremiumTotalamount(double premiumTotalamount) {
		this.premiumTotalamount = premiumTotalamount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = LocalDate.now();
	}

	public Transaction(Long transactionId, Long paymentId, String premium, String status, double premiumPaidAmount,
			double premiumBalanceAmount, double premiumTotalamount, LocalDate date) {
		super();
		this.transactionId = transactionId;
		this.paymentId = paymentId;
		this.premium = premium;
		this.status = status;
		this.premiumPaidAmount = premiumPaidAmount;
		this.premiumBalanceAmount = premiumBalanceAmount;
		this.premiumTotalamount = premiumTotalamount;
		this.date = LocalDate.now();
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", paymentId=" + paymentId + ", premium=" + premium
				+ ", status=" + status + ", premiumPaidAmount=" + premiumPaidAmount + ", premiumBalanceAmount="
				+ premiumBalanceAmount + ", premiumTotalamount=" + premiumTotalamount + ", date=" + date + "]";
	}

}
