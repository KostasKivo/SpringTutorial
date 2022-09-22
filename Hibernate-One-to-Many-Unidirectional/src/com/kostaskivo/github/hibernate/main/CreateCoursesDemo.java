package com.kostaskivo.github.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kostaskivo.github.hibernate.demo.entity.Course;
import com.kostaskivo.github.hibernate.demo.entity.Instructor;
import com.kostaskivo.github.hibernate.demo.entity.InstructorDetail;
import com.kostaskivo.github.hibernate.demo.entity.Review;

public class CreateCoursesDemo {
	
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {			
			
			session.beginTransaction();
			
			Course c = new Course("Pacman");
			
			c.addReview(new Review("So good "));
			c.addReview(new Review("So bad "));
			c.addReview(new Review("So average "));
			
			session.save(c);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			session.close();
			
			factory.close();
		}
	}
}
