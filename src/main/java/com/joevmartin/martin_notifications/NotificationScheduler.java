package com.joevmartin.martin_notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NotificationScheduler {

	@Autowired
	SESSender sesSender;

	@Scheduled(cron = "0 0 20 9 * ?", zone = "America/New_York" )
	public void sendHeartwormNotificationAlert() {
		sesSender.sendEmail();
	}



}
