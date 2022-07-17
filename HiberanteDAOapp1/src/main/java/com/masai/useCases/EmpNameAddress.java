package com.masai.useCases;
import java.util.Scanner;

import com.masai.DaoInterface.EmployeeDao;
import com.masai.DaoInterface.EmployeeDaoImpl;
public class EmpNameAddress {

	public static void main(String[] args) {
		EmployeeDao ed = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		String[] nameAndAddress = ed.getNameAndAddress(id);
		if(nameAndAddress==null) {
			System.out.println("Employee does not exist");
		}else {
			System.out.println("Name - "+nameAndAddress[0]);
			System.out.println("Address - "+nameAndAddress[1]);
		}
	}

}
