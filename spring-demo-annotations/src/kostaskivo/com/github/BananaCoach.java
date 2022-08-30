package kostaskivo.com.github;

import org.springframework.stereotype.Component;

@Component
public class BananaCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Let's do some banana practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
