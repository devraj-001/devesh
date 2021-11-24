package com.hibernate.employee;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class readEmployee_v01 {

	public static void main(String[] args)
	{
		
		SessionFactory factory = new Configuration().configure("hibernate.xml")
													.addAnnotatedClass(Employee.class)					
													.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try
		{
			
			session.beginTransaction();
			
			List<Employee> employee = session.createQuery("from Employee e WHERE" + " e.id='12' OR e.id='14'").getResultList();
			
			for(Employee theemployee : employee)
			{
				System.out.println(theemployee);
			}
		
			session.getTransaction().commit();
		}
		finally
		{
			factory.close();
		}
		
	}
	
}
