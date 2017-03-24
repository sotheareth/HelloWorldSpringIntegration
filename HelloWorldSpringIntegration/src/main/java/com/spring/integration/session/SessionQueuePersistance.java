package com.spring.integration.session;

import org.springframework.integration.channel.ExecutorChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

public class SessionQueuePersistance {
	private final QueueChannel sessionInboundChannel;
	private final ExecutorChannel executorChannel;

	public SessionQueuePersistance(QueueChannel sessionInboundChannel, ExecutorChannel executorChannel) {
		super();
		this.sessionInboundChannel = sessionInboundChannel;
		this.executorChannel = executorChannel;
	}

	public boolean addSessionToQueue(String sessionString) {
		Message<?> message = MessageBuilder.withPayload(sessionString).build();
//		executorChannel.send(message);
		System.out.println(" --- addSessionToQueue: " + sessionString);
		return true;
	}
}
