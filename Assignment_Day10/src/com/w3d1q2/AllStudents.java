package com.w3d1q2;
import java.util.Scanner;
public class AllStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name ");
		String name = sc.next();
		
		System.out.println("Enter your address");
		String address = sc.nextLine();
		
		System.out.println("Enter your physics marks :");
		int physicsMarks = sc.nextInt();
		
		System.out.println("Enter your chemistry marks :");
		int chemistryMarks = sc.nextInt();
		
		System.out.println("Enter your maths marks :");
		int mathsMarks = sc.nextInt();
		
		sc.close();

	}

}
