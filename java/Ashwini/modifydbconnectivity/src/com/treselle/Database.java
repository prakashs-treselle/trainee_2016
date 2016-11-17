package opt.com.treselle;

import java.sql.DriverManager;
import java.sql.Connection;
import java.io.IOException;
import java.sql.Statement;

public class Database

{
Connection con=null;
Statement st=null;
        try
		{
		
        Class.forName("com.mysql.jdbc.Driver");
	 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin123");
		st=con.createStatement(); 
		}
		catch (Exception e)
		{
		  System.out.println("Exception-" +e.getMessage());
		}
	     con.close();
         st.close();
}		 
	
		 
		 
		 

