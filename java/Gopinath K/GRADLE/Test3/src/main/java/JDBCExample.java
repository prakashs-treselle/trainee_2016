package opt.com.treselle;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.Thread;

public class JDBCExample
{
	
	
	public static void main(String args[])
	{
		
		try
		{
		ConDB condb=new ConDB();
		Controll ctrl=new Controll();
		UpDel ud=new UpDel();
		Show sh=new Show();
		Duplicate du=new Duplicate();
		Create cr=new Create();
		DeleteRec dl=new DeleteRec();
		
		Statement st=condb.connectionDB();
		
		cr.createTable(st);
			Thread.sleep(1000);
		ctrl.insert(st);
			Thread.sleep(1000);
		
		sh.select(st);
			Thread.sleep(1000);
			
		dl.delete(st);
			Thread.sleep(1000);
			
		sh.select(st);
			Thread.sleep(1000);
			
		ud.update1(st);
			Thread.sleep(1000);
			
		sh.select(st);
			Thread.sleep(1000);
			
		du.distinct(st);
		
	 
		}
		catch(SQLException  e)
		{
			System.out.println(e);
			
		}
			catch(Exception  e1)
		{
			System.out.println(e1);
			
		}
		
		
	}
}