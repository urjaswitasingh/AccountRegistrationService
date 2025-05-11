package com.citybank.bankregistration.kafka;

import com.citybank.bankregistration.model.ShedulePayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    private static final String TOPIC = "shedulePayment";
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    public void sendMessage(ShedulePayment message){
        this.kafkaTemplate.send(TOPIC, message);
    }

}
