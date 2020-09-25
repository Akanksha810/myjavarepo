package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.bean.Employee;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;


public class EmployeeServiceImpl implements EmployeeService{
      private EmployeeDao employeeDao;
      static Scanner sc;
      static SimpleDateFormat sdf;
      static {
    	  sc=new Scanner(System.in);
    	  sdf=new SimpleDateFormat("dd/MM/yyyy");
  	
      }
      
	public EmployeeServiceImpl() {
		this.employeeDao=new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee() {
		System.out.println("enter Id");
		int id=sc.nextInt();
		System.out.println("enter Name");
		sc.nextLine();
		String nm=sc.nextLine();
		System.out.println("enter sal");
		double sal=sc.nextDouble();
		System.out.println("enter deptId");
		int did=sc.nextInt();
		System.out.println("enter Date of Joinig(dd/MM/yyyy)");
		String bdate=sc.next();
		try {
				Date bdt=sdf.parse(bdate);
				Employee e=new Employee(id,nm,sal,bdt,did);
				int n=employeeDao.addEmployee(e);
		   } catch (ParseException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
		   }
				
		
		
	}

	@Override
	public Employee SearchById(int id) {
		return employeeDao.searchEmployeeById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

	@Override
	public boolean deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}
    public void closeConnection() {
    	employeeDao.closeConnection();
    }  
}
