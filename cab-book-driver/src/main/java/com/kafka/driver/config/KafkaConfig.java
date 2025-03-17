package com.kafka.driver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.kafka.driver.constant.AppConatant;

@Configuration
public class KafkaConfig {

	
		public NewTopic topic() {
			
			return TopicBuilder
					.name(AppConatant.CABLOCATION)
					.build();
		}
}
