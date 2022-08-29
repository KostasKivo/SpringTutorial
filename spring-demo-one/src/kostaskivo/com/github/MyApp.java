package kostaskivo.com.github;

public class MyApp {

	public static void main(String[] args) {
		
		ICoach theCoach = new SwimmingCoach();
		
		System.out.println(theCoach.getDailyWorkout());

	}

}
