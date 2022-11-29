package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.model.Person;
import com.demo.repo.PersonRepo;

public class PersonService {

	@Autowired
	private PersonRepo repo;
	
	public List<Person> getAllPerson(){
		return repo.findAll();
	}

	public PersonService(PersonRepo repo) {
		super();
		this.repo = repo;
	}
	
}
