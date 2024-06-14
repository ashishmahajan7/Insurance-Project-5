package com.example.demo.model;

import java.time.LocalDate;

public class BillDto {


	private Integer id;
	private double downPayment;
	private double balance;
	private double totalAmount;
	private LocalDate generateDate;
	private LocalDate dueDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public void setGenerateDate(LocalDate generateDate) {
		this.generateDate = generateDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "BillDto [id=" + id + ", downPayment=" + downPayment + ", balance=" + balance + ", totalAmount="
				+ totalAmount + ", generateDate=" + generateDate + ", dueDate=" + dueDate + "]";
	}

}
