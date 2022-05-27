package com.masai;
import java.util.Scanner;
public class NaturalNumber {
	
	public static void natural(int number) {
		int sumNaturalnum = number * (number+1)/2;
		System.out.println("Sum of your natural number is: " + sumNaturalnum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		sc.close();
		natural(number);

	}

}
