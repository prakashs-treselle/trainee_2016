package opt.com.treselle;

import java.sql.DriverManager;
import java.sql.Connection;
import java.io.IOException;
import java.sql.Statement;


public class Executedatabase

{

		public static void main(String[] args) 
            {
			
			try
			{
                Class.forName("com.mysql.jdbc.Driver");
		        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Customer", "root", "admin123");
				Statement st=con.createStatement();
				
				Createtb ct= new Createtb();
				ct.dbcreateTable(st);
				
				Inserttable it= new Inserttable();
				it.dbInsertTable(st);
				
			    Updatetb ut = new Updatetb();
				ut.dbupdateTable(st);
				
				Deletetb dt = new Deletetb();
				dt.dbdeleteTable(st);

			}
			
			
			catch (Exception e)
		    {
		     System.out.println("Exception-" +e.getMessage());
		    }
			}
 }


