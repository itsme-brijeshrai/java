package com.q2;
import java.util.*;
public class EmployeeDriver {

	public static void main(String[] args) {
		
		Set<Employee> es = new TreeSet<>(new Salarysort());
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<4;i++) {
			System.out.println("Enter your Id");
			int id = sc.nextInt();
			System.out.println("Enter your Name");
			String name = sc.next();
			System.out.println("Enter your Salary");
			double salary = sc.nextDouble();
			es.add(new Employee(id,name,salary));
		}
		sc.close();
		for(Employee emp:es) {
			System.out.println(emp);
		}
	}

}
