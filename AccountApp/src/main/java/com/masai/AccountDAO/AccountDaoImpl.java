package com.masai.AccountDAO;

import javax.persistence.EntityManager;

import com.masai.AccException.InsufficientBalance;
import com.masai.AccException.InvalidAccount;
import com.masai.DBEntityManager.GetEntityManager;
import com.masai.Entity.Account;

public class AccountDaoImpl implements AccountDAO {

	@Override
	public void save(Account account) {
		EntityManager em = GetEntityManager.provideem();
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		System.out.println("Done");
	}

	@Override
	public Account findById(int id) throws InvalidAccount {
		EntityManager em = GetEntityManager.provideem();
		Account acc = em.find(Account.class, id);
		return acc;
	}

	@Override
	public void update(Account account) throws InvalidAccount {
		EntityManager em = GetEntityManager.provideem();
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		System.out.println("Done...");
		
	}

	@Override
	public void remove(Account account) throws InvalidAccount {
		EntityManager em = GetEntityManager.provideem();
		
		em.remove(account);
		
	}

	@Override
	public int withdraw(double amount, Account account) throws InsufficientBalance {
		EntityManager em = GetEntityManager.provideem();
		Account acc = em.find(Account.class,account);
		em.getTransaction().begin();
		double balance = account.getBalance();
		int remain= (int) ((int)balance-amount);
		acc.setBalance(balance);
		em.persist(account);
		em.getTransaction().commit();
		return remain;
	}

	@Override
	public String deposit(double amount, Account account) throws InvalidAccount {
		String msg = "";
		EntityManager em = GetEntityManager.provideem();
		Account acc = em.find(Account.class,account);
		em.getTransaction().begin();
		acc.getBalance();
		acc.setBalance(acc.getBalance()+amount);
		em.persist(account);
		em.getTransaction().commit();
		msg = "Done";
		return msg;
	}

}
