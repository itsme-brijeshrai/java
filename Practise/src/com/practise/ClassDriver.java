package com.practise;
import java.util.Scanner;
public class ClassDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Input input = new Input();
		System.out.println("Enter your roll number");
		int roll = sc.nextInt();
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		System.out.println("Enter your batch number");
		String batch_number = sc.next();
		
		input.setRoll(roll);
		input.setMarks(marks);
		input.setBatch_number(batch_number);
		
		
		System.out.println("=========Student Details==========");
		System.out.println("roll number is "+ input.getRoll());
		System.out.println("marks  is "+ input.getMarks());
		System.out.println("Batch is " + input.getBatch_number());
		
		System.out.println("Enter your roll number");
		int roll_num = sc.nextInt();
		System.out.println("Enter your marks");
		int mark = sc.nextInt();
		System.out.println("Enter your batch number");
		String batchnumber = sc.next();
		
		Input input1 = new Input(roll_num,mark,batchnumber);
		System.out.println("=========Student Details==========");
		System.out.println("roll number is "+ input1.getRoll());
		System.out.println("marks  is "+ input1.getMarks());
		System.out.println("Batch is " + input1.getBatch_number());
		sc.close();

	}

}
