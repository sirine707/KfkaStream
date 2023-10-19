package com.sirine.kafkaStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication

public class KafkaStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate <String,String> KafkaTemplate){
		return args -> {
			KafkaTemplate.send("alphavintage","hell from alphavintage");
		};
	}
}
