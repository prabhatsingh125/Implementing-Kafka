package com.kafkaImplement.Implement.Kafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailId;
}
