package opt.com.treselle;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
class StoreDetails
{
  
  
    String name , address;
	int id, m1,m2,m3,m4, m5;
	int n=0;
	
    Scanner in = new Scanner(System.in);
	
	Student s= new Student();
	
	DBConnect db = new DBConnect();
	
	
	public void getDetailsToBean()
	{
	try{
	// getting N number of student Details
	
	System.out.println("Enter the number of Records to be inserted");
	n = in.nextInt();
	for(int i=1; i<=n;i++)
	{
	
	    
	    System.out.println("Enter the student record no:" +i );
		System.out.println("Enter the name:");
	    name = in. next();
		s.setName(name);
		
		System.out.println("Enter the id:");
	    id = in. nextInt();
		s.setId(id);
		
		System.out.println("Enter the Address:");
	    address = in. next();
		s.setAddress(address);
		
		System.out.println("Enter the Mark1:");
	    m1 = in. nextInt();
		s.setMark1(m1);
		
		System.out.println("Enter the Mark2:");
	    m2 = in. nextInt();
		s.setMark2(m2);
		
		System.out.println("Enter the Mark3:");
	    m3 = in. nextInt();
		s.setMark3(m3);
		
		System.out.println("Enter the Mark4:");
	    m4 = in. nextInt();
		s.setMark4(m4);
		
		System.out.println("Enter the Mark5:");
	    m5 = in. nextInt();
		s.setMark5(m5);
		//Passing parameters to constructor
		
		}
		
	}
   catch (NumberFormatException e)
       {
		System.out.println("provide me only name");
		}
   }
        

		
		
// adding Details in a csv File
  public void addStudentDetails(Connection con)
   {
    try{	   
		 
		
	    for(int i = 1; i<=n; i++)
		   {
		     String name = s.getName();
		     int id = s.getId();
			 String adrs = s.getAddress();
			 int m1 = s.getMark1();
			 int m2 = s.getMark2();
			 int m3 = s.getMark3();
			 int m4 = s.getMark4();
			 int m5 = s.getMark5();
			
			 String query = " insert into studentrec (sname , sid, address, m1, m2,m3,m4,m5)values(?,?,?,?,?,?,?,?);";
			 PreparedStatement pstmt= con.prepareStatement(query);
			 
			 pstmt.setString(1,name);
			 pstmt.setInt(2,id);
			 pstmt.setString(3,adrs);
			 pstmt.setInt(4, m1);
			 pstmt.setInt(5, m2);
			 pstmt.setInt(6, m3);
			 pstmt.setInt(7, m4);
			 pstmt.setInt(8, m5);
			 pstmt.executeUpdate();
			 
			/* String query ="insert into studentrecord ('" + name + "','"+ id + "','" + adrs + "','" + m1 + "','"+ m2 +"','"+ m3 +"','"+ m4 +"','"+ m5+"')";
			 stmt.executeUpdate(query);*/
			 System.out.println("Success");
			 pstmt.close();
		     }
	    
		}catch(SQLException  e)
		{
		System.out.println(e);
		}
		}
		
	
	}
	