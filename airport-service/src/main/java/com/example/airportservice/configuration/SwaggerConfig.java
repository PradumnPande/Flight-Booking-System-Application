package com.example.airportservice.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Configurations for swagger
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swaggerApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.example.airportservice")).build()
                .apiInfo((apiInfo()));
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("Flight Booking System",
                "API reference example for flights details, passenger details and other", "1.0.0", "Public API",
                new Contact("Pradumn Pande", "https://github.com/PradumnPande/", "pandepraduman4@gmail.com"),
                "API License Open", "", Collections.emptyList());
    }

}