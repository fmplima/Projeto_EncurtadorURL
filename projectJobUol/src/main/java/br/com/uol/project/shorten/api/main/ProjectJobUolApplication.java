package br.com.uol.project.shorten.api.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.uol.project.shorten.api")
public class ProjectJobUolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectJobUolApplication.class, args);
	}

}

