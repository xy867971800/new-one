package com.yange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yange.mail.EmailService;
import com.yange.service.MailService;
import com.yange.user.Mail;

@Controller
public class SpringController {
	@Autowired
	MailService mailService;
	
//	@Autowired
//	EmailService es;
	@RequestMapping("/index")
	public String cxk(Model model) {
		model.addAttribute("email", "xuyan1998@vip.qq.com");
		model.addAttribute("title", "你好欧阳锋");
		model.addAttribute("text", "欧阳锋你个菜鸡");
		return "index";
	}
	
	@RequestMapping("/cxk")
	public String cxk(Mail mail)
	{
		
		mailService.save(mail);
		return"cxk";
	}
	
}
