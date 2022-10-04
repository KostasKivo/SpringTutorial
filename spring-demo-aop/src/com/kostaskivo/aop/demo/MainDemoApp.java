package com.kostaskivo.aop.demo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kostaskivo.aop.demo.dao.AccountDAO;
import com.kostaskivo.aop.demo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		
		try {
			List<Account> list = theAccountDAO.findAccounts();
		} catch (Exception e) {
			System.out.println("Inside catch block");
		}
		
		
		//close context
		context.close();

	}

}
