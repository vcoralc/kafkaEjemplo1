package com.exampleKafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "Kafka1", groupId = "group1")
    void listener(String data){
        System.out.println("Listener received: "+data);
    }
}
