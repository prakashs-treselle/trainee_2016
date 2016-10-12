package output.com.treselle;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class JDBCTesting
{
	public static void main(String args[]) throws Exception
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");							//Initialize JDBC Driver
		Connection 									
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb","root","kanmani");
			Statement st=con.createStatement();
			//String sqlStudent="create table studentInfo1(studId int(10),studName varchar(25))";  //Creating table
				//st.execute(sqlStudent);
				System.out.println("Table Created");
					Insert ins=new Insert();					//creating object for various classes
					UpDate up=new UpDate();
					SelectRecord sel=new SelectRecord();
					Deleting del=new Deleting();
						ins.insertRecord(st);					//invoking methods
						sel.displayingRecord(st);
						up.updatingRecord(st);
						sel.displayingRecord(st);
						del.deletingRecord(st);
						sel.displayingRecord(st);
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
						