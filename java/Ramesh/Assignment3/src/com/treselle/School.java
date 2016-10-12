package opt.com.treselle; 
import java.util.Scanner;
import java.io.*;

public class School
{  
public static void main(String args[]) 
{
try{
    FileWriter writer = new FileWriter("SchoolReport.txt");
    
    PrintWriter printWriter = new PrintWriter(writer);
  
    Student st=new Student();//object is created 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number of Records you want");
	int n=sc.nextInt();
    for(int i=1;i<=n;i++)
		{
		System.out.println("Enter your Id");
		int id=sc.nextInt();
		st.setId(id);//setting value to the object  
		printWriter.print((int) id);
		System.out.println(",");
		
     		

		System.out.println("Enter your Name");
		String name=sc.next();  
		st.setName(name);//setting value to the object  
		printWriter.print((String) name);
		System.out.println(",");
		

		System.out.println("Enter your Mark1");
		int mark1=sc.nextInt();
		st.setMark1(mark1);//setting value to the object    
		printWriter.print((int) mark1 );
		

		System.out.println("Enter your Mark2");
		int mark2=sc.nextInt();
		st.setMark2(mark2);//setting value to the object  
		printWriter.print((int) mark2 );
		

		System.out.println("Enter your Mark3");
		int mark3=sc.nextInt();
		st.setMark3(mark3);//setting value to the object  
		printWriter.print((int) mark3 );
		 

		System.out.println("Enter your Mark4");
		int mark4=sc.nextInt();
		st.setMark4(mark4);//setting value to the object  
		printWriter.print((int) mark4 );
		 

		System.out.println("Enter your mark5");
		int mark5=sc.nextInt();
		st.setMark5(mark5);//setting value to the object  
		printWriter.print((int) mark5);
		

		System.out.println("Enter your Address");
		String address=sc.next();
		st.setAddress(address);//setting value to the object  
		printWriter.print((String) address);
		
		  
		}
  
printWriter.close(); 
  
  }
catch(Exception e)
{
	System.out.println(e);
}  
    
  
}
}  