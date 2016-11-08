package opt.com.treselle;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.io.IOException;
import java.sql.Statement;
	
public class Createtable
{
	public static void main(String[] args) throws Exception
	{
        Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		System.out.println();	
		Statement st=con.createStatement();
		try
		{
		String sql= "create table stud5(studno int(5), studname varchar(20), studaddress varchar(20), studmarks float(10,2))";
		st.execute(sql);
		System.out.println("DB table Created");
		String sql1 ="insert into stud4 values(01, 'raj', 'skt', 82.5)";
	    st.executeUpdate(sql1);
		String sql3 ="insert into stud4 values(02, 'ram', 'omr', 92.5)";
	    st.executeUpdate(sql3);
	    System.out.println("DB value is inserted");
	    String sql2 = "Update stud4 Set studno=11, studname='sita', studaddress ='strt' where studmarks = 85";
		st.executeUpdate(sql2);
		System.out.println("DB value is updated");
		String sql4= "DELETE FROM stud4 WHERE studno=02";
		st.executeUpdate(sql4);
		System.out.println("DB value is Deleted");
        
	    }
		
		catch(Exception e)
		{
		System.out.println("Exception-" +e.getMessage());
		}
		st.close();
		con.close();
	}
	
}
		
	
 