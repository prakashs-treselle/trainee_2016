//Class to create student mark details
package output.com.treselle;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import output.com.treselle.DBManager;
public class CreateMarkTable
{
	public void createMarkTable()
	{
		try
		{
			DBManager dbManager=new DBManager();
			Connection conn=dbManager.connections();
			Properties cprop=new Properties();					//creating object for the properties class
			InputStream cinput=new FileInputStream("E:\\Workspace\\Complete Student Details\\src\\com\\treselle\\GeneralDetailsOfTheStudentQuery.properties");    	//invoking property file(GeneralDetailsOfTheStudentQuery.properties)
			cprop.load(cinput);
				String cMarkTable=cprop.getProperty("createMarkTable");			//using createMarkTable Query from GeneralDetailsOfTheStudentQuery.properties
				Statement st=conn.createStatement();
				st.execute(cMarkTable);
				System.out.println("Student Mark Details Table were created");
		}
		catch(SQLException e)
		{
			System.out.println("Exception in SQL ----> "+e.getMessage());
		}
	}
}