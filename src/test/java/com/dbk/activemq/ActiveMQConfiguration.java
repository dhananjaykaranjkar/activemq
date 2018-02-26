package com.dbk.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;


@Configuration
public class ActiveMQConfiguration {

    @Bean
    public Queue queue(){
        return new ActiveMQQueue("standalone.queue") ;
    }

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory() {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL("tcp://localhost:61616");

        https://sqs.eu-west-1.amazonaws.com/213241638745/AlertsMQ.fifo
        return connectionFactory;
    }

    @Bean
    public AtomicInteger atomicInteger(){
        return new AtomicInteger();
    }

    @Bean
    public JmsTemplate jmsTemplate() {
        return new JmsTemplate(activeMQConnectionFactory());
    }

}
