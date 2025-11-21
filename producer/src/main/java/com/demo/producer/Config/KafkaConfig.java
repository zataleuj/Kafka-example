package com.demo.producer.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic myTopic(){
        return new NewTopic("My-new-topic",3,(short)1);
    }

}
