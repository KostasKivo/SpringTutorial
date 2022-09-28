package com.kostaskivo.aop.demo.dao;

import org.springframework.stereotype.Component;

import com.kostaskivo.aop.demo.Account;

@Component
public class AccountDAO {
	
	private String name;
	
	private String serviceCode;

	public void addAccount(Account theAccount) {
		System.out.println(getClass() + " addAccount is running");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	
	
}
