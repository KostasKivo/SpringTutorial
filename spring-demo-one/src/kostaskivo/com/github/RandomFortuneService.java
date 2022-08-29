package kostaskivo.com.github;

import java.util.Random;


public class RandomFortuneService implements FortuneService {
	
	private String [] ranArr = {"bad luck","good luck","prepare to die luck"};

	@Override
	public String getFortune() {
		return ranArr[new Random().nextInt(3)];
	}

}
