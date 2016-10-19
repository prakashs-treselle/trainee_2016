package opt.com.treselle;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;


 /*connection creation class */
class DBConnect
{
 Connection connect= null;
  public Connection createConnection()
  { 
   try
     {
         Class.forName("com.mysql.jdbc.Driver");
     	 connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/interview", "admin", "treselle");
         return connect;
     }
   catch(Exception e)
	 {
      return null;
      }
    }
	
// close connection	
	public void closeConnection()
	{
	  try
      {
	   {
	    connect.close();
	    }
	  }
	  catch (SQLException se)
	  {
	   System.out.println(se);
	  }
   }
}