package dev.mattson.scoreAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.mattson"})
@EntityScan(basePackages = {"dev.mattson.entities"})
@EnableJpaRepositories(basePackages = {"dev.mattson.repos"})
public class ScoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScoreApiApplication.class, args);
	}

}
