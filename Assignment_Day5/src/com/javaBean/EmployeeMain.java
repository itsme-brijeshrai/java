package com.javaBean;
import java.util.Scanner;
public class EmployeeMain {
	
	public static Employee getEmployeeDetails() {
		Employee emp = new Employee();
		return emp;	
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee Id :");
		int employeeId = sc.nextInt();
		
		System.out.println("Enter employee Name :");
		String employeeName = sc.next();
		
		System.out.println("Enter employee salary :");
		int salary = sc.nextInt();
		
		System.out.println("Enter employee pfPercentage :");
		int pfPercentage = sc.nextInt();
		
		Employee emp = getEmployeeDetails();
		emp.setEmployeeId(employeeId);
		emp.setEmployeeName(employeeName);
		emp.setSalary(salary);
		
	
		System.out.println("Id is : " + emp.getEmployeeId());
		System.out.println("Name is : " + emp.getEmployeeName());
		System.out.println("Salary is : " + emp.getSalary());
		
		emp.calculateNetSalary(pfPercentage);
		sc.close();

	}

}
