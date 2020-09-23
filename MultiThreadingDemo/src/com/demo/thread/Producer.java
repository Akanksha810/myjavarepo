package com.demo.thread;

import com.demo.bean.Storage;

public class Producer extends Thread{
    private Storage s;

	public Producer(Storage s) {
		super();
		this.s = s;
	}
    public void run() {
    	for(int i=0;i<10;i++) {
			s.setN(i);
    	}
    }
    
}
