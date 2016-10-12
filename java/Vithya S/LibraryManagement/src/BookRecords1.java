//import statements
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.sql.DriverManager;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.sql.ResultSet;
 
import java.util.Properties;
import java.io.FileInputStream;


public class BookRecords1
{
	public static Connection getConnection() throws Exception 
	{
	Connection con=null;  
   	  try
	  {
	   //loading the driver
       Class.forName("com.mysql.jdbc.Driver");
	   //creating connection
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookrecords1","root","root");
      }
	  catch(Exception e)
	  {
	  System.out.println(e);
	  }  
        return con; 
      }	  
       //method to add the bookrecord
      public static int save(BookDetails bd)throws Exception
	  {  
        int status=0;   
      try
		{
		Connection con = BookRecords1.getConnection();
		//Properties p=new Properties(); 
		//FileInputStream fileInput = new FileInputStream("D:\\prop.properties"); 
        //BufferedReader br = new BufferedReader(new InputStreamReader(fileInput));		
        //p.load(fileInput);
		String sqlQuery= "INSERT INTO bookdetails1(bookid,bookname,author,publisher,stock) VALUES (?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sqlQuery);
		pst.setString(1,bd.getBookId());
		pst.setString(2,bd.getBookName());
		pst.setString(3,bd.getAuthor());
		pst.setString(4,bd.getPublisher());
		pst.setString(5,bd.getStock());
		status=pst.executeUpdate();
        System.out.println("records added");
	  
		}
		catch (Exception e) 
		 {
          e.printStackTrace();
		 }
		 return status; 
	    }
		 finally 
		 {
         pst.close();
         con.close();
	     }
}