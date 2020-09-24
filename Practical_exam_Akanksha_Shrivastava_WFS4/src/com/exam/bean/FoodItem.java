// Author : Akanksha Shrivastava
// Purpose : FoodItem entity class which is a child of Product class and stores details of food items.

package com.exam.bean;

import java.util.Date;

public class FoodItem extends Product {

	//data members
	private Date dateOfManufacture;
	private Date dateOfExpiry;
	private String vegetarian;
	
	//default constructor
	public FoodItem() {
		super();
		dateOfManufacture = null;
		dateOfExpiry = null;
		vegetarian = null;
	}
	//parameterized constructor
	public FoodItem(Date dateOfManufacture, Date dateOfExpiry, String vegetarian) {
		super();
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
	}
	
	//setter and getter methods
	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public String getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	//Overriding toString method
	@Override
	public String toString() {
		return super.toString()+"FoodItem [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", vegetarian="
				+ vegetarian + "]";
	}
}
