package com.yange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yange.dao.MailDao;
import com.yange.user.Mail;

@Service
public class MailServiceImpl implements MailService{
	@Autowired
	private MailDao mailDao;
	@Override
	public void save(Mail mail) {
		mailDao.save(mail);
	}
}
