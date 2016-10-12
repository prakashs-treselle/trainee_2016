package output.com.treselle;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;
import java.sql.SQLException;
import java.lang.Exception;
import java.lang.Throwable;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.ResultSet;
import output.com.treselle.DBManager;
public class Insert
{
	Scanner sc=new Scanner(System.in);
	private static PreparedStatement preparedsmt=null;
	public void insertData() throws Throwable 
	{
		
		DBManager dbManager=new DBManager();
		Properties cprop=new Properties();
		try
		{
			System.out.println("Enter Number of students: ");
			int noStudent=sc.nextInt();
			InputStream cinput=new FileInputStream("E:\\Workspace\\Complete Student Details\\src\\com\\treselle\\GeneralDetailsOfTheStudentQuery.properties");
			cprop.load(cinput);
			GeneralDetailsOfTheStudent gds=new GeneralDetailsOfTheStudent();
			int i;
			for(i=1;i<=noStudent;i++)
			{
				try
				{
					System.out.println("Enter the Roll Number of the Student: ");
						int rollNo1=sc.nextInt();
					System.out.println("Enter the Name of the Student: ");
						String name1=sc.nextLine();
					System.out.println("Enter the Family Name of the Student: ");
						String surName1=sc.nextLine();
					System.out.println("Enter the Gender of the Student: ");
						String gender1=sc.nextLine();
					System.out.println("Enter the Father Name of the Student: ");
						String fatherName1=sc.nextLine();
					System.out.println("Enter the Father Occupation of the Student: ");
						String fOccupation1=sc.nextLine();
					System.out.println("Enter the Address of the Student: ");
						String address1=sc.nextLine();
						
						
					ResultSet resultSet=preparedsmt.executeQuery("SELECT * FROM studentGeneralDetails");
					//Setting value in the bean class(GeneralDetailsOfTheStudent)
					while(resultSet.next())
					{
					gds.setRollNo(resultSet.getInt(rollNo1));
					gds.setName(resultSet.getString(name1));
					gds.setSurName(resultSet.getString(surName1));
					gds.setGender(resultSet.getString(gender1));
					gds.setFatherName(resultSet.getString(fatherName1));
					gds.setFOccupation(resultSet.getString(fOccupation1));
					gds.setAddress(resultSet.getString(address1));
					//gds.setRollNo(rollNo1);
					//gds.setName(name1);
					//gds.setSurName(surName1);
					//gds.setGender(gender1);
					//gds.setFatherName(fatherName1);
					//gds.setFOccupation(fOccupation1);
					//gds.setAddress(address1);
					//Getting value from the bean class(GeneralDetailsOfTheStudent)
					int grollNo1=gds.getRollNo();
					String gname1=gds.getName();
					String gsurName1=gds.getSurName();
					String ggender1=gds.getGender();
					String gfatherName1=gds.getFatherName();
					String gfOccupation1=gds.getFOccupation();
					String gaddress1=gds.getAddress();
					
				Connection conn=dbManager.connections();	
				
				String cGeneralTable=cprop.getProperty("insertGeneralTable");
				
				preparedsmt=conn.prepareStatement(cGeneralTable);	
				preparedsmt.executeUpdate(cGeneralTable);				
				preparedsmt.setInt(1,grollNo1);
				preparedsmt.setString(2,gname1);
				preparedsmt.setString(3,gsurName1);
				preparedsmt.setString(4,ggender1);
				preparedsmt.setString(5,gfatherName1);
				preparedsmt.setString(6,gfOccupation1);
				preparedsmt.setString(7,gaddress1);
			}
				
				System.out.println("Inserted Records : "+i);
				}
				catch(SQLException e)
				{
					System.out.println("Exception in SQL ----> "+e.getMessage());
				}
			}
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	
}
}
