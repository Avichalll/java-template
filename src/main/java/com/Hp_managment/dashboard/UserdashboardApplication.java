package com.Hp_managment.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableAsync
public class UserdashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserdashboardApplication.class, args);
	}
	
	

}