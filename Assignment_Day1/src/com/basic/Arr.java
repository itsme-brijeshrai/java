package com.basic;

import java.util.Scanner;

public class Arr {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter 1st number - ");
		 int num1 = input.nextInt();
		 System.out.println("Enter 2nd number - ");
		 int num2 = input.nextInt();
		 System.out.println("The total sum is " + (num1 + num2));
		 input.close();
		
	}
}