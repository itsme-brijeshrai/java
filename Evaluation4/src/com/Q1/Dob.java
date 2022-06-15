package com.Q1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Dob {

	void birthdayCheker(int age) {
		
		if(age<0) {
			System.out.println("Date should not be in future!");
		}else if(age>=18){
			System.out.println("You are eligible to cast vote!");
		}else if(age==0) {
			System.out.println("Happy Birthday, you are eligible to vote !");
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter Date Of Birth in dd-MM-yyyy pattern: ");
		Scanner sc= new Scanner(System.in);
		
		try {
			String Dob = sc.next();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate dateOfBirth=LocalDate.parse(Dob,dtf);
			
			LocalDate cuurent = LocalDate.now();

			Period period =   Period.between( cuurent,dateOfBirth);
			
			 int age  = Math.abs(period.getYears());
			 
			 new Dob().birthdayCheker(age);
			
		}
		catch(Exception e) {
			System.out.println("Please enter Date of birth in valid pattern");
		}
		sc.close();
		 
		
		

	}

}
