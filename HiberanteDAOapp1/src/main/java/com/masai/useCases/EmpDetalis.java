package com.masai.useCases;

import java.util.List;

import com.masai.DaoInterface.EmployeeDao;
import com.masai.DaoInterface.EmployeeDaoImpl;
import com.masai.entity.Emp;

public class EmpDetalis {
	public static void main(String[] args) {
		EmployeeDao ed = new EmployeeDaoImpl();
		List<Emp> employee = ed.getAllEmployee();
//		System.out.println(employee);
		for(Emp e:employee) {
			System.out.println(e);
		}
	}
}
