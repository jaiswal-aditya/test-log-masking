package com.test.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:camelContext.xml")
@ComponentScan("org.test.application")
public class MainApplication {
	public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
	}
}
