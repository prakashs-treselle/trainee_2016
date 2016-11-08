package opt.com.treselle;

import java.io.IOException;
import java.sql.Statement;


public class Inserttable 

{
    

  public void dbInsertTable(Statement st)
  
 
   
   {
   
    try
	
	 {
	  
	    
	   String sql = "INSERT INTO users values(10, 'shilpashetty','shilpa' ,'shil', 'shilpa@gmail.com')";
       st.executeUpdate(sql);
	   System.out.println("DB value is inserted");
	   
	   
       String sql1 = "INSERT INTO users values(11,'namitha','nami','namiiii', 'namitha@gmail.com')";
	   st.executeUpdate(sql1);
	   System.out.println("DB value is inserted");
	   
	   
	  }
	 
	 
	 catch (Exception e)
		{
		  System.out.println("Exception-" +e.getMessage());
		}
		
	
    }
	
}
	
	
	 
	  
	   
	 
	  