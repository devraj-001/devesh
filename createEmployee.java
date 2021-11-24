package com.hibernate.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class createEmployee {

	public static void main(String[] args) {
		
		SessionFactory factory= new Configuration().configure("hibernate.xml")
									.addAnnotatedClass(Employee.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try
		{
			System.out.println("Creating new employees !");
			Employee temp1=new Employee("John","walker","TCS");
			Employee temp2=new Employee("John","Cena","Wipro");
			Employee temp3=new Employee("Paul","walker","TCL");
			Employee temp4=new Employee("Vin","Deisel","Infy");
			Employee temp5=new Employee("Buffet","warren","Morgan");
			
			session.beginTransaction();
			
			session.save(temp1);
			session.save(temp2);
			session.save(temp3);
			session.save(temp4);
			session.save(temp5);
			
			session.getTransaction().commit();
			
		}
		finally
		{
			factory.close();
		}
		
	}

}
