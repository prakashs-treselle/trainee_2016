package output.com.treselle;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.lang.ClassNotFoundException	;
class DBManager
{
	private static String urlName="jdbc:mysql://localhost:3306/studentsdb";
	private static String driverName="com.mysql.jdbc.Driver";
	private static String userName="root";
	private static String password="kanmani";
	private static Connection conn;
	public static Connection connections()					//Defining connecting method
	{ 
		try
		{
		Class.forName(driverName);							//Initialize JDBC Driver
			try
			{
			 									
				conn=DriverManager.getConnection(urlName,userName,password);
			//Statement st=con.createStatement();
			//PreparedStatement preparedsmt=con.prepareStatement();
			
			}
			
			catch(SQLException e)
			{
				System.out.println("Exception ----> "+e.getMessage());
			}
		
			}
		catch(ClassNotFoundException e)
		{
			System.out.println("Exception ----> "+e.getMessage());
		}
		
		return conn;

		
	}
}