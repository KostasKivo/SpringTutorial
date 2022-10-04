package com.kostaskivo.aop.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kostaskivo.aop.demo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount) {
		System.out.println(getClass() + " addAccount is running");
	}
	
	public List<Account> findAccounts() {
		
		List<Account> list = new ArrayList<Account>();
		
		list.add(new Account("John","Snow"));
		list.add(new Account("Kyriakos","Mpakos"));
		list.add(new Account("Bananas","Tray"));
		
		return list;
	}
}
