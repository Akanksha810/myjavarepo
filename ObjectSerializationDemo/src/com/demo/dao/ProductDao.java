package com.demo.dao;

import java.util.Set;

import com.demo.bean.Product;

public interface ProductDao {

	boolean addProduct(Product p);

	Set<Product> getAllProduct();

	void readDatafromFile(String fname);

	void writeDataToFile(String fname);



}
