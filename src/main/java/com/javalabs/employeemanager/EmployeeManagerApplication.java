package com.javalabs.employeemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

/**
 * Employee Manager Application
 * 
 * @author PATavares
 * @since Jan 2021
 */
@Slf4j
@SpringBootApplication
public class EmployeeManagerApplication {

	public static void main(String[] args) {
		log.info("JavaLabs - Employee Manager - v1.0 BETA");
		log.info("user.home @ {}", System.getProperty("user.home"));
		log.info("user.dir @ {}", System.getProperty("user.dir"));
		
		ApplicationContext applicationContext = SpringApplication.run(EmployeeManagerApplication.class, args);
		
		// Debug Loaded Beans in Context
		for (String name: applicationContext.getBeanDefinitionNames()) {
			log.debug(name);
		}		
	}
}