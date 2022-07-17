package com.masai.useCases;

import java.util.Scanner;

import com.masai.DaoInterface.EmployeeDao;
import com.masai.DaoInterface.EmployeeDaoImpl;

public class AddressEmp {

	public static void main(String[] args) {
		EmployeeDao ed = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id :");
		int id = sc.nextInt();
		String address = ed.getAddressOfEmployee(id);
		if(address=="") {
			System.out.println("Employee doesn't exist");
		}else {
			System.out.println("Address of emp -> "+id+" is "+address);
		}
		sc.close();
	}

}
