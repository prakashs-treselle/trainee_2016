

package opt.com.treselle.employeedetails;
import java.util.Scanner;
import java.lang.String;
class EmployeeDetails
{
Scanner sc=new Scanner(System.in);
int i=0;
int n;
//private variable declaration
private int[] empid=new int[5];
private String[] empname=new String[5];
private int[] salary=new int[5];

//method to display emp id and emp name
void display(int id,String name)
	{
		empid[i]=id;
		empname[i]=name;
		System.out.print("\t" +empid[i]);
		System.out.print("\t\t\t" +empname[i]);
				 
	}
//method to diaplsy emp id , empname and theri corresponding salary	
	void display(int id,String name,int sal)
	{
			empid[i]=id;
			empname[i]=name;
			salary[i]=sal;
		 
		System.out.print("\t" +empid[i]);
		System.out.print("\t\t\t" +empname[i]);
		System.out.print("\t\t\t" +salary[i]+"\n");
		
}
void display(String find,int id,String empname,int salary)
{/*
/String name=find;
empid[i]=id;
empname[i]=empname;
salary[i]=salary;
		System.out.print("\t" +empid[i]);
		System.out.print("\t\t\t" +empname[i]);
		System.out.print("\t\t\t" +salary[i]+"\n");
		
}*/
}

 }