package com.demo.dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.demo.bean.Person;

public class PersonDaoImpl implements PersonDao{
	TreeSet<Integer> ts;	
	Set<Person> s=new HashSet<>();
	static Map<Integer,Person> perMap;
	static {
		perMap=new HashMap<>();
	}

	@Override
	public boolean addPerson(Person p) {
		System.out.println("in Dao add");
		if(perMap.containsKey(p.getPerId())) {
			return false;}
		else {
		    perMap.put(p.getPerId(),p);
		    return true;
		}
	}

	@Override
	public Person searchPerById(int id) {
		return perMap.get(id);
	}

	@Override
	public Map<Integer,Person> getAllPerson() {
		return perMap;
	}

	@Override
	public boolean deletePerson(int id) {
		
		if(perMap.remove(id)!=null) {
			return true;
		};
		return false;
	}

	@Override
	public boolean updateMob(int id, Person p) {
		     perMap.put(id,p);
		     return true;
		
	}

	

}
