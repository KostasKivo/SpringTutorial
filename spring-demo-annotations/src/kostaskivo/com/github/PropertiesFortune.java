package kostaskivo.com.github;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesFortune implements FortuneService {
	
	@Value("${fortunes}")
	private String[] arr;


	@Override
	public String getFortune() {
		Random r =  new Random();
		return arr[r.nextInt(arr.length)];
	}
	
//	@PostConstruct
//	public void readProperties() {
//		for(String s:arr)
//			System.out.println(s);
//	}
	
//	@PreDestroy
//	public void deleteBean() {
//		System.out.println("All of the properties (should) have been read");
//	}

}
