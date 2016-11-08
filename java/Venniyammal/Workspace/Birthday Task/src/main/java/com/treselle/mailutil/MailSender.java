package com.treselle.mailutil;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message.RecipientType;
import javax.mail.Session;
import javax.mail.*;
import java.lang.SecurityManager;
import java.lang.*;
import javax.mail.Transport;
import java.io.FileInputStream;

public class MailSender{
		
	static FileInputStream inputStream = null;
	Properties properties =null;	
	Properties props = new Properties();
	String senderEmail,senderPassword ,host ,mailSubject ,port ;
	
	public void sendEMail(String name, String receiverMailId ) {
	 String footer ="\n\n\n Thanks&Regards \nFrom Treselle ";
	 String messageBody = "Hey  "+name+",\n\nThis is the testing email from Venniyammal.V . Happy Birthday . I wish you have a successful and Joyful year ahead."+footer;
	 System.out.println("inside send mail function");
	 //System.out.println(name);
	try{
		
		// getting configuration details from 
		properties = new Properties();
        inputStream = new FileInputStream("E:/workspace/HappyBirthday/jxl spel/properties/SMTPConnEntity.properties");
        properties.load(inputStream);
        senderEmail = properties.getProperty("email");
        senderPassword = properties.getProperty("password");
        host = properties.getProperty("host");	
        port = properties.getProperty("port");	
        mailSubject = properties.getProperty("subject");	
		System.out.println(senderEmail + " Property");
		
		props.put("mail.smtp.user", senderEmail);
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", port);
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.auth", "true");
		//props.put("mail.smtp.debug", "true");
		props.put("mail.smtp.socketFactory.port", port);
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");
		}
		catch (Exception e){
			System.out.println("Error message from Mail Util " + e );
		}
		SecurityManager security = System.getSecurityManager();
		Authenticator auth = null;
		MimeMessage message = null;
		try{
		 auth = new SMTPAuthenticator();
		Session session = Session.getInstance(props, auth);
		session.setDebug(true);

		message=new MimeMessage(session);
		message.setText(messageBody);
		message.setSubject(mailSubject);
		message.setFrom(new InternetAddress(senderEmail));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiverMailId));
			System.out.println("Message has been send");
		Transport.send(message);
	
			}
		catch (Throwable e){
			 System.err.println("Cause = " + e.getCause());
		   
				} 
	}

	private class SMTPAuthenticator extends javax.mail.Authenticator{
		public PasswordAuthentication getPasswordAuthentication(){
		return new PasswordAuthentication(senderEmail, senderPassword);
			}
		}
	}