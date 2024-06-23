package com.expleo.eurka_server;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@OpenAPIDefinition(
		info = @Info(
				title = "Eureka Server API Documentation",
				description = "MyFinEx Eureka Server microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Anish Alwekar",
						email = "anish.alwekar@gmail.com",
						url = "https://github.com/MentalCoder91"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/MentalCoder91"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "MyFinEx Eureka Server microservice REST API Documentation",
				url = "http://localhost:8761/swagger-ui/index.html"
		)
)
public class EurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}

}
