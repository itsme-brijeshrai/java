package com.basic;
import java.util.Scanner;
public class Arrays{
	public static String reverseString(String input) {
		String result = "";
		for(int i=input.length()-1;i>=0;i--) {
			result+=input.charAt(i);
		}
		return result;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :)");
		String input = sc.next();
		sc.close();
		String reverse = reverseString(input);
		System.out.println(reverse);
	}
}
