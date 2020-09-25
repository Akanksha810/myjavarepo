package com.demo.dao;

import java.util.List;
import java.util.Vector;

import com.demo.bean.Account;

public class AccountDaoImpl implements AccountDao{
	static List<Account> vacc;
	static{
		vacc=new Vector<>();
	}

	@Override
	public void addAccount(Account ob) {
		vacc.add(ob);
		
	}

	@Override
	public List<Account> getAllAccount() {
		return vacc;
		
	}

	@Override
	public Account searchById(Account account) {
		int pos=vacc.indexOf(account);
		return vacc.get(pos);
	}

	@Override
	 public void withdrawAmout(double amt, Account acc) {
		acc.withdraw(amt);
		
	}

}
