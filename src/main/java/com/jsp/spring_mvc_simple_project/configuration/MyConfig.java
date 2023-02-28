package com.jsp.spring_mvc_simple_project.configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp.spring_mvc_simple_project")
public class MyConfig {
	
	@Bean
	public EntityManagerFactory getEntityManagerFactory() {
		
		return Persistence.createEntityManagerFactory("sumit");
	}

}
