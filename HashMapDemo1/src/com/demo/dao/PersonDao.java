package com.demo.dao;

import java.util.Map;
import java.util.Set;

import com.demo.bean.Person;

public interface PersonDao {

	boolean addPerson(Person p);

	Person searchPerById(int id);

	Map<Integer, Person> getAllPerson();

	boolean deletePerson(int id);

	boolean updateMob(int id, Person p);

}
