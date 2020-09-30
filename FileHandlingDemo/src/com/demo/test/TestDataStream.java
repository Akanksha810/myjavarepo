package com.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestDataStream {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//using autoclosable rsource
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("mycopy1.dat"));
				
			DataInputStream dis=new DataInputStream(new FileInputStream("mydata.dat"));
				) {
			String s1=dis.readLine();
			
			//Scanner sc=new Scanner()
			//StringTokenizer
			
			System.out.println(s1);
			System.out.println("enter number");
			int id=sc.nextInt();
			System.out.println("enter name");
			sc.nextLine();
			String nm=sc.nextLine();
			System.out.println("enter price");
			double pr=sc.nextDouble();
			dos.writeInt(id);
			dos.writeUTF(nm);
			dos.writeDouble(pr);
			
			System.out.println("readdata from the file");
			
			int num=dis.readInt();
			String name=dis.readUTF();
			double price=dis.readDouble();
			System.out.println(num+","+name+","+price);
			
			       
			
			
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
		catch(IOException e) {
			
		}
	}

}
