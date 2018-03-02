package com.jensonjo.spring.mockito_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MockitoTestApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MockitoTestApplication.class, args);

		for (String name: applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}
