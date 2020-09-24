//Author : Akanksha Shrivastava
//Purpose : Data Access Interface which lists the methods for addition and retrieval of product data.

package com.exam.dao;

import com.exam.bean.Product;
import com.exam.exception.DuplicateIdException;
import com.exam.exception.ItemNotFoundException;

public interface ProductDao {

	boolean addNewProduct(Product ob);//throws DuplicateIdException;
	
	void retrieve(Product ob); //throws ItemNotFoundException;
	
	void report(Product ob);
}
