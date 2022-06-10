package com.Q1;

public class AccountDemo {
	public static void main(String[] args) {
		Account account = new Account("34961009713");
		account.deposit(5000);
		try {
			int x = 120;
			double leftAmount = account.withdraw(x);
			System.out.println("Left amount : " + leftAmount);
		}
		catch(InsufficientFund ife) {
			System.out.println(ife.getMessage());
		}
	}

}
