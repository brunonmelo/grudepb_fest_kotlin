package com.grudepb.fest.kotlin.api;

import com.grudepb.fest.kotlin.api.infrastructure.configuration.SwaggerConfig;
import com.grudepb.fest.kotlin.api.infrastructure.configuration.properties.ApplicationProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperty.class)
@Import(SwaggerConfig.class)
public class GrudePbFestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrudePbFestApplication.class, args);
	}

}
