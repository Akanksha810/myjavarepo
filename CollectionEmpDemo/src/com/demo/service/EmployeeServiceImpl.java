package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.demo.bean.Employee;
import com.demo.bean.SalariedEmp;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.exception.EmployeeNotFoundException;
import com.demo.exception.InvalidSalaryException;

public class EmployeeServiceImpl implements EmployeeService {
	static {
		sc=new Scanner(System.in);
		sdf=new SimpleDateFormat("dd/MM/yyyy");
	}
	private EmployeeDao employeeDao;
	public EmployeeServiceImpl() {
		this.employeeDao = new EmployeeDaoImpl();
	}
	static Scanner sc;
    static SimpleDateFormat sdf;
	
     
	@Override
	public void addNewEmployee() throws InvalidSalaryException{
		System.out.println("enter Id");
		int id=sc.nextInt();
		System.out.println("enter Name");
		sc.nextLine();
		String nm=sc.nextLine();
		System.out.println("enter mobile");
		String mob=sc.next();
		System.out.println("enter dept");
		String dt=sc.next();
		System.out.println("enter desg");
		String ds=sc.next();
		int i=0;
		///for 3 wrong attempts of invalid value of salary
		for(i=0;i<3;i++) {
			try {
				System.out.println("enter Salary");
				double sal=sc.nextDouble();
				if(sal<1000.00) {
					throw new InvalidSalaryException("salary should be >=1000");
				}
				System.out.println("enter bonus");
				float bonus=sc.nextFloat();
				System.out.println("enter bdate");
				String bdate=sc.next();
				try {
					Date bdt=sdf.parse(bdate);
					Employee e=new SalariedEmp(id,nm,bdt,mob,dt,ds,sal,bonus);
					employeeDao.addEmployee(e);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}catch(InvalidSalaryException e) {
				if (i==2) {
					throw e;
				}
				System.out.println(e.getMessage());
				
			}
		}
		
		
		
		
	}
	@Override
	public Employee searchById(int id) throws EmployeeNotFoundException {
		return employeeDao.searchByEmpId(id);
		
	}
	@Override
	public boolean updateEmp(int id,String ds) throws EmployeeNotFoundException {
		Employee e=employeeDao.searchByEmpId(id);
		if(e!=null) {
		return employeeDao.updateEmployee(ds,e);
		}
		return false;
		
	}
	@Override
	public List<Employee> getAllEmp() {
		return employeeDao.getAllEmployees();
	}
	@Override
	public boolean deleteEmloyee(int id) throws EmployeeNotFoundException {
		Employee e=employeeDao.searchByEmpId(id);
		if(e!=null) {
			return employeeDao.deletEmployee(e);
		}
		return false;
	}
	@Override
	public List<Employee> sortOnBalance() {
		return employeeDao.sortData();
	}
	

}
