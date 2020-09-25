package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.bean.Employee;


public interface EmployeeService {

	void addEmployee();

	Employee SearchById(int id);

	boolean deleteEmployee(int id);

	void closeConnection();

	List<Employee> getAllEmployee();



}
