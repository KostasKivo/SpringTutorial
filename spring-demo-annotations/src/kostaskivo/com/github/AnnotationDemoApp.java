package kostaskivo.com.github;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from container
		
		Coach theCoach = context.getBean("bananaCoach",BananaCoach.class);
		
		//do things with bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();

	}

}
