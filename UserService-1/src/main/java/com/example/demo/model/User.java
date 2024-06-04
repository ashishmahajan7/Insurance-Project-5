package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fName;
	private String lName;
	private LocalDate dateOfBirth;
	private String address;
	private String city;
	private int pincode;
	private long adharCardNumber;
	private long mobileNumber;
	private String UserName;
	private String password;
	private String emailId;
	private int age;
	private String gender;
	private LocalDate registerDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public long getAdharCardNumber() {
		return adharCardNumber;
	}

	public void setAdharCardNumber(long adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String fName, String lName, LocalDate dateOfBirth, String address, String city, int pincode,
			long adharCardNumber, long mobileNumber, String userName, String password, String emailId, int age,
			String gender, LocalDate registerDate) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.adharCardNumber = adharCardNumber;
		this.mobileNumber = mobileNumber;
		UserName = userName;
		this.password = password;
		this.emailId = emailId;
		this.age = age;
		this.gender = gender;
		this.registerDate = LocalDate.now();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", dateOfBirth=" + dateOfBirth
				+ ", address=" + address + ", city=" + city + ", pincode=" + pincode + ", adharCardNumber="
				+ adharCardNumber + ", mobileNumber=" + mobileNumber + ", UserName=" + UserName + ", password="
				+ password + ", emailId=" + emailId + ", age=" + age + ", gender=" + gender + ", registerDate="
				+ registerDate + "]";
	}

}
