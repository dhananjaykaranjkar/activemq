package com.dbk.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "standalone.queue")
    public void receive(String message){
        System.out.println("Message Received: " + message);
    }
}
