package com.masai;
import java.util.Scanner;
public class PrimeFactorial {
	
	public static void factorial(int number) {
		if(number < 2 || number > 100) {
			System.out.println("Invalid number !");
		}else {
			for(int i=2;i<=number;i++) {
				if(number%i==0) {
					int count = 0;
					for(int j=1;j<=i;j++) {
						if(i%j == 0) {
							count++;
						}
					}
					if(count == 2) {
						System.out.print( i + " ");
					}
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		sc.close();
		factorial(number);

	}

}
