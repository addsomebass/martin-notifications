package com.joevmartin.martin_notifications;


import org.springframework.stereotype.Component;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sesv2.SesV2Client;
import software.amazon.awssdk.services.sesv2.SesV2ClientBuilder;
import software.amazon.awssdk.services.sesv2.model.*;

@Component
public class SESSender {

	public void sendEmail() {

		final SesV2Client client = SesV2Client.builder()
				.credentialsProvider( DefaultCredentialsProvider.builder().build() )
				.region( Region.US_EAST_1 )
				.build();






		final String fromEmailAddress = "notifications@joevmartin.com";
		final SendEmailRequest request = SendEmailRequest.builder()
				.destination( Destination.builder()
						.toAddresses( "jvmartin314@gmail.com" ).build() )
				.fromEmailAddress( fromEmailAddress )
				.content( EmailContent.builder()
						.simple( Message.builder()
								.subject( Content.builder()
										.data( "Give Dogs their Sympatica Trio" ).build() )
								.body( Body.builder()
										.text( Content.builder()
												.data( "Give Dogs their Sympatica Trio" ).build() )
										.build() )
								.build() )
						.build() ).build();



		final SendEmailResponse sendEmailResponse = client.sendEmail( request );

	}


}
