package com.padt.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.padt.common.HibernateSessionFactory;
import com.padt.entity.Admin;

public class AdminDao {

	public String getNameById(int id)
	{
		Session session=getSession();
		String hql="from Admin where id = "+"'"+id+"'";
		Transaction tr = null;
		String name="";
		try {
			tr = session.beginTransaction();
			Query query = session.createQuery(hql);
			List list = query.list();
			tr.commit();
			Admin admin = null;
			if (list.size() > 0)
				admin = (Admin) list.get(0);
			if (admin == null) {
				return null;
			}
			name=admin.getName();
			
		} catch (HibernateException e) {
			if (tr != null) {
				tr.rollback();
			}
			throw e;
		}
		return name;
	}
	
	public Session getSession()
	{
		return HibernateSessionFactory.getSession();
	}
}
