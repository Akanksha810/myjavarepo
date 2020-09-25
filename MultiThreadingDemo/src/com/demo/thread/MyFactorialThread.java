package com.demo.thread;

import com.demo.service.ClientService;

public class MyFactorialThread implements Runnable{
	private ClientService cs;
	private int n;
	
	public MyFactorialThread(ClientService cs, int n) {
		super();
		this.cs = cs;
		this.n = n;
		
	}

	public void run() {
		System.out.println("Factorial :" +cs.factorial(5));
	}

}
