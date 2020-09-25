package com.demo.dao;

import java.util.Set;

import com.demo.bean.Person;

public interface PersonDao {

	void addPerson(Person p);

	Person searchPerById(int id);

	Set<Person> getAllPerson();

	boolean deletePerson(int id);

}
