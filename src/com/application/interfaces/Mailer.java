package com.application.interfaces;

public interface Mailer {

	public boolean send(String from, String to, String subject, String msg) throws Exception;

}
