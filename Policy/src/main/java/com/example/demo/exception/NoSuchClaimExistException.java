package com.example.demo.exception;

public class NoSuchClaimExistException extends RuntimeException{

	private String message;
	
	public NoSuchClaimExistException(String msg) {
		super(msg);
		this.message = msg;
	}
	
}
