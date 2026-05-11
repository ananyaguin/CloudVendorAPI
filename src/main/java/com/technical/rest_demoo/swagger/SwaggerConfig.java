package com.technical.rest_demoo.swagger;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI cloudVendorOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Cloud Vendor API")
                        .description("Spring Boot REST API for Cloud Vendor Management")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Ananya Guin")
                                .email("yourmail@gmail.com"))
                        .license(new License()
                                .name("Apache 2.0")))
                .externalDocs(new ExternalDocumentation()
                        .description("Project Documentation"));
    }
}
