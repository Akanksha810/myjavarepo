package com.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileRead {

	public static void main(String[] args) {
		 
		 
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("mydata.dat"));
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("mycopy.dat",true));	) {
				
			int data=bis.read();
			while(data!=-1) {
				bos.write(data);
				data=bis.read();
			}
			System.out.println("file copied");
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found"+e.getMessage());
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("read write error occured"+e.getMessage());
			//e.printStackTrace();
		}
		
	}

}
