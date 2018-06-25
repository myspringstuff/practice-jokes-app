package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class PracticeJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeJokesAppApplication.class, args);
	}
}
