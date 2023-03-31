package com.example.scheduler.springbatchscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbatchschedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbatchschedulerApplication.class, args);
	}

}
