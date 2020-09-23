package com.demo.service;

import java.util.Map;
import java.util.Set;

import com.demo.bean.Person;

public interface PersonService {

	boolean addPerson();

	Person SearchById(int id);

	Map<Integer, Person> getAllPerson();

	boolean deletePerson(int id);

	boolean updateMob(int id, String mob);



}
