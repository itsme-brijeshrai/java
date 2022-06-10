package com.Q1;

public class Account {
	private String accountNumber;
	private double Balance;
	
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void deposit(int amount) {
		double total = this.Balance+amount;
		this.Balance = total;
	}
	public double withdraw(int amount) throws InsufficientFund{
		if(amount<Balance) {
			return Balance-amount;
		}else {
			InsufficientFund ife = new InsufficientFund("No balance !");
			throw ife;
		}
	}
}
