package output.com.treselle;
import java.sql.Statement;
import java.sql.SQLException;

class Insert
{
	public void insertRecord(Statement st)							//Defining insert method
	{
		System.out.println("Inserting Records");
		try
		{	
			st.executeUpdate("insert into studentInfo1 values(1,'kanmani')");		//insert query
			st.executeUpdate("insert into studentInfo1 values(2,'priya')");
			st.executeUpdate("insert into studentInfo1 values(3,'venkat')");
		}
		catch(SQLException e)
		{
			System.out.println("Exception ----> "+e.getMessage());
		}
	}
}