package in.AnthonyAndrews.OnlineBookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@ComponentScan({"in.AnthonyAndrews.OnlineBookStore.controller"})
@EntityScan({"in.AnthonyAndrews.OnlineBookStore.model"})
@EnableJpaRepositories({"in.AnthonyAndrews.OnlineBookStore.DAO"})
public class OnlineBookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookStoreApplication.class, args);
	}

}
