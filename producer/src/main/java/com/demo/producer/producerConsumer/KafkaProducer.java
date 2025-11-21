package com.demo.producer.producerConsumer;

import com.demo.producer.enitity.RiderLocation;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaProducer {

    private final KafkaTemplate<String,RiderLocation> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {

        this.kafkaTemplate = kafkaTemplate;
    }

//    @PostMapping("/sent")
//    public String setMessage(@RequestParam String message){
//        kafkaTemplate.send("my-topic",message);
//        return "message sent :"+message;
//    }

    @PostMapping("/riderLocation")
    public String setMessage(){
        RiderLocation location=new RiderLocation("rider101",28.7041,77.1025);
        kafkaTemplate.send("My-new-topic",location);
        return "rider sent :"+location.getRiderId();
    }
}
