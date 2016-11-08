
package opt.com.treselle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class Duplicate
{
	public void  distinct (Statement stmt)
	{
		try
		{
			System.out.println("\n");
			System.out.println("show without Duplicate values...");
			String dis="SELECT DISTINCT NAME,ID,ROLL FROM TRESELLE";
		ResultSet rs1=stmt.executeQuery(dis);  
		while(rs1.next())  
			{
				System.out.println(rs1.getString(1)+" "+rs1.getInt(2)+"  "+rs1.getString(3));
			}
		}
		catch(SQLException  e)
		{
			System.out.println(e);
		}
		
	}
}