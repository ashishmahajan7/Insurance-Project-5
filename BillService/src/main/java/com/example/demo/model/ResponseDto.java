package com.example.demo.model;

public class ResponseDto {

	private BillDto bill;
	private UserDto user;

	public BillDto getBill() {
		return bill;
	}

	public void setBill(BillDto bill) {
		this.bill = bill;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ResponseDto [bill=" + bill + ", user=" + user + "]";
	}

}
