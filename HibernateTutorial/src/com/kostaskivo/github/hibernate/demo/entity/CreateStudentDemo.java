package com.kostaskivo.github.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			Student s = new Student("Another","Example","readexample@gmail.com");
			
			session.beginTransaction();
			
			session.save(s);
			
			session.getTransaction().commit();
			
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("Getting student with ID + " + s.getId());
			
			Student temp = session.get(Student.class, s.getId());
			
			System.out.println(temp);
			
			session.getTransaction().commit();
			
			
		} finally {
			factory.close();
		}
		

	}
}
