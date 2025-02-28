package com.sohamglobal.classes;

public class Notification {
	
	private EmailService emailService;

	//constructor injection
	public Notification(EmailService emailService) {
		super();
		this.emailService = emailService;
	}
	
	public void notifyUser(String recipient,String message)
	{
		emailService.sendMessage(recipient, message);
	}

}
