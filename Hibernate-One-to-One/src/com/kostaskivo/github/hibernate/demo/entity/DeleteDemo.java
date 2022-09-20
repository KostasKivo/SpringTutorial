package com.kostaskivo.github.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			int id = 1;
			Instructor temp = session.get(Instructor.class, id);
			
			if(temp==null)
				System.out.println("No such object to delete");
			else {
				System.out.println("Deleting object with id" + id);
				session.delete(temp);
			}
	
			
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
		

	}
}
