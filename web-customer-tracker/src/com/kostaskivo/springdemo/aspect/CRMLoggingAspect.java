package com.kostaskivo.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* com.kostaskivo.springdemo.controllers.*.*(..))")
	private void forControllerPackage() {}
	
	@Pointcut("execution(* com.kostaskivo.springdemo.service.*.*(..))")
	private void forServicePackage() {}
	
	@Pointcut("execution(* com.kostaskivo.springdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	private void forAppFlow() {}
	
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint) {
		
		String method = theJoinPoint.getSignature().toShortString();
		myLogger.info("====>> in @Before: calling method: " + method);
		
		Object[] args = theJoinPoint.getArgs();
		for(Object o:args)
			myLogger.info("====> arguement: " + args);
		
	}
	
	@AfterReturning(
			pointcut = "forAppFlow()",
			returning = "theResult"
			)
	public void afterReturning(JoinPoint theJoinPoint, Object theResult) {
		
		String method = theJoinPoint.getSignature().toShortString();
		myLogger.info("====>> in @AfterReturning: calling method: " + method);
		
		myLogger.info("====> result: " + theResult);
	}

}
