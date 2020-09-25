package com.demo.service;

public class ClientService {
	 public void printTable(int n) {
		for(int i=1;i<11;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
			
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	
	 public int factorial(int n) {
		int f=1;
		for(int i=1;i<n;i++) {
			f=f*i;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return f;
	}

}
