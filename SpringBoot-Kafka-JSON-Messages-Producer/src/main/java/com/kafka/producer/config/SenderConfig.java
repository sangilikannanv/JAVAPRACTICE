package com.kafka.producer.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
@PropertySource({ ("classpath:kafkaproducer.properties") })
public class SenderConfig {
	@Value("${kafka.bootstrap-servers}")
	private String bootstrapServers;

	@Autowired
	Environment env;

	@Bean
	public KafkaTemplate<String, String> kafkaTemplate() {
		return new KafkaTemplate<>(producerConfigs());
	}

	@Bean
	public ProducerFactory<String, String> producerConfigs() {
		Map<String, Object> properties = new HashMap<>();
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		properties.put(ProducerConfig.LINGER_MS_CONFIG, 100);
		properties.put(ProducerConfig.RETRIES_CONFIG, "3");
//		properties.put(ProducerConfig.CONNECTIONS_MAX_IDLE_MS_CONFIG, ); // time in ms.
		return new DefaultKafkaProducerFactory<>(properties);
	}

}