//Check the Status
package com.treselle.controll;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import com.treselle.validate.Validating;
import com.treselle.DAO.ConnectionManager; 
//import java.util.logging.Logger;
import org.apache.log4j.Logger;

public class Status{
	
		Connection con = ConnectionManager.getConnection();	
		Logger  logger = Logger.getLogger("Status");
		ResultSet rs=null;
		Statement stmt=null;
		Validating valid=new Validating();
		
	//To check the status in temp table

	public void checkStatus(){
		try{
			
			if(valid.checkDBEmpty()==true){
				
				stmt=con.createStatement();
				rs=stmt.executeQuery("select * from email");
				logger.info("The following Mails are not received by them!");
				
				while(rs.next())  
				{
					logger.info(rs.getString(1)+" "+rs.getString(2));
				}
				
			}
			else{
				logger.info("All the mails  were sent successfully!!");
			}
			
		}
		catch(Exception e){
			logger.error(e);
		}
		finally
		{
			ConnectionManager.closeConnection();
		}
		
	}
	
}