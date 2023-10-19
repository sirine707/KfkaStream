package com.sirine.kafkaStream;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "alphavintage",
            groupId = "groupId"
    )
    void Listener(String data){
        System.out.println("Listener received: "+data);
    }
}
