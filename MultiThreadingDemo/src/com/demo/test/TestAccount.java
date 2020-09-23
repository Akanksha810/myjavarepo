package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import com.demo.bean.Account;
import com.demo.service.AccountService;
import com.demo.service.AccountServiceImpl;
import com.demo.thread.WithdarwThread;
//import com.demo.thread.WithdrawThread;

public class TestAccount {

	public static void main(String[] args) {
		//Vector<Account> alist=new Vector<>();
		AccountService accountService=new AccountServiceImpl();
		Scanner sc=new Scanner(System.in);
		//WithdarwThread[] warr=new WithdarwThread[20];
		List<WithdarwThread>  alist=new ArrayList<>();
		int count=0;
		int choice=0;
		do {
		System.out.println("1. Add new account \n 2. withdraw\n3.deposite \n4.display\n5.exit");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			accountService.addAccount();
			break;
		case 2:
			System.out.println("enter account id");
			int id=sc.nextInt();
			System.out.println("enter withdrawal amount");
			double amt=sc.nextDouble();
			WithdarwThread ob=new WithdarwThread(id,amt,accountService);
			alist.add(ob);
			ob.start();
			count++;
			System.out.println("withdraw started");
			break;
		case 3:
			
			break;
		case 4:
			
			List<Account> vector=accountService.displayAll();
			
			for(Account acc:vector) {
				System.out.println(acc);				
			}
			break;
		case 5:
			System.out.println("exiting program");
			for(WithdarwThread w:alist) {
				try {
					w.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.exit(0);
			break;
		
			
		
		}
		
		}while(choice!=5);
		

	}

}
