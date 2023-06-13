package com.kafkaImplement.Implement.Kafka.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafkaImplement.Implement.Kafka.model.Employee;
import com.kafkaImplement.Implement.Kafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Api to send Messages to kafka topic using producer
 */

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaProducerController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @Autowired
    private ObjectMapper mapper;

    @GetMapping("/publishMessage")
    public ResponseEntity<?> publishMessage(@RequestParam("message") String message) {

        kafkaProducer.sendMessage(message);
        return new ResponseEntity<>("Message sent to Kafka Topic", HttpStatus.OK);
    }

    @PostMapping("/publishEmployeeDetails")
    public ResponseEntity<?> publishEmployeeDetails(@RequestBody Employee employee) throws Exception {
        kafkaProducer.sendMessage(mapper.writeValueAsString(employee));

        return new ResponseEntity<>("Message sent to Kafka Topic", HttpStatus.OK);
    }

}
