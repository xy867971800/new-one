package com.yange.mail;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailConfig {
	@Value("${spring.mail.username}")//取配置文件中的值赋予emailFrom
	private String emailFrom;
	
	public String getEmailFrom(){
		return emailFrom;
	}
	
	public void setEmailFrom(String emailFrom){
		this.emailFrom = emailFrom;
	}
}
