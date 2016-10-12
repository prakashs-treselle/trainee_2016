package opt.com.treselle;

/*
CRUD operations 
*/
import java.util.Properties;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

class CrudOperationTechDetail implements Details

{
	  Scanner in = new Scanner(System.in);
	  
       //calling the connection class
       DBConnect c = new DBConnect();
      //geting connection object
       Connection con = c.createConnection();
	   
	   //Creating an object for bean class
       SkillRegister s = new SkillRegister();
	   
	   //creating ArrayList
	   ArrayList<SkillRegister> as = null;
	   Statement stmt = null;
	   PreparedStatement pstmt = null;
  
  // method to create a table 
  public void createTable()
  {
 
    try{
		stmt = con.createStatement();
		
        String qry = "create table if not exists details2(id int(5),name varchar(20),email varchar(20) ,ph varchar(13) ,deg varchar(20) , date varchar(20))";
	    stmt.execute(qry);
		System.out.println("Success");
		
      }
        
		catch(Exception  e)
		{
		System.out.println(e);
		}
	 }
	
 
  // method to get and store the details of candidates technical detail
  public void setDetails()
  {
    try{
	// getting N number of student Details
	int id;
	String name,address, ph,email ,deg ,skl,skl1, date;
	System.out.println();
	as = new ArrayList<SkillRegister> ();
	System.out.println("Enter the number of Records to be inserted");
	int n = in.nextInt();
	for(int i=1; i<=n;i++)
	{ 
		System.out.println("Enter the student record no:" +i );
		System.out.println("Enter the candidate id:");
	    id = in. nextInt();
		s.setId(id);
		
		System.out.println("Enter the candidate name:");
	    name = in. next();
		s.setName(name);
		
		System.out.println("Enter the candidateAddress:");
	    address = in. next();
		s.setAddress(address);
		
		System.out.println("Enter the Email Address:");
		email = in.next();
		s.setEmail(email);
		
		System.out.println("Enter the candidate phone no:");
	    ph = in. next();
		s.setPhone(ph);
		
		System.out.println("Enter the candidateDegree:");
	    deg = in. next();
		s.setDegeree(deg);
		
		System.out.println("Enter the skill:");
	    skl = in. next();
		s.setskill(skl);
		
		System.out.println("Enter the skill1:");
	    skl1 = in. next();
		s.setSkill1(skl1);
		
		System.out.println("Enter the date:");
	    date = in. next();
		s.setDate(date);
		
		as.add(s);
		}
		
	}
   catch (NumberFormatException e)
       {
		System.out.println("provide me only name");
		}
   }
  

  
  // method to get and store the details of candidates detail
 public void getDetails()
  {
	int id;
	String name,address,email,deg,ph,skl,skl1, date;
	
	
        try{
		      Properties p = new Properties();
		      for(SkillRegister rs : as)
			  {
			  id = rs.getId();
              name = rs.getName();  
			  email = rs.getEmail();
			  ph = rs.getPhone();
			  deg = rs.getDegree();
			  skl = rs.getSkill();
			  date = rs.getDate();
			  
			  /*String query;
			  FileReader os = new FileReader("d:\\queryfile.txt");
	          p.load(os);
	          query = p.getProperty("query");*/
              pstmt = con.prepareStatement("insert into details2(id ,name , email ,ph ,deg , date)values(?,?,?,?,?,?);");
   
			 pstmt.setInt(1,id);
			 pstmt.setString(2,name);
			 pstmt.setString(3,email);
			 pstmt.setString(4, ph);
			 pstmt.setString(5, deg);
			 pstmt.setString(6, date);
			 pstmt.executeUpdate();
			 }
			 c.closeConnection();
			}
	    catch (SQLException se)
		{
		   System.out.println(se);
		}
		/*catch (IOException e)
        {
           System.out.println(e);
        }*/
		

 }
 
 
 // function for retrieving data
public void retriveByName(String name)
{
 
   Properties p = new Properties();
   try
   {
   /*reading file to get the query*/
    FileReader os = new FileReader("d:\\queryfile.txt");
	p.load(os);
	String query = p.getProperty("query");
    pstmt = con.prepareStatement(query);
   
    pstmt.setString(1,name);
    ResultSet rs = pstmt.executeQuery();
    while (rs.next())
	{
    System.out.println("ID= " + rs.getString(1));
	System.out.println("\t\t");
    System.out.println("Name= " + rs.getString(2));
	System.out.println("\t\t");
	System.out.println("Email= " + rs.getString(3));
	System.out.println("\t\t");
	System.out.println("Phone= " + rs.getString(4));
	System.out.println("\t\t");
    }
	 System.out.println("\n");
   }
   catch (SQLException se)
   {
    System.out.println(se);
   }
   catch (IOException e)
   {
    System.out.println(e);
   }
}

 }