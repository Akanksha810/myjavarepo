package com.demo.bean;
import java.util.Date;

public class Person implements Comparable<Person> {
	private int perId;
	private String perName;
	private Date bDate;
	private String mobile;
	
	//Default Constructor
	public Person() {
		System.out.println("in person default constructor");
		perId=0;
		perName=null;
		bDate=null;
		mobile=null;
	}
	
	//parametrised constructor
	public Person(int id,String perName,Date bDate,String mob) {
		System.out.println("in person parametrised constructor");
		this.perId=id;
		this.perName=perName;
		this.bDate=bDate;
		this.mobile=mob;
		
	}
	public Person(int id) {
		this.perId=id;
	}
	//Id will be considered as hashcode
    @Override
	public int hashCode() {
    	System.out.println("hash code in person");
    	return perId;
		//return perId+perName.hashCode();
	}

    //equals for comparing id of 2 objects
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals in person"+this.perId+"----"+((Person)obj).perId);
	    if(this.perId==((Person)obj).perId)
	    	return true;
	    return false;
	}
	///setter and getter methods
	public void setPerId(int id) {
		this.perId=id;
	}
	public int getPerId() { 
		return this.perId;
	}
	public void setPerName(String pname) {
		this.perName=pname;
	}
	public String getPerName() {
		return this.perName;
	}
	
	public void setMobile(String mob) {
		this.mobile=mob;
		
	}
	public String getMobile() {
		return this.mobile;
	}
	public void setBDate(Date dt) {
		this.bDate=dt;
	}
	public Date getDate() {
		return this.bDate;
	}
  
	@Override
	public String toString() {
		return "Id : "+perId+"\nName : "+perName+"\nMobile: "+mobile+"\nB date:"+bDate;
		
	}

	@Override
	public int compareTo(Person ob) {
		System.out.println("In person compareTo"+perId+"----"+ob.perId);
		if(this.perId<ob.perId) {
			return -1;
		}else if(this.perId==ob.perId) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	
	/*public void display() {
		System.out.println("Id : "+this.perId);
		System.out.println("Name : "+this.perName);
		System.out.println("bDate : ");
		System.out.println("Mobile :"+mobile);
		
	}*/
	
	/*  this is destructor
	 * public void finalize(){
		
	}*/
	/*public void f1() {
		
	}*/
	
	

}
