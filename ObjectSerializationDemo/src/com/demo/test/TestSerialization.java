package com.demo.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Product;

public class TestSerialization {

	public static void main(String[] args) {
		List<Product> plist=new ArrayList<>();
		plist.add(new Product(12,"lays",40.00,34));
		plist.add(new Product(13,"maggi",40.00,35));
		plist.add(new Product(14,"dairy milk",100.00,50));
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("product.dat"))){
			for(Product p:plist) {
				oos.writeObject(p);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		///reading data
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("product.dat"))){
			while(true) {
				try {
				Product p=(Product)ois.readObject(); 
				System.out.println(p);
				}catch(EOFException e) {
					System.out.println("reached to end of file......");
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
