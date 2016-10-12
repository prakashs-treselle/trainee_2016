package output.com.treselle;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException; 
import java.util.Scanner;
class Complete
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Roll Number of the Student: ");
	int rollNo1=sc.nextInt();
	System.out.println("Enter the Name of the Student: ");
	int name1=sc.nextLine();
	System.out.println("Enter the Family Name of the Student: ");
	int surName1=sc.nextLine();
	System.out.println("Enter the Gender of the Student: ");
	int gender1=sc.nextLine();
	System.out.println("Enter the Father Name of the Student: ");
	int fatherName1=sc.nextLine();
	System.out.println("Enter the Father Occupation of the Student: ");
	int fOccupation1=sc.nextLine();
	System.out.println("Enter the Address of the Student: ");
	int address1=sc.nextLine();
	PreparedStatement preparedsmt=con.prepareStatement();
	List<GeneralDetailsOfTheStudent> gdsList=new ArrayList<GeneralDetailsOfTheStudent>();


	try
		{
		Class.forName("com.mysql.jdbc.Driver");							//Initialize JDBC Driver
		Connection 									
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/completestudentdetails","root","kanmani");
			System.out.println("Insert data");
			String insertQuery="INSERT INTO studentGeneralDetails VALUES(?,?,?,?,?,?,?)";	
			preparedsmt.executeUpdate(insertQuery);
			preparedsmt.setInt(1,rollNo1);
			preparedsmt.setString(2,name1);
			preparedsmt.setString(3,surName1);
			preparedsmt.setString(4,gender1);
			preparedsmt.setString(5,fatherName1);
			preparedsmt.setString(6,fOccupation1);
			preparedsmt.setString(7,address1);
			ResultSet resultSet=preparedsmt.executeQuery("SELECT * FROM studentGeneralDetails");
			while(resultSet.next())
			{
				GeneralDetailsOfTheStudent gds=new GeneralDetailsOfTheStudent();
					gds.setRollNo(resultSet.getInt(rollNo1));
					gds.setName(resultSet.getString(name1));
					gds.setName(resultSet.(getString(surName1));
					gds.setName(resultSet.(getString(gender1));
					gds.setName(resultSet.(getString(fatherName1));
					gds.setName(resultSet.(getString(fOccupation1));
					gds.setName(resultSet.(getString(address1));
					gdsList.add(gds);
			}
			

			

			
			

		}
		catch(SQLException e)
		{
			System.out.println("Exception ----> "+e.getMessage());
		}
System.out.println("Enter the RollNo : ");
//int rollNo=sc.nextInt();
gds.setRollNo(sc.nextInt());
gds.getRollNo();

}
}

