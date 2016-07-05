package com.padt.dao;

import com.padt.demo.Person;

public class TestSetDao {

	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	public String out()
	{
		System.out.println(person);
		return null;
	}
}
