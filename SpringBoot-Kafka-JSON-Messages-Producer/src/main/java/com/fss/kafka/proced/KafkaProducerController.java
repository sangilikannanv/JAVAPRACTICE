package com.fss.kafka.proced;

import java.util.concurrent.ExecutionException;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.databind.ObjectMapper;

import com.google.gson.Gson;

import com.kafka.producer.config.*;
import com.kafka.producer.service.*;

@RestController
public class KafkaProducerController extends KafkaProducerResponse {

	@Autowired
	KafkaProducerResponse producer;

	private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	private Gson gson;

	@PostMapping(path = "/produce", produces = "application/json", consumes = "application/json")
	public @ResponseBody void postModelToKafk(@RequestBody Employee emp, HttpServletRequest request)
			throws InterruptedException, ExecutionException {
		
	final Logger logger = LogManager.getLogger(KafkaProducerController.class);
		
		 JSONObject json=null;
		 CardPushReq req=null;
		 CardPushRes res=null;
		 ObjectMapper obj = null;
		String dataToHash = null;
		try {
			 obj = new ObjectMapper();
			 req=new CardPushReq();
			 res=new CardPushRes(); 
			 json=new JSONObject(emp);
			 
			dataToHash = obj.writeValueAsString(emp);
			logger.trace("Enter the produceMessage on the postModelToKafk");
			System.out.println();
			System.out.println("PRODUCER :: ");
			System.out.println("Qmsg::" + dataToHash);
			logger.trace("Request received from in Kafka is"+dataToHash);
			ListenableFuture<SendResult<String, String>> result = producer.produceMessage("first", dataToHash);
			if (result.isDone()) {
				logger.debug("Queue Failure...");
				System.out.println("Queue Failure");
			} else {
				logger.debug("Queue Success...");
				System.out.println("Queue Success");
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Exception Occured on producer:: " + e);
			logger.error("Exception Occured in producer",e);
		} finally {
			dataToHash = null;
		}
	}

}