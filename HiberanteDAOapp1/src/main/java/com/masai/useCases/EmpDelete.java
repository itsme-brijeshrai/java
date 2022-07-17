package com.masai.useCases;
import java.util.Scanner;

import com.masai.DaoInterface.EmployeeDao;
import com.masai.DaoInterface.EmployeeDaoImpl;
public class EmpDelete {

	public static void main(String[] args) {
		EmployeeDao ed = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id to remove");
		int id = sc.nextInt();
		boolean ans = ed.deleteEmployee(id);
		if(ans) {
			System.out.println("Employee deleted");
		}else {
			System.out.println("Employee does not exist !");
		}

	}

}
