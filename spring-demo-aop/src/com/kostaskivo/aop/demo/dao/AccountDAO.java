package com.kostaskivo.aop.demo.dao;

import org.springframework.stereotype.Component;

import com.kostaskivo.aop.demo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount) {
		System.out.println(getClass() + " addAccount is running");
	}
}
