package com.demo.test;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

import com.demo.bean.Person;
import com.demo.service.PersonService;
import com.demo.service.PersonServiceImpl;

public class TestPersonSet {
	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		//service class object to call methods of service layer
		PersonService personService=new PersonServiceImpl();
		do {
		System.out.println("1. add new person\n 2. Delete Person \n3. update desg");
		System.out.println("4. search by by id\n 5. Display all\n 7. Exit");
		System.out.println("choice: ");
		choice=sc.nextInt();
		//switcase for all option
		switch(choice) {
		case 1:
			personService.addPerson();
			break;
		case 2:
			System.out.println("Enter id");
			int id=sc.nextInt();
			boolean flag=personService.deletePerson(id);
			if (flag) {
				System.out.println("deletion done");
			}
			else {
				System.out.println("person not found");
			}
			
			break;
		case 3:
			
			
			break;
		case 4:
			System.out.println("Enter id");
			 id=sc.nextInt();
			Person p=personService.SearchById(id);
			
			
			break;
		case 5:
			Set<Person> perSet=personService.getAllPerson();			
			for(Person per:perSet) {
				System.out.println(per);
			}
			//elist.forEach(e1->{System.out.println(e1);});  //consumer
			//elist.forEach(System.out::println);
			break;
		case 7:
			sc.close();
			System.exit(0);
			break;
		}
		}while(choice!=7);
	}

}
