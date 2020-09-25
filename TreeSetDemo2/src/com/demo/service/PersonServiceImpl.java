package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

import com.demo.bean.Person;

import com.demo.dao.PersonDao;
import com.demo.dao.PersonDaoImpl;


public class PersonServiceImpl implements PersonService{
      private PersonDao perDao;
      static Scanner sc;
      static SimpleDateFormat sdf;
      static {
    	  sc=new Scanner(System.in);
    	  sdf=new SimpleDateFormat("dd/MM/yyyy");
  	
      }
      
	public PersonServiceImpl() {
		this.perDao=new PersonDaoImpl();
	}

	@Override
	public void addPerson() {
		System.out.println("enter Id");
		int id=sc.nextInt();
		System.out.println("enter Name");
		sc.nextLine();
		String nm=sc.nextLine();
		System.out.println("enter mobile");
		String mob=sc.next();
		System.out.println("enter bdate");
		String bdate=sc.next();
		try {
				Date bdt=sdf.parse(bdate);
				Person p=new Person(id,nm,bdt,mob);
				perDao.addPerson(p);
		   } catch (ParseException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
		   }
				
		
		
	}

	@Override
	public Person SearchById(int id) {
		return perDao.searchPerById(id);
	}

	@Override
	public Set<Person> getAllPerson() {
		return perDao.getAllPerson();
	}

	@Override
	public boolean deletePerson(int id) {
		return perDao.deletePerson(id);
	}
      
}
