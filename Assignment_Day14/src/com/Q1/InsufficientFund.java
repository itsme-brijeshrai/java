package com.Q1;

public class InsufficientFund extends Exception {
	private String message;
	public InsufficientFund(String message) {
		this.message = message;
	}
	public String getMessage() {
		return this.message;
	}
}
