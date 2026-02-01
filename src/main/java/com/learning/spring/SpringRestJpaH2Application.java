package com.learning.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * Spring Boot Application to perform CRUD operation using static data from list and from H2 DB through JPA
 * 
 */
@SpringBootApplication
public class SpringRestJpaH2Application 
{
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestJpaH2Application.class, args);
	}

}
