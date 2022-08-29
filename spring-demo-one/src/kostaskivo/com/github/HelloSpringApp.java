package kostaskivo.com.github;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	// Inversion of Control and setting up the bean example
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		//call methods of bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();
	}

}
