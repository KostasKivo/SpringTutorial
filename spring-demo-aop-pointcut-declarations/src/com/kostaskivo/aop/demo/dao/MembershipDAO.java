package com.kostaskivo.aop.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public String addAccount() {
		System.out.println(getClass() + " addAccount is running");
		return null;
	}

}
