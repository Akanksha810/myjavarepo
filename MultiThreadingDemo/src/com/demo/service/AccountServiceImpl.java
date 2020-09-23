package com.demo.service;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import com.demo.bean.Account;
import com.demo.dao.AccountDao;
import com.demo.dao.AccountDaoImpl;
import com.demo.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{
	static {
		 sc=new Scanner(System.in);
	}
	private AccountDao accountDao;
	
	public AccountServiceImpl() {
		accountDao=new AccountDaoImpl();
	}
	static Scanner sc;
	@Override
	public void addAccount() {
		
		// TODO Auto-generated method stub
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String nm=sc.next();
		System.out.println("Enter opening balance");
		Double b=sc.nextDouble();
		Account ob=new Account(id,b,nm);
		accountDao.addAccount(ob);
		
	}
	@Override
	public List<Account> displayAll() {
		return accountDao.getAllAccount();
	}
	@Override
	public void withdrawAmt(int id,double amt) {
		Account acc=accountDao.searchById(new Account(id,0.0,null));
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accountDao.withdrawAmout(amt,acc);
		
	}

}
