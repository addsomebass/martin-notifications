package com.joevmartin.martin_notifications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MartinNotificationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MartinNotificationsApplication.class, args);
	}

}
