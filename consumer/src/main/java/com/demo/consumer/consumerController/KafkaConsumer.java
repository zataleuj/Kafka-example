package com.demo.consumer.consumerController;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic" ,groupId = "my-group")
    public void listener(String message){
        System.out.println("message received 1:"+message);

    }
    @KafkaListener(topics = "my-topic" ,groupId = "my-group")
    public void listener1(String message){
        System.out.println("message received 2:"+message);

    }
    @KafkaListener(topics = "My-new-topic" ,groupId = "my-new-group")
    public void listenerRiderLocation(RiderLocation location){
        System.out.println("Rider Location received :"+location);
    }
}
