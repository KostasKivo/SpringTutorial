package kostaskivo.com.github;

public class CricketCoach implements ICoach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String  team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Now setting the email adress field");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Now setting the team adress field");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Inside no param cricket constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practising cricket for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	

}
