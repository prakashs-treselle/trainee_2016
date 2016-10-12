//Common connection
package com.treselle.DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
//import java.util.logging.Logger;
import org.apache.log4j.Logger;

public class ConnectionManager {
	//Declare the Variable are Globally
    private static String url =null ;    
    private static String driverName = null;   
    private static String username = null;   
    private static String password = null;
    private static Connection con;
	private static final Logger  logger = Logger.getLogger("ConnectionManager");
	
	//create connection and return any where
    public static Connection getConnection() {
		try{
				Properties prop = new Properties();
				InputStream inp = new FileInputStream("D:/Workspace1/Assignment11/src/com/treselle/property/Query.properties");
				prop.load(inp);
			//to get the resource from the  property file
				  url= prop.getProperty("url");
				  driverName= prop.getProperty("driverName");
				  username= prop.getProperty("username");
				  password= prop.getProperty("password");
   
		}
		catch(IOException ioe){
			logger.error("Preperty file readind error "+ioe);
		}

        try {
				Class.forName(driverName);//load the Driver
            try{
                con = DriverManager.getConnection(url,username,password);//configurethe db
            } 
			catch (SQLException ex) {
				
               System.out.println("Failed to create the database connection"+ex); 
            }
        } 
		catch (ClassNotFoundException ex) {
           
            System.out.println("Driver not found"+ex); 
        }
		
        return con;
    }
	//closing connection method
	public static void closeConnection()
	{
			if(con!=null)
				try{
					con.close();
				}
				catch(Exception e){
					System.out.println(e);
					
				}
		
	}
}