package com.example.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
/*@OpenAPIDefinition(
		info = @Info(
		title = "Accounts microservice REST API Documentation",
		description = "Accounts microservice REST API Documentation",
		version = "v1",
		contact = @Contact(
		name = "Disha Nayak",
		email = "dishanayak395@gmail.com"
		),
		license = @License(
		name = "Apache 2.0"
		),
		externalDocs = @ExternalDocumentation(
		description = "Accounts Microservice REST API Documentation",
		url = "http://localhost:8080/context-path/swagger-ui.html
		)
		)
)*/
public class  AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
