package com.masai;
import java.util.Scanner;
public class Switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter City :");
		String city = sc.next();
		sc.close();
		
		switch(city) {
		case "Mumbai":
			System.out.println("Financial City");
			break;
			
		case "Kolkata":
			System.out.println("City of Joy");
			break;
			
		case "Delhi":
			System.out.println("Capital of country");
			break;
			
		case "Bangalore":
			System.out.println("Cyber City");
			break;
			
		default:
			System.out.println("May be other Indian City");
			break;
		}

	}

}
