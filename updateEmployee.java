package com.hibernate.employee;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class updateEmployee {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
									.configure("hibernate.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try
		{
			int employeeId=14;
			session.beginTransaction();
			
			Employee theEmployee = session.get(Employee.class, employeeId);
			theEmployee.setFirstname("chai");
			theEmployee.setLastname("sutta");
			
			session.getTransaction().commit();
		}
		finally
		{
			factory.close();
		}
		
	}

}
