//Giving inputs are Validating
package com.treselle.validate;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.sql.Statement;
import java.sql.SQLException;
import com.treselle.DAO.ConnectionManager;
//import java.util.logging.Logger;
import org.apache.log4j.Logger;

public class Validating{
	ResultSet rs=null;
	Statement stmt = null;
	boolean bool=false;
	Connection con = ConnectionManager.getConnection();
	Logger  logger = Logger.getLogger("Validating");
	//private static org.apache.log4j.Logger log = Logger.getLogger(Validating.class);
	
		public boolean validUser(String email){
			boolean t6f=false;
			try{
				Properties prop = new Properties();
				InputStream inp = new FileInputStream("D:/Workspace1/Assignment11/src/com/treselle/property/Query.properties");
				prop.load(inp);
				String validate = prop.getProperty("validate");
				
				PreparedStatement p = con.prepareStatement(validate);
				p.setString(1,email);
				rs=p.executeQuery(); //checking user is there in Db or Not
				t6f=rs.next();//if send True or false
			
			}
			
			catch(Exception e){
				logger.error(e);
			}
			
			/*finally{
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
			return t6f;
			
			
		}
	
	
	public boolean verifyName(String lname)//Check the userName Format
	{
		lname = lname.trim();

		if(lname == null || lname.equals(""))
			return false;

		if(!lname.matches("[a-zA-Z]*"))
			return false;

		return true;
	}
	
	
		public boolean verifyEmail(String email)//validate the Email Format.if allow Number and String
		{
				email = email.trim();

				if(email == null || email.equals(""))
					return false;

				if(!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"))
					return false;

				return true;
		}
		
	//if check the db
	public boolean checkDBEmpty(){
			try{
				
					stmt=con.createStatement();
					rs=stmt.executeQuery("select * from email");
					bool=rs.next();
			
			}
			catch(SQLException sql){
				logger.error(sql);
			}
				
			return bool;
	}
	/*
	public static boolean isValidEmailAddress(String email) {
	   boolean result = true;
		   try {
			  InternetAddress emailAddr = new InternetAddress(email);
			  emailAddr.validate();
		   } 
		   catch (AddressException ex) {
			  result = false;
		   }
	   return result;
	}*/
	
}