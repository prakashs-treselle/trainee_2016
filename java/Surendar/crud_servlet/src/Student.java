package com.treselle;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
 
public class Student extends HttpServlet
{
	Connection conn = null;
	Statement stmt = null;
  public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Student Result";
      String docType =
        "<!doctype html public \"-//w3c//dtd html 4.0 " +
         "transitional//en\">\n";
         out.println(docType +
         "<html>\n" +
         "<head><title>" + title + "</title></head>\n" +
         "<body bgcolor=\"#00FFFF\">\n" +
         "<h1 align=\"center\">" + title + "</h1>\n");
      try{
         // Register JDBC driver
         Class.forName("com.mysql.jdbc.Driver");

         // Open a connection
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");

         // Execute SQL query
         Statement stmt = conn.createStatement();
         String sql;
         sql = "SELECT id, name, degree, age FROM Stud";
         ResultSet rs = stmt.executeQuery(sql);

         // Extract data from result set
         while(rs.next())
		 {
            //Retrieve by column name
            int id  = rs.getInt("id");
            int age = rs.getInt("age");
            String name = rs.getString("name");
            String degree = rs.getString("degree");

            //Display values
            out.println("ID: " + id + "<br>");
            out.println("Age: " + age + "<br>");
            out.println("Name: " + name + "<br>");
            out.println("Degree: " + degree + "<br>");
         }
         out.println("</body></html>");

         // Clean-up environment
         rs.close();
         stmt.close();
         conn.close();
      }catch(SQLException se){
         //Handle errors for JDBC
         se.printStackTrace();
      }catch(Exception e){
         //Handle errors for Class.forName
         e.printStackTrace();
      }
   }
} 