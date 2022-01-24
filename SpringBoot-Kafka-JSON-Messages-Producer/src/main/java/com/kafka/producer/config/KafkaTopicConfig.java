package com.kafka.producer.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.kafka.core.KafkaAdmin;

@PropertySource({ ("classpath:kafkaproducer.properties") })
public class KafkaTopicConfig {
	@Autowired
	Environment env;
	@Value(value = "${kafka.bootstrap-servers}")
	private String bootstrapAddress;

	@Bean
	public KafkaAdmin kafkaAdmin() {
		Map<String, Object> configs = new HashMap<>();
		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
		configs.put(AdminClientConfig.REQUEST_TIMEOUT_MS_CONFIG, env.getProperty("request.timeout.config.ms"));
		configs.put(AdminClientConfig.RETRIES_CONFIG, env.getProperty("retry.count"));
		configs.put(AdminClientConfig.RETRY_BACKOFF_MS_CONFIG,env.getProperty("retry.backoff.config.ms"));
		return new KafkaAdmin(configs);
	}
}
