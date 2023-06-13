package com.kafkaImplement.Implement.Kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumer {

    private static final Logger logger = LoggerFactory.getLogger(KafKaConsumer.class);

    @KafkaListener(topics = "prabhat", groupId = "group_id")
    public void consume(String message) {
      logger.info("Message received is {}", message);
    }
}
