package com.hibernate.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class deleteEmployee {

	public static void main(String[] args)
	{
		
		SessionFactory factory=new Configuration().configure("hibernate.xml")
												.addAnnotatedClass(Employee.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
	
		
		try
		{
			
			int employeeid=12;
			session.beginTransaction();
			
			Employee emp = session.get(Employee.class, employeeid);
			session.delete(emp);
			
			session.getTransaction().commit();
			
		}
		
		finally
		{
			factory.close();
		}
	}
	
}
