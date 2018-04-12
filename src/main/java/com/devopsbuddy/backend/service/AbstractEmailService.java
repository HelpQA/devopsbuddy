package com.devopsbuddy.backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;

public class AbstractEmailService implements EmailService{
	
	@Value("${default.to.address}")
	private String defaultToAddress;
	protected SimpleMailMessage prepareSimpleMailMessageFromFeedbackPojo(FeedbackPojo feedback)
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(defaultToAddress);
		message.setFrom(feedback.getEmail());
		message.setSubject("[Devops Buddy] : Feedback received from " + feedback.getFirstName() + " " + feedback.getLastName() + "!");
		message.setText(feedback.getFeedback());
		return message;
	}
	 

    @Override
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo) {
        sendGenericEmailMessage(prepareSimpleMailMessageFromFeedbackPojo(feedbackPojo));
    }


	@Override
	public void sendGenericEmailMessage(SimpleMailMessage message) {
		// TODO Auto-generated method stub
		
	}
}
