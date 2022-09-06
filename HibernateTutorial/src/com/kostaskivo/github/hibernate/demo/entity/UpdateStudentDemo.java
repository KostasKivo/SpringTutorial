package com.kostaskivo.github.hibernate.demo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
						
			session.beginTransaction();
			
			
			Student temp = session.get(Student.class, 5);
			
			temp.setFirstName("John");
			
			
			session.getTransaction().commit();
			
			
		} finally {
			factory.close();
		}
	}


}
