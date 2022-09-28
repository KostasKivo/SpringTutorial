package com.kostaskivo.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kostaskivo.aop.demo.dao.AccountDAO;
import com.kostaskivo.aop.demo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		//call the business method
		theAccountDAO.addAccount(new Account());
		theMembershipDAO.addAccount();
		
		//close context
		context.close();

	}

}
