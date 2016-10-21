package opt.com.treselle;

import java.sql.DriverManager;
import java.sql.Connection;
import java.io.IOException;


public class Databaseconnection


{

   //con= null;
   
  public void dbconnect()
  {
  
        try
		{
		
        Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Customer", "root", "admin123");
		
		
		}
		
		catch (Exception e)
		{
		  System.out.println("Exception-" +e.getMessage());
		}
		
	    
		 
   }

  		 
}		 
	
		 
		 
		 

