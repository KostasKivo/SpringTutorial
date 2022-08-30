package kostaskivo.com.github;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();

	}

}
