//Sending mail only for New User
package com.treselle.controll;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import com.treselle.DAO.ConnectionManager;
import com.treselle.mail.MailInformation;
//import java.util.logging.Logger;
import org.apache.log4j.Logger;
//this class used to send the idenfify the new user or old user.if new user send the mail
public class SendMailNewUser{
	
			Connection con = ConnectionManager.getConnection();
			Logger  logger = Logger.getLogger("SendMailNewUser");
			ResultSet rs=null;
			Statement stmt=null;
			MailInformation mailinfo=new MailInformation();
			
		public void newUserMail(String selectFull){//Sending mail only to New User when you want
			try{
				
				//get data from the  tempory table
				stmt=con.createStatement();
				rs=stmt.executeQuery(selectFull);
				String uname=null;
				String mailid=null;
				
				while(rs.next())  
				{
					uname=rs.getString(1);
					mailid=rs.getString(2);
					logger.info("\t\tNow sending....\n\n");
					logger.info(uname+" "+mailid);
					//sending mail one by one to the new users
					mailinfo.mailSending(uname,mailid);
					
				}
				
			}
			catch(SQLException  e){
				logger.error(e);
			}
			/*
		finally{
			if(con!=null){
				try{
					con.close();
				}
				catch(Exception e){
					
				}
				
			}
				
			if(rs!=null){
				try{
					rs.close();
				}
				catch(Exception e){
					
				}
				
			}
				
		}*/
		
	}
	
	public void moveTable(String copy){//move temporary table to original table
		try{
			stmt=con.createStatement();
			stmt.executeUpdate(copy);
		}
		catch(SQLException  e){
				logger.error(e);
			}	
	}
	
	public void deleteTable(String delete){//delete temporary table data
		try{
			stmt=con.createStatement();
			stmt.executeUpdate(delete);
			logger.info("Mail Sent sucessfully!");
			
		}
		catch(SQLException  e){
				logger.error(e);
			}
	
	}
	
	
}
