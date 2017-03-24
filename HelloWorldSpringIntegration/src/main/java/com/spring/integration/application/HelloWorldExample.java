package com.spring.integration.application;

import java.util.concurrent.TimeUnit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import com.spring.integration.session.SessionQueuePersistance;

public class HelloWorldExample {

	public static void main(String args[]) {
		String cfg = "/channel/context.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(cfg);
		MessageChannel channel = context.getBean("names", MessageChannel.class);

		Message<String> message = MessageBuilder.withPayload("World").build();
		channel.send(message);
		
		Message<String> message2 = MessageBuilder.withPayload("Hi dara").build();
		channel.send(message2);

		SessionQueuePersistance sessionQueuePersistance = (SessionQueuePersistance) context
				.getBean("sessionQueuePersistance");

		sessionQueuePersistance.addSessionToQueue("testSession1");
		sessionQueuePersistance.addSessionToQueue("testSession2");
		sessionQueuePersistance.addSessionToQueue("testSession3");
		sessionQueuePersistance.addSessionToQueue("testSession4");
		sessionQueuePersistance.addSessionToQueue("testSession5");
		sessionQueuePersistance.addSessionToQueue("testSession6");
		sessionQueuePersistance.addSessionToQueue("testSession7");
		sessionQueuePersistance.addSessionToQueue("testSession8");
		sessionQueuePersistance.addSessionToQueue("testSession9");

		// Message<String> message =
		// MessageBuilder.withPayload("World").build();
		// channel.send(message);

		try {
			TimeUnit.SECONDS.sleep(360);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
