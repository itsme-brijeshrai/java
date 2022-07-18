package com.masai.AccountDAO;

import com.masai.AccException.InsufficientBalance;
import com.masai.AccException.InvalidAccount;
import com.masai.Entity.Account;

public interface AccountDAO {
	void save(Account account);
	Account findById(int id) throws InvalidAccount;
	void update(Account account) throws InvalidAccount;
	void remove(Account account) throws InvalidAccount;
	int withdraw(double amount, Account account) throws InsufficientBalance;
	String deposit(double amount, Account account) throws InvalidAccount;
}
