package com.kafka.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.KafkaException;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;


@Service("producer")
public class KafkaProducerResponse {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public ListenableFuture<SendResult<String, String>> produceMessage(String topic, String message) {
		ListenableFuture<SendResult<String, String>> future = null;
		try {
			logger.trace("produce send message");
			future = kafkaTemplate.send(topic, message);
		} catch (KafkaException e) {
			logger.debug("Exception occured while produceMessage" + e);
			logger.error("Exception occured while produceMessage" + e);
		}
		return future;
	}

}