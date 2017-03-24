package com.spring.integration.session;

public class SessionReader {

	public void handleMessage(String inputSession) {
		System.out.println(" --- handling: " + inputSession);
	}
}
