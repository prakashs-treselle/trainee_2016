package output.com.treselle;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import output.com.treselle.DBManager;
public class CreateTable
{
	//private static 
	public void createTable()
	{
		try
		{
			DBManager dbManager=new DBManager();
			Connection conn=dbManager.connections();
			Properties cprop=new Properties();
			InputStream cinput=new FileInputStream("E:\\Workspace\\Complete Student Details\\src\\com\\treselle\\GeneralDetailsOfTheStudentQuery.properties");
			cprop.load(cinput);
				String cGeneralTable=cprop.getProperty("createGeneralTable");
				Statement st=conn.createStatement();
				st.execute(cGeneralTable);
				System.out.println("Table created");
		}
		catch(SQLException e)
		{
			System.out.println("Exception ----> "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception ----> "+e.getMessage());
		}
	}
}