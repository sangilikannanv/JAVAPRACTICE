/*package com.kafka.consumer;


import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class ConsumerMain {

	    public static void main(String[] args) {

	        // Set up client Java properties
	        Properties props = new Properties();
	        props.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
	                "host1:9092,host2:9092,host3:9092");
	        // Just a user-defined string to identify the consumer group
	        props.put(ConsumerConfig.GROUP_ID_CONFIG, "first");
	        // Enable auto offset commit
	        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
	        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
	        props.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
	                StringDeserializer.class.getName());
	        props.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
	                StringDeserializer.class.getName());

	        try (KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props)) {
	            // List of topics to subscribe to
	            consumer.subscribe(Arrays.asList("first"));
	            while (true) {
	                try {
	                    ConsumerRecords<String, String> records = consumer.poll(100);
	                    for (ConsumerRecord<String, String> record : records) {
	                        System.out.printf("Offset = %d\n", record.offset());
	                        System.out.printf("Key    = %s\n", record.key());
	                        System.out.printf("Value  = %s\n", record.value());
	                    }
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }

}
*/