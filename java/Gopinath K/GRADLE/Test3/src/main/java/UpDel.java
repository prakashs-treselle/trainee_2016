package opt.com.treselle;
import java.sql.SQLException;
import java.sql.Statement;

class UpDel
{
	
	public void update1(Statement stmt)//update the record
	{
		try
		{
		System.out.println("\nUpdating records in the table...\n");

		String sel = "update treselle set Name='gopinath' where Id=101";

		stmt.executeUpdate(sel);
		
		}
		catch(SQLException  e)
		{
			System.out.println(e);
		}
		
	}
}