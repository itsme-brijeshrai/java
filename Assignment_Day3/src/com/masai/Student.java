package com.masai;

public class Student {
	
	int roll = 101;
	String name = "Brijesh";
	int marks = 92;
	
	void displayStudentDetails() {
		System.out.println("Roll number : " + roll);
		System.out.println("Name : " + name);
		System.out.println("Marks : " + marks);
	}
	
	public static void main(String[] args) {
		
		Student student_1 = new Student();
		Student student_2 = new Student();
		
		student_1.displayStudentDetails();
		System.out.println("=============================================");
		student_2.displayStudentDetails();
		
		student_1 = null;
		student_2 = null;

	}

}
