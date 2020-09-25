package com.demo.dao;

import java.util.Set;
import java.util.TreeSet;

import com.demo.bean.Person;

public class PersonDaoImpl implements PersonDao{
	static {
		treeSet=new TreeSet<>();
	}
    static Set<Person> treeSet;
	@Override
	public boolean addPerson(Person p) {
		return treeSet.add(p);
	}

}
