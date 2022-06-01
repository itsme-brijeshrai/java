package com.basic;
import java.util.Scanner;
class Pen{
	String color;
	String type; //ball/gel
	
	public void write() {
		System.out.println("Writing something...");
	}
	public void printColor() {
		System.out.println("You choose " + this.color + " now let's");
	}
}
class Student{
	String name;
	int age;
	
	public void printName() {
		System.out.println("My name is "+ this.name);
		System.out.println("My age is "+ this.age);
	}
}
public class OOPS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student1 = new Student();
		
		System.out.println("Enter your name ");
		String name = sc.next();
		
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		sc.close();
		student1.name = name;
		student1.age = age;
		student1.printName();
	}

}
