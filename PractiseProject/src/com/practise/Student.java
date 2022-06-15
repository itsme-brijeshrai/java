package com.practise;

public class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	
	/**
	 * 
	 */
	public Student() {
	}


	public Student(int roll, String name, int age, int marks) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(18<age && age<60) {
			this.age = age;
		}else {
			System.out.println("Enter a valid age !");
		}
		
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		if(0<marks && marks<500) {
			this.marks = marks;
		}else {
			System.out.println("Enter valid marks !");
		}
		
	}
	
	void showDetails(){
		System.out.println("Name : "+name);
		System.out.println("roll : "+roll);
		System.out.println("age  : "+age);
		System.out.println("marks: "+marks);
	}
	
	
}
