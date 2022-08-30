package kostaskivo.com.github;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println("Inside the TennisCoach default constructor");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice more on tennis";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
//	@Autowired
//	public void setFortune(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	@PostConstruct
//	public void initMethod() {
//		System.out.println("init method");
//	}
//	
//	@PreDestroy
//	public void destroyMethod() {
//		System.out.println("destroy method");
//	}

}
