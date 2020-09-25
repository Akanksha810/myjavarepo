package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.bean.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestCRUDusingfile {
	public static void main(String[] args) {
		ProductService productService=new ProductServiceImpl();
		Scanner sc=new Scanner(System.in);
		//will read data from file if exists
		productService.readData("productData.dat");
		int choice=0;
		do {
		System.out.println("1.add new object\n2.delete product\n3.update price and qty\n");
		System.out.println("4.display by id\n5.Display all Product\n6.exit");
		System.out.println("choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			boolean flag=productService.addProduct();
			if(flag) {
				System.out.println("product added");
			}
			else {
				System.out.println("error occured");
			}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			//get all products
			Set<Product> pset=productService.getProductList();
			for(Product p:pset) {
				System.out.println(p);
			}
			break;
		case 6:
			productService.writeData("productData.dat");
			System.exit(0);
			break;
		}
		}while(choice!=6);
		
	}

}
