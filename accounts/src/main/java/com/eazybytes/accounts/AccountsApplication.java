package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts microservice REST API documentation",
                description = "Eazy Bank Accounts microservice REST API documentation",
                version = "v1",
                contact = @Contact(
                        name = "Madan Reddy",
                        email = "tutor@eazybytes.com",
                        url = "http://eazybytes.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://eazybytes.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Eazy Bank Accounts microservice REST API documentation",
                url = "http://eazybytes.com/docs"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
