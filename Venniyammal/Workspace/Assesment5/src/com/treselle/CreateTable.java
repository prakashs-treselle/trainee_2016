package opt.com.treselle;

import java.sql.Statement;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

class CreateTable
{
 public void createTable(Connection con ,Statement stmt)
   {
	try{
         String qry = 
		" create table studentrec (sname varchar(10), sid int(3), address varchar(10), m1 int(3), m2 int(3), m3 int(3), m4 int(3),m5 int(3));";
	    stmt.execute(qry);
		System.out.println("Success");
      }
        
		catch(SQLException  e)
		{
		System.out.println(e);
		}
	 }
}