package opt.com.treselle.employeedetails;
import opt.com.treselle.employeedetails.EmployeeDetails;
import java.util.*;
class Employee
{

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	//object initialization
	EmployeeDetails emp=new EmployeeDetails();
	
	int[] empid=new int[5];
	String[] empname=new String[5];
	int[] salary=new int[5];
	int n,i=0;
	
	//getting n number of employee records and store it in array of variables
	System.out.println("EMPLOYEE DETAILS");
	System.out.println("Enter no. of records you want to enter");
	n=sc.nextInt();
		for(i=0;i<n;i++)
		{
		System.out.print("Enter the employee id\t");
		empid[i]=sc.nextInt();

		System.out.print("Enter the employee name\t");
		empname[i]=sc.next();
			
		System.out.print("Enter the employee salary\t");
		salary[i]=sc.nextInt();
	
		System.out.println("RECORD INSERTED SUCCESSFULLY");
		}
	
	
	System.out.println("\tEMPLOYEE ID \t EMPLOYEE NAME \t SALARY ");
		for(i=0;i<n;i++)
		{	
			//calling the display method
			emp.display(empid[i],empname[i],salary[i]);
		}
	System.out.println("Values are displayed");
	System.out.println("DISPLAYING ONLY THE EMP ID AND EMP NMAE");
	
	System.out.println("\tEMPLOYEE ID \t EMPLOYEE NAME ");
		for(i=0;i<n;i++)
		{	
			//calling the dusplay method
		emp.display(empid[i],empname[i]);
		}
	
	System.out.println("enter the employee name you want to search");
	String name=sc.next();
		for(i=0;i<n;i++)
		{
			if (name==empname[i])
			{
				emp.display( name,empid[i],empname[i],salary[i]);
			}
		}
	}	
}