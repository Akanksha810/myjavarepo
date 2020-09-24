// Author : Akanksha Shrivastava
// Purpose : Electronics entity class that inherits Product class and contains details about electronic items. 

package com.exam.bean;

public class Electronics extends Product {

	//data memebers
	private int warranty;

	//default constructor 
	public Electronics() {
		warranty = 0;
	}

	//parameterized constructor
	public Electronics(int warranty) {
		super();
		this.warranty = warranty;
	}

	//setter and getter methods
	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	//Overriding toString method
	@Override
	public String toString() {
		return super.toString()+"Electronics [warranty=" + warranty + "]";
	}	
}
