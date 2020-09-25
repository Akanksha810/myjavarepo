package com.demo.thread;

import com.demo.service.AccountService;

public class WithdarwThread extends Thread{
	private int id;
	private double amt;
	private AccountService accountService;
	
	
	public WithdarwThread(int id, double amt, AccountService accountService) {
		super();
		this.id = id;
		this.amt = amt;
		this.accountService = accountService;
	}


	public void run() {
		accountService.withdrawAmt(id,amt);
		System.out.println("withdaw done");
	}

}
