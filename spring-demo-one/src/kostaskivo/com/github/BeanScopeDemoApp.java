package kostaskivo.com.github;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-Scope-applicationContext.xml");
		
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		ICoach anotherCoach = context.getBean("myCoach", ICoach.class);
		
		boolean flag = (theCoach==anotherCoach);
		
		System.out.println("Pointing to the same object: " + flag);
		
		System.out.println("Ob1 pointing to memory" + theCoach);
		
		System.out.println("Ob2 pointing to memory" + anotherCoach);
		
		context.close();

	}

}
