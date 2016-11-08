package opt.com.treselle;

import java.io.IOException;
import java.sql.Statement;

public class Updatetb 

{
  
   
   public void dbupdateTable(Statement st)
    
	{
	
	try
	
		{
		 
		
		String sql = "UPDATE users SET password='nam' where username='namitha'";
		st.executeUpdate(sql);
		System.out.println("DB value is updated:" +sql);
		

		}
		
		catch (Exception e)
		{
		  System.out.println("Exception-" +e.getMessage());
		}
		
	}
}
