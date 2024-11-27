package com.joevmartin.martin_notifications;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(name = "test", path = "test")
	public String test(@RequestParam String input) {
		return "you input: " + input;
	}

}
