package com.masai;
import java.util.Scanner;
public class JavaBeanMain {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Enter Roll Number");
		int roll=sc.nextInt();
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		
		JavaBean jb1=new JavaBean();
		
		
			    jb1.setMarks(marks);
				jb1.setAge(age);
				jb1.setName(name);
				jb1.setRoll(roll);
//				jb1.showDetails();
				  System.out.println("Name: "+jb1.getName());
				  System.out.println("Roll : "+jb1.getRoll());
				  System.out.println("Age: "+jb1.getAge());
				  System.out.println("Marks: "+jb1.getMarks());
		 System.out.println("========================================");
		JavaBean jb2=new JavaBean(roll,name,age,marks);
		System.out.println("Name: "+jb1.getName());
		  System.out.println("Roll : "+jb1.getRoll());
		  System.out.println("Age: "+jb1.getAge());
		  System.out.println("Marks: "+jb1.getMarks());
//		jb2.showDetails();
		//_JavaBean jb2=new _JavaBean();
		// TODO Auto-generated method stub
		  sc.close();

	}

}