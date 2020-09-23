package com.demo.test;

import java.util.Scanner;

import com.demo.service.ClientService;
import com.demo.thread.MyFactorialThread;
import com.demo.thread.MyPrintTableThread;

public class TestClient {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ClientService cs=new ClientService();
		MyPrintTableThread th1=null,th2=null;
		Thread th=null;
		int choice=0;
		do {
		System.out.println("1.Printtable\n2.Factorial\n3.exit");
		System.out.println("choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			th1=new MyPrintTableThread(cs,5);
			th1.start();
			 th2=new MyPrintTableThread(cs,7);
			th2.start();
			break;
		case 2:
			MyFactorialThread th3=new MyFactorialThread(cs,5);
			th=new Thread(th3);
			th.start();
			break;
		case 3:
			   try{
				th1.join();
				th2.join();
				th.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("end of main");
			System.exit(0);
		}
		}while(choice!=3);
	}

}
