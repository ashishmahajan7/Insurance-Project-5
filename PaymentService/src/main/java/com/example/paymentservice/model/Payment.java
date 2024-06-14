
package com.example.paymentservice.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long paymentId;
	private Long billId;
	private Double amountPaid;
	private String accountNumber;
	private LocalDate transactionDate;
	private String modeOfPayment;
	private String paymentStatus;

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", billId=" + billId + ", amountPaid=" + amountPaid
				+ ", accountNumber=" + accountNumber + ", transactionDate=" + transactionDate + ", modeOfPayment="
				+ modeOfPayment + ", paymentStatus=" + paymentStatus + "]";
	}

	public Payment() {
		super();
	}

	public Payment(Long paymentId, Long billId, Double amountPaid, String accountNumber, LocalDate transactionDate,
			String modeOfPayment, String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.billId = billId;
		this.amountPaid = amountPaid;
		this.accountNumber = accountNumber;
		this.transactionDate = transactionDate;
		this.modeOfPayment = modeOfPayment;
		this.paymentStatus = paymentStatus;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public Double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
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

}
