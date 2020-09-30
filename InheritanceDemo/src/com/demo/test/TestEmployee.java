package com.demo.test;

import java.util.Date;

import com.demo.bean.Employee;
import com.demo.bean.Person;
import com.demo.bean.SalariedEmp;

public class TestEmployee {

	public static void main(String[] args) {
		//ContractEmp[] carr;
		//SalariedEmp[] sarr;
		Employee[] earr=new Employee[10];
		earr[0]=new SalariedEmp();
		//ContarctEmp c=new ContractEmp();
		SalariedEmp e=new SalariedEmp(12,"aaa",new Date(),"2222","hr","mgr",20000.00,1000.00f);
		//e.calculateSal(); ///compile time static polymorphism
		System.out.println(e);
		earr[0].calculateSal();  ///static polymorphism
		e.calculateSal(23); //static polymorphism
		e.f1(10,20.0f); //static polymorphism
		System.out.println(e.getPerId());

	}

}
