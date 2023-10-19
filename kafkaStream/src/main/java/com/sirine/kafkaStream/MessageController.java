package com.sirine.kafkaStream;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/messages")
public class MessageController {
    private final KafkaTemplate<String,String> kafkaTemplate;

    public MessageController(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    @PostMapping
    public void publish(@RequestBody MessageRequest request){
        kafkaTemplate.send("alphavintage",request.message());
    }
}
