package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userId;
	private double downPayment;
	private double balance;
	private double totalAmount;
	private LocalDate generateDate;
	private LocalDate dueDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDate getGenerateDate() {
		return generateDate;
	}

	public void setGenerateDate(LocalDate date) {
		this.generateDate = date;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Bill(int id, String userId, double downPayment, double balance, double totalAmount, LocalDate date,
			LocalDate dueDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.downPayment = downPayment;
		this.balance = balance;
		this.totalAmount = totalAmount;
		this.generateDate = LocalDate.now();
		this.dueDate = LocalDate.now().plusMonths(1);
	}

	public Bill() {
		super();

	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", userId=" + userId + ", downPayment=" + downPayment + ", balance=" + balance
				+ ", totalAmount=" + totalAmount + ", date=" + generateDate + ", dueDate=" + dueDate + "]";
	}

}
