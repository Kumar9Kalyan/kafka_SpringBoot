package com.kafka.driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.driver.constant.AppConatant;

@Service
public class CabLocationService {
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		kafkaTemplate.send(AppConatant.CABLOCATION,location);
		return true;
	}
	
}
