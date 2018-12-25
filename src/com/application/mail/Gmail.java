package com.application.mail;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSender;

import com.application.interfaces.Mailer;

public class Gmail implements Mailer {

	private JavaMailSender mailSender;
	private SimpleMailMessage mailMessage;

	public Gmail(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	@Override
	public boolean send(String from, String to, String subject, String msg) throws Exception {

		mailMessage = new SimpleMailMessage();
		mailMessage.setFrom(from);
		mailMessage.setTo(to);
		mailMessage.setSubject(subject);

		mailMessage.setText(msg);

		mailSender.send(mailMessage);

		return true;
	}

}
