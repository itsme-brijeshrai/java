package com.masai;
import java.util.Scanner;
public class Demo  {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Enter number of student objects to create");
		int student_obj = sc.nextInt();
		
		for(int i=1;i<=student_obj;i++) {
			System.out.println("Enter Roll no :");
			int roll = sc.nextInt();
			System.out.println("Enter name :");
			String name = sc.next();
			System.out.println("Enter Address :");
			String address = sc.next();
			System.out.println("Enter marks given :");
			int marks = sc.nextInt();
			student.setRoll(roll);
			student.setName(name);
			student.setAddress(address);
			student.setMarks(marks);	
		}
		student.showDetails();
		
		
		sc.close();

	}

}
