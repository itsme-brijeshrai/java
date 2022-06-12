package com.basic;
import java.util.*;
public class Person {
	String name;
	int age;
	
	void walk() {
		System.out.println(""+name + " can walk");
	}
	void run() {
		System.out.println(""+name + " can run ");
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter your name :");
		String name = sc.next();
		person.name = name;
		
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		person.age = age;
		
		person.walk();
		person.run();
		
		sc.close();
		
		}
		catch(InputMismatchException ie){
			System.out.println(ie.getMessage());
		}
	}

}

