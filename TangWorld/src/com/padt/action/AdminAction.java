package com.padt.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.padt.dao.AdminDao;
import com.padt.dao.TestDao;
import com.padt.demo.Person;

public class AdminAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TestDao testDao;
	private Person person;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public TestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	public String test()
	{
		//AdminDao a=new AdminDao();
		//String name=a.getNameById(1);
		String name=testDao.getNameById(1);
		//System.out.println(name);
		int eye=person.getEyes();
		System.out.println(eye);
		return SUCCESS;
	}
	public String mmm()
	{
		
		return ERROR;
	}
	
	
}
