
package opt.com.treselle;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
class Create
{
	
	public void createTable(Statement stmt)
	{
		try
		{
			String sql="create table if not exists treselle(Name varchar(10),Id int(10),roll varchar(20))";
		stmt.execute(sql);
		}
		catch(SQLException  e)
		{
			 System.out.println(e);
		}
		
	}
}