package com.example.demo.model;

public class ResponseDto {

	private UserDto user;
	private PolicyDto policy;

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public PolicyDto getPolicy() {
		return policy;
	}

	public void setPolicy(PolicyDto policy) {
		this.policy = policy;
	}

	@Override
	public String toString() {
		return "ResponseDto [user=" + user + ", policy=" + policy + "]";
	}

}
