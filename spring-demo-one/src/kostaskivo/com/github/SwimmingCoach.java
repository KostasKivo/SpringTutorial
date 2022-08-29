package kostaskivo.com.github;

public class SwimmingCoach implements ICoach {
	
	private FortuneService fortuneService;
	
	public SwimmingCoach() {
		
	}

	public SwimmingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swimming practice for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
