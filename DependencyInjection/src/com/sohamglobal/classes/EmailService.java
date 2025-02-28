package com.sohamglobal.classes;

import com.di.interfaces.MessageService;

public class EmailService implements MessageService {

	@Override
	public void sendMessage(String recipient, String message) {
		// TODO Auto-generated method stub
		System.out.println("Email sent to : "+recipient+" Message : "+message);
	}

}
