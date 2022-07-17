package com.masai.DbUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpEntManager {
	
	private static EntityManagerFactory emf;
	static {
		emf = Persistence.createEntityManagerFactory("empunit1");
	}
	public static EntityManager provideem() {
		EntityManager em = emf.createEntityManager();
		return em;
	}
}
