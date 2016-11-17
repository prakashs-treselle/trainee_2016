package opt.com.treselle;



import java.io.IOException;
import java.sql.Statement;


public class Createtb
{
    
	
   
   public void dbcreateTable(Statement st)
       
	{
	
	try
	
		{
		 
		 
		 String sql= "CREATE TABLE users(user_id int(11),username varchar(45), password varchar(45),fullname varchar(45), email varchar(45))";
		 st.execute(sql);
		 
									
	    }
		 
	catch (Exception e)
		{
		  System.out.println("Exception-" +e.getMessage());
		}
		
	}
		
	
}
	

	