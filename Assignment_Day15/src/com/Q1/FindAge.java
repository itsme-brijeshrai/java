package com.Q1;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class FindAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your date of birth in dd/MM/YYYY");
		String dob = sc.next();
		FindAge fa = new FindAge();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		LocalDate ld = LocalDate.now();
		
	}
}
