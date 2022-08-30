package kostaskivo.com.github;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BananaConfig.class);
		
		Coach theCoach = context.getBean("BananaCoach",BananaCoach.class);
								
		System.out.println(theCoach.getDailyFortune());
				
		context.close();

	}

}
