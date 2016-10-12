package output.com.treselle;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

class UpDate
{
	public void updatingRecord(Statement st)								//Defining update method
	{
		System.out.println("Updating Records");
		try
		{	
			String update="update studentInfo1 set studName='karish' where studId=1";	//update query
			st.executeUpdate(update);
		}
		catch(SQLException e)
		{
			System.out.println("Exception ----> "+e.getMessage());
		}
	}
}
			
