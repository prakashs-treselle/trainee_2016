package output.com.treselle;
class MethodOverLoading
{
	void display()
	{
		System.out.println("*****Java Trainee Programmers*****");
	}
	void display(int empID,String empName)
	{
		System.out.println("Employee ID: "+empID+"\nEmployee Name: "+empName);
	}
	void display(String empDesgination)
	{
		System.out.println("Employee Desgination: "+empDesgination);
	}
}
class MethodOverRidding extends MethodOverLoading
{
	void display()
	{
		System.out.println("*****Treselle Systems*****");
		super.display();
	}
}
class ABC
{
public static void main(String args[])
{
	MethodOverLoading mor=new MethodOverRidding();
		mor.display();
		mor.display(1,"Kanmani");
		mor.display("Java Trainee");
}
}
