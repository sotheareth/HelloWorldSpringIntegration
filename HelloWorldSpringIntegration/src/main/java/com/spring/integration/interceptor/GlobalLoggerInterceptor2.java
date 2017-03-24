package com.spring.integration.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;

public class GlobalLoggerInterceptor2 implements ChannelInterceptor {
	
	private static final Logger logger = LoggerFactory.getLogger(GlobalLoggerInterceptor2.class);

	@Override
	public Message<?> preSend(Message<?> message, MessageChannel channel) {
		logger.debug(String.format("preSend message2: %s", message));
		return message;
	}

	@Override
	public void postSend(Message<?> message, MessageChannel channel, boolean sent) {
		
	}

	@Override
	public boolean preReceive(MessageChannel channel) {
		return false;
	}

	@Override
	public Message<?> postReceive(Message<?> message, MessageChannel channel) {
		return null;
	}

	@Override
	public void afterSendCompletion(Message<?> message, MessageChannel channel, boolean sent, Exception ex) {
		
	}

	@Override
	public void afterReceiveCompletion(Message<?> message, MessageChannel channel, Exception ex) {
		
	}

}
