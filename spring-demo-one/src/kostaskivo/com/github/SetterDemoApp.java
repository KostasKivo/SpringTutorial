package kostaskivo.com.github;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//retrieve bean from container
		CricketCoach theCoach = context.getBean("CricketCoach", CricketCoach.class);
				
		//call methods of bean
		System.out.println(theCoach.getDailyWorkout());
				
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
				
		//close context
		context.close();

	}

}
