package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

import com.demo.bean.Product;

public class ProductDaoImpl implements ProductDao{
     static Set<Product> hashSet;
     static {
    	 hashSet=new HashSet<>();
     }
	@Override
	public boolean addProduct(Product p) {
		return hashSet.add(p);
	}
	@Override
	public Set<Product> getAllProduct() {
		return hashSet;
	}
	@Override
	public void readDatafromFile(String fname) {
		System.out.println("in read data of dao");
		File f=new File(fname);
		if(f.exists()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname))){
				while(true) {
					try {
					Product p=(Product) ois.readObject();
					hashSet.add(p);
					}catch(EOFException e) {
						System.out.println("Reched to EOF......");
						break;
					}
				}
				System.out.println(hashSet.size());
			
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
	@Override
	public void writeDataToFile(String fname) {
		System.out.println("in write data of dao");
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fname));){
			
			for(Product p:hashSet) {
				oos.writeObject(p);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
