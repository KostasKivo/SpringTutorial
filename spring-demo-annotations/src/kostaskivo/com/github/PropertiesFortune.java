package kostaskivo.com.github;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesFortune implements FortuneService {
	
	@Value("${fortunes}")
	private String[] arr;
	
	public PropertiesFortune() {
		System.out.println("Inside the properties something constructor");
	}

	@Override
	public String getFortune() {
		Random r =  new Random();
		return arr[r.nextInt(arr.length)];
	}

}
