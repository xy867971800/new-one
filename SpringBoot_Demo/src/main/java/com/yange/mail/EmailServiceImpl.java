package com.yange.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailServiceImpl{
	@Autowired
	private EmailConfig emailConfig;
	@Autowired
	private JavaMailSender mailSender;
	public void sendSimpleMail(String sendTo, String title, String content) {
		// TODO 自动生成的方法存根
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(emailConfig.getEmailFrom());
		message.setTo(sendTo);
		message.setSubject(title);
		message.setText(content);
		mailSender.send(message);
	}
}
