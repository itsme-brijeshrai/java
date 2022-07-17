package com.masai.DaoInterface;

import java.util.List;

import com.masai.entity.Emp;

public interface EmployeeDao {
	public List<Emp> getAllEmployee();

	public String getAddressOfEmployee(int empId);

	public String giveBonusToEmployee(int empId, int bonus);

	public boolean deleteEmployee(int empId);

	public String[] getNameAndAddress(int empId);
}
