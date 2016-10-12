package com.treselle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableDetail
{
	
public void createTable(stmt)
{
	// String Mysql="create table stud( stud_id int(50),stud_name varchar(20),stud_address varchar(30))"; // create a table
		//st.execute(Mysql);
		System.out.println("Table is created....");
	
}

public void select(stmt)
{
	try
		{
			String Mysql="select * from stud"; //select a query
			ResultSet res=stmt.executeQuery(Mysql);
			while(res.next())
				{
					System.out.println(res.getInt(1));
					System.out.println(res.getString(2));
				}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
}

public void update(stmt)
{
try
{
	String Mysql = "UPDATE stud SET stud_id=50, stud_address='Italy' WHERE stud_name='Ketty'"; // Update a table
	stmt.executeUpdate(Mysql);
	Mysql="SELECT * FROM stud";
	
}
catch(SQLException e)
{
System.out.println(e);
}
}		

public void insert(stmt)
{
try
{
	String Mysql = "INSERT INTO stud VALUES (1, 'Bob', 'America')"; // Insert a table
	stmt.executeUpdate(Mysql);
	 Mysql = "INSERT INTO stud VALUES (2, 'John', 'London')";
	stmt.executeUpdate(Mysql);
	 Mysql = "INSERT INTO stud VALUES (3, 'Ketty', 'Austria')";
	stmt.executeUpdate(Mysql);
	System.out.println("New user inserted....");
}
catch(SQLException e)
{
System.out.println(e);
}
}

public void delete(stmt)
{
try
{
	String Mysql = "DELETE FROM stud WHERE stud_name='Bob'"; // Delete a table
	stmt.executeUpdate(Mysql);
	System.out.println("User Deleted....");
}
catch(SQLException e)
{
System.out.println(e);
}
}
}