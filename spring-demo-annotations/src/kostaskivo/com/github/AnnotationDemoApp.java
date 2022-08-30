package kostaskivo.com.github;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from container
		
		Coach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		//do things with bean
		
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();

	}

}
