package com.restfuljersey.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.restfuljersey.entity"})
@EnableJpaRepositories(basePackages = {"com.restfuljersey.repository"})
@ComponentScan(basePackages = {"com.restfuljersey"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}	
}