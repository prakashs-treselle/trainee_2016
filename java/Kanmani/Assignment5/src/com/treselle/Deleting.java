package output.com.treselle;
import java.sql.Statement;
import java.sql.SQLException;
class Deleting
{
	public void deletingRecord(Statement st)								//Defining delete method
	{
		System.out.println("Deleting Records");
		try
		{
			String del="delete from studentInfo1 where studName='priya'";	//delete query
			st.executeUpdate(del);
		}
		catch(SQLException e)
		{
			System.out.println("Exception ----> "+e.getMessage());
		}
	}
}