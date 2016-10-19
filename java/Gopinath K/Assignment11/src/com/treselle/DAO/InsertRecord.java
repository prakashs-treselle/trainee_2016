//validating and inserting new users
package com.treselle.DAO;

import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.treselle.validate.Validating;
//import java.util.logging.Logger;
import com.treselle.DAO.ConnectionManager;
import org.apache.log4j.Logger;
//import java.util.logging.Logger;


public class InsertRecord{
	PreparedStatement ps=null;
	Validating validate=new Validating();
	Connection con = ConnectionManager.getConnection();
	ResultSet rs=null;
	public static final int MYSQL_DUPLICATE_PK = 1062;
	Logger  logger = Logger.getLogger("InsertRecord");

	public void insertRecordDB(int no){//inserting valid Records
		try{
				Scanner s=new Scanner(System.in);
				//load the property file
				Properties prop = new Properties();
				InputStream inp = new FileInputStream("D:/Workspace1/Assignment11/src/com/treselle/property/Query.properties");
				prop.load(inp);
				String insertrec = prop.getProperty("insertrec");
		
				for(int i=0;i<no;i++){
			//To get the Information from the user
					logger.info("\n\n\t\tEnter Your First Name"+"(String Only allowed)");
						String name=s.nextLine();
					logger.info("\n\n\t\tEnter Your Valid Email Id:"+"(If Number or String)");
						String email=s.nextLine();
			
			//validate the Format Username& Email
			if(validate.verifyName(name)==true && validate.verifyEmail(email) ){
					
					//validating the New user or old
					
					if(validate.validUser(email)!=true){
						//if new user Stored DB and send the mail
						ps = con.prepareStatement(insertrec);
						ps.setString(1,name);
						ps.setString(2,email);
						ps.executeUpdate();
						logger.info("\n\n\t\tRegister Sucessfully!\n\n");
						
					}
					else{
						//if old user Don't send any mail
						logger.info("\n\t\tAlready Registered!");
					}
				
			}
			else{
				//Username or Email-Id validation failed
				logger.info("This is not valid Username or Email-Id!");
			}
		}
		}
		catch (SQLException e) {
			
                //logger.error("Failed to create the database connection"+ex); 
				
				if(e.getErrorCode() == MYSQL_DUPLICATE_PK ){
						//duplicate primary key 
						logger.error(" \t\tSorry already you Registered!");
						}
            }
        
		catch (Exception ex) {
           
            logger.error("Driver not found"+ex); 
        }
		
		finally {
			ConnectionManager.closeConnection();
				
			if(rs!=null){
				try{
					rs.close();
				}
				catch(Exception e){
					
				}
				
			}
				
		}
		
		
		
		
	}
}