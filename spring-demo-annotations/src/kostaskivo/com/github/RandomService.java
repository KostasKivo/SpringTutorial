package kostaskivo.com.github;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {
	

	@Override
	public String getFortune() {
		return "You have really random fortune today";
	}

}
