// Author : Akanksha Shrivastava
// Purpose : abstract Product entity class acting as base class to all kinds of products.

package com.exam.bean;

abstract public class Product {

	//data members
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int quantity;
	
	//default constructor
	public Product() {
		
		itemCode = 0;
		itemName = null;
		unitPrice = 0.0;
		quantity = 0;
	}
	
	//parameterized constructor
	public Product(int itemCode, String itemName, double unitPrice, int quantity) {
		
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	//setter and getter methods
	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//Overriding toString method from Object class
	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", quantity="
				+ quantity + "]";
	}
}
