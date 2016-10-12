package output.com.treselle;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
class SelectRecord
{
	public void displayingRecord(Statement st)							//Defining select method
	{
		System.out.println("Displaying Records");
		try
		{
			
			String sel="select * from studentInfo1";					//select query
			ResultSet res=st.executeQuery(sel);
			while(res.next())
				{
					System.out.println(res.getInt(1));
					System.out.println(res.getString(2));
				}
		}
		catch(SQLException e)
		{
			System.out.println("Exception ----> "+e.getMessage());
		}
	}
}