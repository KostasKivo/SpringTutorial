package kostaskivo.com.github;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		boolean flag = theCoach==alphaCoach;
		
//		System.out.println("Is the same bean " + flag);
//		
//		System.out.println("Memory location of 1st bean " + theCoach );
//		
//		System.out.println("Memory location of 2nd bean " + alphaCoach);
		
		
		context.close();
	}

}
