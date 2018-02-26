package com.dbk.activemq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActiveMqApplicationTests {

	@Autowired
	private AtomicInteger count = null;

	@Autowired
	Sender sender;

//	@Autowired
//	Receiver receiver;


	@Test
	public void testSendMessage() {
		sender.send("This is my testing message");
	}

}
