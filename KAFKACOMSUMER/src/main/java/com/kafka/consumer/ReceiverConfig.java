package com.kafka.consumer;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.kafka.inbound.KafkaMessageDrivenChannelAdapter;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.retry.backoff.FixedBackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;



@EnableKafka

@Configuration
public class ReceiverConfig {



	private String bootstrapServers="localhost:9092";

	@Bean
	public DirectChannel consumingChannel() {
		return new DirectChannel();
	}

	@Bean
	public KafkaMessageDrivenChannelAdapter<String, String> kafkaMessageDrivenChannelAdapter(
			RetryTemplate retryTemplate) {
		KafkaMessageDrivenChannelAdapter<String, String> kafkaMessageDrivenChannelAdapter = new KafkaMessageDrivenChannelAdapter<>(
				kafkaListenerContainerFactory());
		kafkaMessageDrivenChannelAdapter.setOutputChannel(consumingChannel());
		kafkaMessageDrivenChannelAdapter.setRetryTemplate(retryTemplate);
		return kafkaMessageDrivenChannelAdapter;
	}

	@Bean
	@ServiceActivator(inputChannel = "consumingChannel")
	public KafkaConsumerService kafkaConsumerService() {
		return new KafkaConsumerService();
	}

	@Bean
	public ConcurrentMessageListenerContainer<String, String> kafkaListenerContainerFactory() {
		ContainerProperties containerProps = new ContainerProperties("first");
		return (ConcurrentMessageListenerContainer<String, String>) new ConcurrentMessageListenerContainer<>(
				consumerFactory(), containerProps);
	}

	@Bean
	public ConsumerFactory<String, String> consumerFactory() {
		return new DefaultKafkaConsumerFactory<>(consumerConfigs());
	}

	@Bean
	RetryTemplate retryTemplate() {
		RetryTemplate retryTemplate = new RetryTemplate();

		FixedBackOffPolicy fixedBackOffPolicy = new FixedBackOffPolicy();
		fixedBackOffPolicy.setBackOffPeriod(60000);
		retryTemplate.setBackOffPolicy(fixedBackOffPolicy);

		SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy();
		retryPolicy.setMaxAttempts(4);
		retryTemplate.setRetryPolicy(retryPolicy);

		return retryTemplate;
	}

	@Bean
	public Map<String, Object> consumerConfigs() {
		Map<String, Object> properties = new HashMap<>();
		properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		properties.put(ConsumerConfig.GROUP_ID_CONFIG, "first");
		properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
		properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG,"1000");
		properties.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, 1000);
		properties.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG,50000);
		properties.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG,"30000");
		properties.put(ConsumerConfig.CONNECTIONS_MAX_IDLE_MS_CONFIG,10000);
		return properties;
	}

}
