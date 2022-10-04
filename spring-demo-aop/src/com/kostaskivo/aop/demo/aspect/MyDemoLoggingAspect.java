package com.kostaskivo.aop.demo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.kostaskivo.aop.demo.Account;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Before("execution(public * add*())")
	public void beforeAddAccountAdvice() {
		System.out.println("@Before addAccount() advice");
	}
	
	
	@AfterReturning(
			pointcut = "execution(* com.kostaskivo.aop.demo.dao.AccountDAO.findAccounts(..))",
			returning = "result")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinpoint, List<Account> result) {
		
		String method = theJoinpoint.getSignature().toShortString();
		System.out.println(method);
		
		System.out.println(result);
	}
	
	@AfterThrowing(
			pointcut = "execution(* com.kostaskivo.aop.demo.dao.AccountDAO.findAccounts(..))",
			throwing = "exception"
			)
	public void afterThrowingFindAccountsAdvice(Exception exception) {
		System.out.println("Inside the afterThrowing advice" + exception);
	}
	
	@After("execution(* com.kostaskivo.aop.demo.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice() {
		System.out.println("Finally advice for findAccounts");
	}

}
