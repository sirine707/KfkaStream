package com.sirine.kafkaStream.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class kafkaTopicConfig {
    @Bean
    public NewTopic alphavintageTopic(){
        return TopicBuilder.name("alphavintage")
                .build();
    }

}
