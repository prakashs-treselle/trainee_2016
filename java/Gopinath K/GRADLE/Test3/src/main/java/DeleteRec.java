package opt.com.treselle;
import java.sql.Statement;
import java.sql.SQLException;
class DeleteRec
{
	public void delete(Statement stmt)//delete the 1 record
	{
		try
		{
			
		String del="DELETE FROM treselle WHERE Id=102";
		stmt.executeUpdate(del);
		System.out.println("\nDelete records into the table...\n");
		
		}
		catch(SQLException  e)
		{
		System.out.println(e);
		}
		
	}
}