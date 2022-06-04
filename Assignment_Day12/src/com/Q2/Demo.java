package com.Q2;
import java.util.Scanner;
public class Demo {
	Citizen citizen = new Citizen();
	public boolean validate(String name, String mobileNum, String aadharCard) {
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Citizen citizen = new Citizen();
		
		System.out.println("Enter your name :");
		String name = sc.next();
		
		System.out.println("Enter your mobile_number : ");
		String mobileNum = sc.next();
		
		System.out.println("Enter your aadharCard - ");
		String aadharCard = sc.next();
		
		citizen.setName(name);
		citizen.setMobileNumber(mobileNum);
		citizen.setAadharNumber(aadharCard);
		citizen.showDetails();
		sc.close();
	}
}
