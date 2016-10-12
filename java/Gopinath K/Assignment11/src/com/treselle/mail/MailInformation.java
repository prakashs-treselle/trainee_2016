package com.treselle.mail;

import java.util.Properties;
import java.util.Scanner;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;
//import java.util.logging.Logger;

public class MailInformation{

	String d_email=null;
	String d_password=null;
	String d_host=null;
	String d_port=null;
	String m_subject=null;

//to get a values from the properties
	public  void mailSending(String uname,String emailadd){
		try{
				Properties property = new Properties();
				InputStream inp = new FileInputStream("D:/Workspace1/Assignment11/src/com/treselle/property/Query.properties");
			 property.load(inp);
			 d_email = property.getProperty("emailid");
			 d_password = property.getProperty("emailPassword");
			 d_host = property.getProperty("host");
			 d_port = property.getProperty("port");
			 m_subject = property.getProperty("m_subject");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		//To Start the SMTP 
			Properties props = new Properties();
			props.put("mail.smtp.user", d_email);
			props.put("mail.smtp.host", d_host);
			props.put("mail.smtp.port", d_port);
			props.put("mail.smtp.starttls.enable","true");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.socketFactory.port", d_port);
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.socketFactory.fallback", "false");

	
	try{
		//Create Session because accessing different user and diffeent server
		//So response is Trustable
			Authenticator auth = new SMTPAuthenticator();
			Session session = Session.getInstance(props, auth);
			MimeMessage msg = new MimeMessage(session);
				msg.setText("Hi welcome!  "+uname+"\n\t\tYou will Tech Awareness related email for next 10 days.\n\nThanks\nFresher16 Team\nTreselle.\ntech=<JAVA> : creator=<Gopinath K >");
				msg.setSubject(m_subject);
				msg.setFrom(new InternetAddress(d_email));
				msg.addRecipient(Message.RecipientType.TO, new InternetAddress(emailadd));
				Transport.send(msg);
		}
		catch (Exception mex){
			System.out.println(mex);
		} 
	}
	//Authendicats the Sender Username and Password
	private class SMTPAuthenticator extends javax.mail.Authenticator{
		public PasswordAuthentication getPasswordAuthentication(){
			
			return new PasswordAuthentication(d_email, d_password);
		}
	}
}