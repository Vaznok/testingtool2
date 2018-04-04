package com.epam.rd;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@EnableJpaRepositories("com.*")
@SpringBootApplication(scanBasePackages = "com.*")
@EntityScan("com.*")
@EnableJSONDoc
@EnableConfigurationProperties
public class Application {

    @Bean
    public Jackson2ObjectMapperBuilder objectMapperBuilder() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.serializationInclusion(JsonInclude.Include.NON_EMPTY);
        return builder;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
