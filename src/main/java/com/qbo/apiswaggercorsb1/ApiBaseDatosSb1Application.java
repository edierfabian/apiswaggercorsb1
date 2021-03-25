package com.qbo.apiswaggercorsb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableSwagger2
public class ApiBaseDatosSb1Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiBaseDatosSb1Application.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigure() {
		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				
				registry
				.addMapping("/api/v1/cliente/**")
				.allowedMethods("GET","POST","DELETE","PUT")
				.allowedOrigins("*");
			}
			
			
		};
		
	}
}
