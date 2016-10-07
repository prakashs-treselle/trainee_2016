package opt.com.treselle;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;


 
class DBConnect
{
 
 public static void main(String [] args)
 {
  try{  
      //creating connection
	  Class.forName("com.mysql.jdbc.Driver");  
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","admin","treselle");  
	  
	  StoreDetails sd = new StoreDetails();
	  CreateTable ct = new CreateTable();
	  Statement stmt=con.createStatement(); 
	   
	  ct.createTable(con,stmt);
	  sd.getDetailsToBean();
	  sd.addStudentDetails(con);
	  
	 
	  
	  
	 
	   con.close();
	  }
  catch(Exception e)
      {
	   System.out.println(e);
	   }
	    
     
     
     
	 }
  }