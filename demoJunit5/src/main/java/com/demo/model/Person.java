package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	private Integer personId;
	private String personName;
	
	public Person() {
		super();
	}
	public Person(Integer personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
}
