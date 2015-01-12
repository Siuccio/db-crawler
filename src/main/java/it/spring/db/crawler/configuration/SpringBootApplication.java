package it.spring.db.crawler.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringBootApplication {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("Spring-Quartz.xml");
		SpringApplication.run(ApplicationConfig.class, args);
	}
}
