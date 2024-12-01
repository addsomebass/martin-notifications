package com.joevmartin.martin_notifications;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AwsConfig {

	@Value("${AWS_ACCESS_KEY_ID}")
	private String accessKey;

	@Value("${AWS_SECRET_ACCESS_KEY}")
	private String secretKey;

	public void printCredentials() {
		System.out.println("Access Key: " + accessKey);
		System.out.println("Secret Key: " + secretKey);
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getSecretKey() {
		return secretKey;
	}
}
