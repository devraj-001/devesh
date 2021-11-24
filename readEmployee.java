package com.hibernate.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class readEmployee {

	public static void main(String[] args)
	{
		
		SessionFactory factory = new Configuration().configure("hibernate.xml")
													.addAnnotatedClass(Employee.class)					
													.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try
		{
			
			session.beginTransaction();
			Employee temp=new Employee("daveda","batistasa","HCL");
			session.save(temp);
			session.getTransaction().commit();
			
			session=factory.getCurrentSession();
			session.beginTransaction();
			session.get(Employee.class, temp.getId());
			System.out.println("read this student "+temp.getId());
			session.getTransaction().commit();
		}
		finally
		{
			factory.close();
		}
		
	}
	
}
