package com.masai.DaoInterface;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.DbUtil.EmpEntManager;
import com.masai.entity.Emp;

public class EmployeeDaoImpl implements EmployeeDao {

	public static void main(String[] args) {
		

	}

	@Override
	public List<Emp> getAllEmployee() {
		EntityManager em = EmpEntManager.provideem();
		Query query = em.createQuery("select e from Emp e");
		List<Emp> emp = (List<Emp>)query.getResultList();
		return emp;
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		String address = "";
		EntityManager em = EmpEntManager.provideem();
		Emp femp = em.find(Emp.class, empId);
		if(femp==null) {
			address="";
		}else {
			address = femp.getAddress();
		}
		return address;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String print = "";
		EntityManager em = EmpEntManager.provideem();
		Emp femp = em.find(Emp.class, empId);
		if(femp == null) {
			print = "Employee does not exist";
		}else {
			em.getTransaction().begin();
			femp.setSalary(femp.getSalary()+bonus);
			em.getTransaction().commit();
			print = "Employee bonus added";
		}
		return print;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean message = false;
		EntityManager em = EmpEntManager.provideem();
		Emp femp = em.find(Emp.class, empId);
		if(femp == null) {
			message = false;
		}else {
			em.getTransaction().begin();
			em.remove(femp);
			em.getTransaction().commit();
			message = true;
		}
		return message;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		String [] nameAndAddress = new String[2];
		EntityManager em = EmpEntManager.provideem();
		Emp femp = em.find(Emp.class, empId);
		if(femp == null) {
			return null;
		}else {
			nameAndAddress[0]= femp.getName();
			nameAndAddress[1]= femp.getAddress();
		}
		return nameAndAddress;
	}

}
