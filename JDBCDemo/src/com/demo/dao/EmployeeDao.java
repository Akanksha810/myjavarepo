package com.demo.dao;

import java.util.List;

import com.demo.bean.Employee;

public interface EmployeeDao {

	int addEmployee(Employee e);

	void closeConnection();

	List<Employee> getAllEmployee();

	Employee searchEmployeeById(int id);

	boolean deleteEmployee(int id);

}
