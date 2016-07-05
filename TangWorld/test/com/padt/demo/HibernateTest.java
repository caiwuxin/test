package com.padt.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.padt.dao.TestDao;
import com.padt.entity.Admin;

public class HibernateTest {
	SessionFactory sessionFactory;
	TestDao testDao;
	@Before
	public void setUp() throws Exception {
		//º”‘ÿbeans.xml≈‰÷√Œƒº˛
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		sessionFactory=(SessionFactory)applicationContext.getBean("sessionFactory");
		//testDao=(TestDao)applicationContext.getBean("Testdao");
	}
	@Test
	public void name()
	{
		Session session=sessionFactory.openSession();
		String hql="from Admin where id = "+"'"+1+"'";
		Query query=session.createQuery(hql);
		List list=query.list();
		session.close();
		if(list.isEmpty())
			;
		else
		{
			Admin admin=(Admin)list.get(0);
			System.out.println(admin.getName());
		}
	}
}
