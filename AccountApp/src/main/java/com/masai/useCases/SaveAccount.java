package com.masai.useCases;

import java.util.Scanner;

import com.masai.AccountDAO.AccountDAO;
import com.masai.AccountDAO.AccountDaoImpl;
import com.masai.Entity.Account;

public class SaveAccount {
	public static void main(String[] args) {
		AccountDAO ad = new AccountDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account id");
		int id = sc.nextInt();
		System.out.println("Enter your account mail");
		String email = sc.next();
		System.out.println("Enter your account address");
		String address = sc.next();
		System.out.println("Enter your account balance");
		double balance = sc.nextDouble();
		
		Account acc = new Account(id, email, address, balance);
		ad.save(acc);
	}
}
