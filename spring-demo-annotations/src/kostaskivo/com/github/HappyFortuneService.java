package kostaskivo.com.github;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Your fortune is not that good today";
	}

}
