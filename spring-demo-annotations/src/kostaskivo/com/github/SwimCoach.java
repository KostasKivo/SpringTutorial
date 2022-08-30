package kostaskivo.com.github;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	public FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim more goddamit";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
