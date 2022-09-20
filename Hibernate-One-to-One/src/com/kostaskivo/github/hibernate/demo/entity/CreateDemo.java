package com.kostaskivo.github.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			Instructor tempInstructor = new Instructor("Chad", "Terry","somethign@gmail.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("TerryCgad","somethign@gmail.com");
			
			//Associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			session.beginTransaction();
			
			//Because of CascadeType it will also save the InstructorDetail
			session.save(tempInstructor);
			
			
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
		

	}
}
