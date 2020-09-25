package com.demo.dao;

import java.util.List;
import java.util.Vector;

import com.demo.bean.Account;

public interface AccountDao {

	void addAccount(Account ob);

	List<Account> getAllAccount();

	Account searchById(Account account);

	void withdrawAmout(double amt, Account acc);

}
