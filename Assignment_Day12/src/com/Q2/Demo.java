package com.Q2;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Demo {
	Citizen citizen = new Citizen();
	public boolean validate(String name, String mobileNum, String aadharCard) {
		int flag = 0;
		if(Pattern.matches("[a-zA-Z]{3,9}", name)) {
			flag++;
		}	
		if(Pattern.matches("[6789]{1}[0-9]{9}", mobileNum)) {
			flag++;
		}
		if(Pattern.matches("[0-9]{4}[0-9]{4}[0-9]{4}", aadharCard)) {
			flag++;
		}
		if(flag==3) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Citizen citizen = new Citizen();
		Demo d1 = new Demo();
		
		System.out.println("Enter your name :");
		String name = sc.next();
		
		System.out.println("Enter your mobile_number : ");
		String mobileNum = sc.next();
		
		System.out.println("Enter your aadharCard - ");
		String aadharCard = sc.next();
		boolean check = d1.validate(name, mobileNum, aadharCard);
		if(check) {
			citizen.setName(name);
			citizen.setMobileNumber(mobileNum);
			citizen.setAadharNumber(aadharCard);
			citizen.showDetails();
		}else {
			System.out.println("Enter valid input!");
		}
		
		sc.close();
	}
}
