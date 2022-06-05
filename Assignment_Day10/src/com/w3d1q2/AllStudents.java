package com.w3d1q2;
import java.util.Scanner;
public class AllStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name ");
		String name = sc.next();
		
		System.out.println("Enter your address");
		String address = sc.next();
		
		System.out.println("Enter your physics marks :");
		int physicsMarks = sc.nextInt();
		
		System.out.println("Enter your chemistry marks :");
		int chemistryMarks = sc.nextInt();
		
		System.out.println("Enter your maths marks :");
		int mathsMarks = sc.nextInt();
		ScienceStudent ss = new ScienceStudent(name, address, physicsMarks, chemistryMarks, mathsMarks);
		ss.showDetails();
		double result = ss.getPercentage();
		System.out.println("Total Percent :- " + result);
		
		System.out.println("Enter your name ");
		String name2 = sc.next();
		
		System.out.println("Enter your address");
		String address2 = sc.next();
		
		System.out.println("Enter your history marks :");
		int historyMarks = sc.nextInt();
		
		System.out.println("Enter your civic marks");
		int civicsMarks = sc.nextInt();
		
		HistoryStudent hs = new HistoryStudent(name2, address2, historyMarks, civicsMarks);
		hs.showDetails();
		double res = hs.getPercentage();
		System.out.println("Total Percent :- " + res);
		
		
		
		sc.close();

	}

}
