package com.kostaskivo.github.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			Student s1 = new Student("Mary","Jane","maryjane@gmail.com");
			Student s2 = new Student("Trick","Shot","trickshot@gmail.com");
			Student s3 = new Student("Lil","Pip","lilpip@gmail.com");
			
			session.beginTransaction();
			
			session.save(s1);
			session.save(s2);
			session.save(s3);
			
			session.getTransaction().commit();
			
			System.out.println("Student saved");
			
		} finally {
			factory.close();
		}
		

	}

}
