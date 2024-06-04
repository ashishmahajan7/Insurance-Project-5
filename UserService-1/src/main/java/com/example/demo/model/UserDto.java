package com.example.demo.model;

public class UserDto {

	private Integer userId;
	private String fName;
	private String lName;
	private String address;
	private long mobileNumber;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + "]";
	}

}
