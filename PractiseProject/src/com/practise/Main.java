package com.practise;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Student student1 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = sc.next();
		System.out.println("Enter your roll number ");
		int roll = sc.nextInt();
		System.out.println("Enter your marks ");
		int marks = sc.nextInt();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		sc.close();
		student1.setName(name);
		student1.setRoll(roll);
		student1.setMarks(marks);
		student1.setAge(age);
		
		
		Student student2 = new Student(21, "Brijesh", 23, 46);
		student1.showDetails();
		student2.showDetails();
		

	}

}
