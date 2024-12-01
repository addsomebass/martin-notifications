package com.joevmartin.martin_notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	AwsConfig config;

	@Autowired
	SESSender sesSender;

	@GetMapping(name = "test", path = "test")
	public String test(@RequestParam String input) {
		return "you input: " + input;

	}

	@GetMapping(name = "sendEmail", path = "sendEmail")
	public String sendEmail() {
		sesSender.sendEmail();
		return "Email sent";
	}

}
