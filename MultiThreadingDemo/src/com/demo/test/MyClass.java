package com.demo.test;

import com.demo.service.ClientService;
import com.demo.thread.MyFactorialThread;
import com.demo.thread.MyPrintTableThread;

public class MyClass {

	public static void main(String[] args) {
		ClientService cs=new ClientService();
		MyPrintTableThread th1=new MyPrintTableThread(cs, 5);
		th1.setPriority(Thread.NORM_PRIORITY+3);
		th1.start();
		
		MyPrintTableThread th2=new MyPrintTableThread(cs, 7);
		th2.start();
		MyFactorialThread th3=new MyFactorialThread(cs, 5);
		Thread th=new Thread(th3);
		
		th.start();
		try {
			th1.join(300);
			th2.join();
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of main");
		
		

	}

}
