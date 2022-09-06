package com.kostaskivo.github.hibernate.demo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			List<Student> l1 = session.createQuery("from Student").getResultList();
			
			printList(l1);
			
			List<Student> l2 = session.createQuery("from Student s where s.lastName='Pip'").getResultList();
			
			printList(l2);
			
			List<Student> l3 = session.createQuery("from Student s where s.lastName='Pip' OR s.firstName='Mary'").getResultList();
			
			printList(l3);
			
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
	}
	
	public static void printList(List<Student> l) {
		for(Student s:l)
			System.out.println(s);
	}

}
