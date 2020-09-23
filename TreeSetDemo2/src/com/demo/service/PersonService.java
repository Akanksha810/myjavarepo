package com.demo.service;

import java.util.Set;

import com.demo.bean.Person;

public interface PersonService {

	void addPerson();

	Person SearchById(int id);

	Set<Person> getAllPerson();

	boolean deletePerson(int id);



}
