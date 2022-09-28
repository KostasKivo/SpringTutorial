package com.kostaskivo.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
//	@Before("execution(* com.kostaskivo.aop.demo.dao.*.*(..))")
//	public void beforeAddAccountAdvice() {
//		System.out.println("@Before addAccount() advice");
//	}
	
	@Pointcut("execution(* com.kostaskivo.aop.demo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution(* com.kostaskivo.aop.demo.dao.AccountDAO.get*(..))")
	public void gettersDaoPackage() {}
	
	@Pointcut("execution(* com.kostaskivo.aop.demo.dao.AccountDAO.set*(..))")
	public void settersDaoPackage() {}
	

	@Before("forDaoPackage() && !(settersDaoPackage() || gettersDaoPackage())")
	public void beforeAddAccountAdvice() {
		System.out.println("@Before addAccount() advice");
	}
	
}
