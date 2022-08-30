package kostaskivo.com.github;

import org.springframework.stereotype.Component;

@Component
public class BananaCoach implements Coach {
	
	public FortuneService sadFortuneService;
	
	public BananaCoach(FortuneService sadFortuneService) {
		this.sadFortuneService = sadFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Let's do some banana practice";
	}

	@Override
	public String getDailyFortune() {
		return sadFortuneService.getFortune();
	}

}
