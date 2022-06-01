package com.masai;

public class Person {
	String name;
	String gender;
}
class Instructor extends Person{
	int instructorId;
	int salary;
}
class Students extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
}