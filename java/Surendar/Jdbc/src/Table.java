package com.treselle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Table
{
      public static void main(String args[])
	{  
		try
			{  
				Class.forName("com.mysql.jdbc.Driver");  
				  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");  
				Statement stmt=con.createStatement();  
				//creating object for TableDetail class
				TableDetail td = new TableDetail();
				
				td.createTable(stmt);
				td.insert(stmt);
				td.select(stmt);
				td.update(stmt);
				td.select(stmt);
				td.delete(stmt);
				 con.close();  
				
			}
				catch(Exception e)
				{ 
				System.out.println(e);
				}  
	}  
}
