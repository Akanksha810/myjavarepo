package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.bean.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestCRUDJdbc {
	public static void main(String[] args) {
	int choice=0;
	Scanner sc=new Scanner(System.in);
	//service class object to call methods of service layer
	EmployeeService employeeService=new EmployeeServiceImpl();
	do {
	System.out.println("1. add new Employee\n 2. Delete Employee \n3. update desg");
	System.out.println("4. search by by id\n 5. Display all\n 7. Exit");
	System.out.println("choice: ");
	choice=sc.nextInt();
	//switcase for all option
	switch(choice) {
	case 1:
		employeeService.addEmployee();
		break;
	case 2:
		System.out.println("Enter id");
		int id=sc.nextInt();
		boolean flag=employeeService.deleteEmployee(id);
		if (flag) {
			System.out.println("deletion done");
		}
		else {
			System.out.println("Employee not found");
		}
		
		break;
	case 3:
		
		
		break;
	case 4:
		System.out.println("Enter id");
		 id=sc.nextInt();
		Employee e=employeeService.SearchById(id);
		if(e!=null) {
			System.out.println(e);
		}
		else {
			System.out.println("not found");
		}
		
		
		break;
	case 5:
		List<Employee> plist=employeeService.getAllEmployee();			
		for(Employee per:plist) {
			System.out.println(per);
		}
		//elist.forEach(e1->{System.out.println(e1);});  //consumer
		//elist.forEach(System.out::println);
		break;
	case 7:
		sc.close();
		employeeService.closeConnection();
		System.exit(0);
		break;
	}
	}while(choice!=7);
}

}
