package kostaskivo.com.github;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BananaConfig {
	
	@Bean 
	public FortuneService randomFortune() {
		return new DatabaseFortuneService();
	}
	
	@Bean
	public Coach BananaCoach() {
		return new BananaCoach(randomFortune());
	}

}
