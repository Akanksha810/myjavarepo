package com.demo.thread;

import com.demo.bean.Storage;

public class Consumer extends Thread {
	private Storage s;

	public Consumer(Storage s) {
		super();
		this.s = s;
	}
	public void run() {
       for(int i=0;i<10;i++) {
			
			s.getN();
		}
	}
}
