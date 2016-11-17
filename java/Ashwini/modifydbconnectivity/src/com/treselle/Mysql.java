package opt.com.treselle;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;

public class MySql
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	
	{
        Class.forName();
		Connection con= DriverManager.getconnection();
		System.out.println();
		Statement st=con.createStatement();
		String Sql= "Select * from ";
		ResultSet rs=st.executeQuery(Sql);
		while(rs.next())
		
		{
		
			System.out.println(rs.getString());
	    }
		
	}
	
}
		
	
 