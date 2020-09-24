// Author : Akanksha  Shrivastava
// Purpose : Apparel entity class that is a child of product and lists details of apparel items.

package com.exam.bean;

public class Apparel extends Product {

	//data members
	private String size;
	private String material;
	
	//default constructor
	public Apparel() {
		super();
		size = null;
		material = null;
	}

	//parameterized constructor
	public Apparel(String size, String material) {
		super();
		this.size = size;
		this.material = material;
	}

	//setter and getter methods
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	// Overriding toString method
	@Override
	public String toString() {
		return super.toString() +"Apparel [size=" + size + ", material=" + material + ", toString()=" + "]";
	}
}
