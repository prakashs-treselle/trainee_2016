package opt.com.treselle;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

class ConDB
{
	Statement stmt=null;
	public Statement connectionDB()throws SQLException
	
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gopi","root","password");  
		 stmt=con.createStatement();
	
		}
		catch(SQLException  e)
		{
			System.out.println(e);
		}
		 catch (ClassNotFoundException ex)
		 {

            System.err.println("A ClassNotFoundException was caught: " + ex.getMessage());

            ex.printStackTrace();

        }
	return stmt;
		
	}
	
}