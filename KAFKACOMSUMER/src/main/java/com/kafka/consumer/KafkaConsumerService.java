package com.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;



public class KafkaConsumerService implements MessageHandler {

	final Logger log = (Logger) LoggerFactory.getLogger(getClass());

	


	@Override
	public void handleMessage(Message<?> message) {
		try {
			if (!(String.valueOf(message.getPayload()).isEmpty())) {
				if (message.getHeaders().get("kafka_receivedTopic")
						.equals("first")) {

					System.out.println();
					System.out.println(String.valueOf(message.getPayload()));
					
					System.out.println();
					System.out.println();
//					Employee.validateCustRegtRequest(String.valueOf(message.getPayload()));
				}
			}
		} catch (MessagingException e) {
			System.out.println("Exception occured "+e);
			log.debug("Exception occured while consuming the message from kafka producer" + e);
			log.error("Exception occured while consuming the message from kafka producer" + e);
		}
	}
}
