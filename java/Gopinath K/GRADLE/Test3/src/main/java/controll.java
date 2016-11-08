package opt.com.treselle;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


class Controll
{
	public void insert(Statement stmt)//insert the records
	{
		try
		{
			
		String sql = "INSERT INTO treselle VALUES ('gopi', 101, 'Developer')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO treselle VALUES ('ramya', 102, 'architec')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO treselle VALUES ('sumathi', 103, 'fresherserser')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO treselle VALUES('kanmani', 104, 'Java Developer')";
      stmt.executeUpdate(sql);
	   sql = "INSERT INTO treselle VALUES ('usha', 105, 'tesing')";
      stmt.executeUpdate(sql);
      System.out.println("\nInserted records into the table...\n");
	  
		}
		catch(SQLException  e)
		{
			 System.out.println(e);
		}
		
	}
	
	
	
	
}