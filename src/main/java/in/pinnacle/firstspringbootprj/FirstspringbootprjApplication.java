package in.pinnacle.firstspringbootprj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstspringbootprjApplication {

	private static String getName() {
		return "First spring boot application";
	}

	public static void main(String[] args) {
		System.out.println("Hello World: " + getName());
		SpringApplication.run(FirstspringbootprjApplication.class, args);
	}

}
