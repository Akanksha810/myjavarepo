//Author : Akanksha Shrivastava
//Purpose : Implementation of ProductDao interface.

package com.exam.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.exam.bean.Apparel;
import com.exam.bean.Electronics;
import com.exam.bean.FoodItem;
import com.exam.bean.Product;
import com.exam.exception.DuplicateIdException;
import com.exam.exception.ItemNotFoundException;

public class ProductDaoImpl implements ProductDao {

	
	//creating sets
	static Set<FoodItem> foodItems;
	static Set<Apparel> apparelList;
	static Set<Electronics> electronicItems;
	
	static {
		
		foodItems = new TreeSet<>();
		apparelList = new TreeSet<>();
		electronicItems = new TreeSet<>();
	}

	@Override
	public boolean addNewProduct(Product ob) {//throws DuplicateIdException {
		
		if(ob instanceof FoodItem) {
			foodItems.add((FoodItem)ob);
			return true;
		}
		else if(ob instanceof Apparel) {
			apparelList.add((Apparel)ob);
			return true;
		}
		else if(ob instanceof Electronics) {
			electronicItems.add((Electronics)ob);
			return true;
		}
		else 
			return false;
	}

	@Override
	public void retrieve(Product ob) {//throws ItemNotFoundException {
		
		if(ob instanceof FoodItem) {
			for(FoodItem f:foodItems) {
				if(ob.equals(f)) {
					((FoodItem)ob).toString();
				}
			}
		}
		else if(ob instanceof Apparel) {
			for(Apparel a:apparelList) {
				if(ob.equals(a)) {
					((Apparel)ob).toString();
				}
			}
		}
		else if(ob instanceof Electronics) {
			electronicItems.add((Electronics)ob);
		}
	}

	@Override
	public void report(Product ob) {
		// TODO Auto-generated method stub
		
	}

}
