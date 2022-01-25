package io.github.leandrogomides.nttMED;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class NttMedApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttMedApplication.class, args);
	}

}
