package com.demo.dao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.demo.bean.Person;

public class PersonDaoImpl implements PersonDao{
	static Set<Person> pset;
	static {
		pset=new TreeSet<>();
	}

	@Override
	public void addPerson(Person p) {
		System.out.println("in Dao add");
		pset.add(p);
		
	}

	@Override
	public Person searchPerById(int id) {
		for(Person p:pset) {
			if(p.getPerId()==id) {
				return p;
			}
		}
		return null;
	}

	@Override
	public Set<Person> getAllPerson() {
		return pset;
	}

	@Override
	public boolean deletePerson(int id) {
		Person p=new Person(id,null,null,null);
		return pset.remove(p);
	}

}
