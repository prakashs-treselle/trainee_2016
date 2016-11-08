package opt.com.treselle;
import java.sql.*;
public class Jdbcsample
{
   String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   //static String DB_URL = "jdbc:mysql://localhost::3306/sruthi";
   static String user = "root";
   static String pass = "admin123";
   public static void main(String[] args) 
   {
   static String DB_URL = "jdbc:mysql://localhost::3306/sruthi";
   Connection conn = null;
   Statement stmt = null;
        try
        {
    Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, user, pass);
      System.out.println("Connected database successfully...");
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
	  String sql = "CREATE TABLE Jdbcstudents(stuid int(20),firstname varchar2(20),lastname varchar2(20),age int(20))";
	  
      sql= "INSERT INTO Jdbcstudents " +
               "VALUES (100, 'Zara', 'Ali', 18)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Jdbcstudents" +
                   "VALUES (101, 'Mahnaz', 'Fatma', 25)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Jdbcstudents " +
                   "VALUES (102, 'Zaid', 'Khan', 30)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO jdbcstudents " +
                   "VALUES(103, 'Sumit', 'Mittal', 28)";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");
	  /*String sql = "RETRIEW Users SET id=?, firstname=?, lastname=? WHERE age=?";
 
PreparedStatement statement = conn.prepareStatement(sql);
statement.setString(1);
statement.setString("William Henry ");
statement.setString("bill.gates");
statement.setString(40);
 
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("An existing user was updated successfully!");
}*/

      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next())
	  {
      int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }
      rs.close();
   }catch(SQLException se)
   {
   System.out.println(se);
   }catch(Exception e)
   {
   System.out.println(e);
   }finally
   {
      
      try
	  {
         if(stmt!=null)
            conn.close();
      }
	  catch(SQLException se){
      }
      try
	  {
         if(conn!=null)
            conn.close();
      }
	  catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("jdbc succesfully");
}
}