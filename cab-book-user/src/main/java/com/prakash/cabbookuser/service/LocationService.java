package com.prakash.cabbookuser.service;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author prakashkaruppusamy
 */
@Service
public class LocationService {

    @KafkaListener(topics = "cab-location", groupId = "user-group")
    public void cabLocation(String location) {
        System.out.println("Consumer received ...." + location);

    }
}
