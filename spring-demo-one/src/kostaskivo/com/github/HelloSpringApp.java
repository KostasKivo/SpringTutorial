package kostaskivo.com.github;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	// Inversion of Control and setting up the bean example
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		SwimmingCoach theCoach = context.getBean("randomFortuneCoach", SwimmingCoach.class);
		
		//call methods of bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();
	}

}
