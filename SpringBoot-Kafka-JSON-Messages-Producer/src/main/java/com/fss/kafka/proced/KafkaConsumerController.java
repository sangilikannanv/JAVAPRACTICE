/* package com.fss.kafka.proced;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class KafkaConsumerController {

	@Autowired
	private Gson gson;

	@KafkaListener(topics = { "first" })
	public void getTopics(@RequestBody String emp) {
		System.out.println();
		System.out.println("CONSUMER ::");
		System.out.println("Kafka event consumed is: " + emp);
		Employee model = gson.fromJson(emp, Employee.class);
		System.out.println("Model converted value: " + model.toString());
	}
} */