package com.kostaskivo.github.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kostaskivo.github.hibernate.demo.entity.Course;
import com.kostaskivo.github.hibernate.demo.entity.Instructor;
import com.kostaskivo.github.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo {
	
public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			Instructor tempInstructor = new Instructor("Chad", "Terry","somethign@gmail.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("TerryCgad","somethign@gmail.com");
			
			
			session.beginTransaction();
			
			session.save(tempInstructor);
			
			session.getTransaction().commit();
			
		} finally {
			factory.close();
			session.close();
		}

	}
}
