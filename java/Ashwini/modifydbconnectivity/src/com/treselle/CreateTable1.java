package opt.com.treselle;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.io.IOException;
import java.sql.Statement;

public class CreateTable1
{
	public static void main(String[] args) throws Exception
	{
        Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin");
 		Statement stmt=con.createStatement(); 
        try
         {	
		   String sql="select * from stud";		 
           ResultSet rs=stmt.executeQuery("select * from emp765");  
  
          
        rs.absolute(3);  
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
  
con.close();  
}catch(Exception e){
System.out.println(e);}
}  
	
}
		
	
 