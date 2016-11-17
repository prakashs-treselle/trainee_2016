package opt.com.treselle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class Show
{
	public void select(Statement stmt)//showing the records
		{
		try
		{
			System.out.println("\nShowing records in the table...\n");

			ResultSet rs=stmt.executeQuery("select * from treselle");  
	  
			while(rs.next())  
			{
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+"  "+rs.getString(3));
			}
		}
		catch(SQLException  e)
		{
			System.out.println(e);
		}
		
		 
		
	}
}
