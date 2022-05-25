package com.inheritance;

public class Member {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		
		System.out.println("In one company" + employee.name + " is " + employee.Specialization + " in " + employee.Departement);
		System.out.println("Profile :-");
		System.out.println(employee.name);
		System.out.println(employee.age);
		System.out.println(employee.address);
		System.out.println(employee.phone_Number);
		System.out.println("In another company " + manager.name + " is " + manager.Specialization + " in " + manager.Departement);
		System.out.println("Profile :-");
		System.out.println(manager.name);
		System.out.println(manager.age);
		System.out.println(manager.address);
		System.out.println(manager.phone_Number);
		
	}
	String name = "Brijesh";
	int age = 23;
	String phone_Number = "9490167406";
	String address = "hyderabad";
	double salary = 67663;
	
	void printSalary() {
		System.out.println("The salary of " + name + " is " + salary);
	}
}

class Employee extends Member{
	String Specialization = "Backend Engineer";
	String Departement = "Java";
}

class Manager extends Member{
	String Specialization = "Front-end Engineer";
	String Departement = "MERN";
}
