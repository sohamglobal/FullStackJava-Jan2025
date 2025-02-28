package com.di.programs;

import com.sohamglobal.classes.EmailService;
import com.sohamglobal.classes.Notification;

public class TestInjection {
	public static void main(String[] args) {
		EmailService emailService=new EmailService();
		Notification notification=new Notification(emailService);
		
		notification.notifyUser("soformidable@outlook.com", "Hi soham, how are you?");
	}

}
