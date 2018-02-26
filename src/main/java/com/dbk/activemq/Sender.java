package com.dbk.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    javax.jms.Queue queue;

    public void send(String message){
        jmsTemplate.convertAndSend(queue, message);
    }
}
