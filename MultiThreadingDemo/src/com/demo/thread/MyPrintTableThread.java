package com.demo.thread;

import com.demo.service.ClientService;

public class MyPrintTableThread extends Thread {
	private ClientService cs;
	private int n;
	
	
	public MyPrintTableThread(ClientService cs, int n) {
		super();
		this.cs = cs;
		this.n = n;
	}


	public void run() {
		cs.printTable(n);
	}

}
