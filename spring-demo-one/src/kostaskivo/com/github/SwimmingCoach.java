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
	
	public void doingStartupStuff() {
		System.out.println("SwimmingCoach: Doing startup stuff");
	}
	
	public void doingCleanupStuff() {
		System.out.println("SwimmingCoach: Doing cleanup stuff");
	}

}
