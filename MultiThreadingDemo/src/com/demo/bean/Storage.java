package com.demo.bean;

public class Storage {
     private int n;
     private boolean flag=false;
    synchronized public void setN(int x) {
    	if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	 n=x;
    	 flag=true;
    	 System.out.println("set N "+n);
    	 notify();
     }
    
   synchronized  public void getN() {
	   if(!flag) {
		   try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
    	 System.out.println("get N"+n);
    	 flag=false;
    	 notify();
     }
}
