package com.application.interfaces;

import org.springframework.mail.javamail.JavaMailSender;

public interface MailSetter {

	public void setMailSender(JavaMailSender mailSender);

}
