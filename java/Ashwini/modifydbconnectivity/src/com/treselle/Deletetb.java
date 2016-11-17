package opt.com.treselle;

import java.io.IOException;
import java.sql.Statement;

public class Deletetb

{
      
	public void dbdeleteTable(Statement st)
    
	{
	
	try
	
	 {
		
	    String sql = "DELETE FROM Users WHERE username='shilpashetty'";
        st.executeUpdate(sql);
		
	 }
	 
	 catch (Exception e)
		{
		  System.out.println("Exception-" +e.getMessage());
		}
		
		
	}
}