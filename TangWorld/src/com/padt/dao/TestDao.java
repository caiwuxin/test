package com.padt.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.padt.entity.Admin;

public class TestDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public String getNameById(int id)
	{
		Session session=sessionFactory.openSession();
		String hql="from Admin where id = "+"'"+id+"'";
		Query query=session.createQuery(hql);
		List list=query.list();
		session.close();
		if(list.isEmpty())
			return null;
		else
		{
			Admin admin=(Admin)list.get(0);
			return admin.getName();
		}
	}
}
