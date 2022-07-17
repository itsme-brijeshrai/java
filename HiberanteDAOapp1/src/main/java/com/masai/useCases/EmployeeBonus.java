package com.masai.useCases;
import java.util.Scanner;

import com.masai.DaoInterface.EmployeeDao;
import com.masai.DaoInterface.EmployeeDaoImpl;
public class EmployeeBonus {

	public static void main(String[] args) {
		EmployeeDao ed = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		System.out.println("Enter bonus amount");
		int bonus = sc.nextInt();
		String message = ed.giveBonusToEmployee(id, bonus);
		System.out.println(message);

	}

}
