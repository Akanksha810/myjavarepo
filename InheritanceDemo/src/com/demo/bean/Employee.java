package com.demo.bean;

import java.util.Date;

abstract public class Employee extends Person{
     private String dept;
     private String desg;
     //default constructor
     public Employee() {
    	 
    	 System.out.println("in employee default constructor");
    	 dept=null;
    	 desg=null;
     }
      //parametrised constructor              
     public Employee(int id,String name,Date bDate,String mob,String dept,String desg) {
    	  super(id,name,bDate,mob);  //parametrised of Person
    	 System.out.println("in employee parametrised constructor");
    	 this.dept=dept;
    	 this.desg=desg;
     }
     
     //toString overriden method
     public String toString() {
    	 return super.toString()+"\nDepartment :"+dept+"\nDesignation  : "+desg;
    	 
     }
    abstract public double calculateSal();
    //abstract double calculateSal(int s); 
    //abstract public void f1(int i,float f); 
}
