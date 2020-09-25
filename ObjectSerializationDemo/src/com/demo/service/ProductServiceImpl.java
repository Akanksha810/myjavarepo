package com.demo.service;

import java.util.Scanner;
import java.util.Set;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	static {
		sc=new Scanner(System.in);
	}
   static Scanner sc;
   public ProductServiceImpl() {
	  this.productDao=new ProductDaoImpl();
    }

private ProductDao productDao;
   //to add product 
	@Override
	public boolean addProduct() {
		
		System.out.println("enter Prduct Id");
		int id=sc.nextInt();
		System.out.println("enter Prduct Name");
		sc.nextLine();
		String pname=sc.nextLine();
		System.out.println("enter Prduct price");
		double price=sc.nextDouble();
		System.out.println("enter Prduct quantity");
		int qty=sc.nextInt();
		Product p=new Product(id,pname,price,qty);
		/*Product p=new Product();
		p.setPid(id);
		p.setPname(pname);
		p.setPrice(price);
		p.setQty(qty);*/
		return productDao.addProduct(p);
	}
	//get product list from Dao layer
	@Override
	public Set<Product> getProductList() {
		return productDao.getAllProduct();
	}
	@Override
	public void readData(String fname) {
		productDao.readDatafromFile(fname);
		
	}
	
	//writing data to file before exiting
	@Override
	public void writeData(String fname) {
		productDao.writeDataToFile(fname);
		
	}

}
