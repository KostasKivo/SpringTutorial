package kostaskivo.com.github;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Your fortune today involves a lot of databases";
	}

}
