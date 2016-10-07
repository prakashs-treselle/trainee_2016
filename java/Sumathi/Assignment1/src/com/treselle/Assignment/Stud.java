//package module2.output.com.treselle.Assignment;
package Assignment1.output.com.treselle.Assignment;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
class Student implements java.io.Serializable
{  
	private int id;  
	private String name;  
	private int m1;
	private int m2;
	private int m3;
	private int m4;
	private int m5;
	 
			  
		public void setId(int id1)
		{
			id=id1;
			//return id;
		}  
		  
		public int getId()
		{
			return id;
		}  
		  
		public void setName(String name1)
		{
			name=name1;
			//return name;
		}  
		  
		public String getName()
		{
			return name;
		}  
		public void setmark1(int mm1)
		{
			m1=mm1;
			//return m1;
		}  
		  
		public int getmark1()
		{
			return m1;
		}
		public void setmark2(int mm2)
		{
			m2=mm2;
			//return m2;
		}  
		  
		public int getmark2()
		{
			return m2;
		}
		public void setmark3(int mm3)
		{
			m3=mm3;
			//return m3;
		}  
		  
		public int getmark3()
		{
			return m3;
		}
		public void setmark4(int mm4)
		{
			m4=mm4;
			//return m4;
		}  
		  
		public int getmark4()
		{
			return m4;
		}
		public void setmark5(int mm5)
		{
			m5=mm5;
			//return m5;
		}  
		  
		public int getmark5()
		{
			return m5;
		}
		}


  
public class Stud
{  
	public static void main(String[] args) throws Exception
	  {
	  int Id=0,M1=0,M2=0,M3=0,M4=0,M5=0;
	  String Name="";
		Scanner s= new Scanner(System.in);
		//InputStream in = System.in;
		//BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
		FileWriter file = new FileWriter("Hell.csv");
		Student e=new  Student();//object is created   
		System.out.println("Enter size:");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		try
		{
		
		
		System.out.println("Enter name:");
		 Name=s.next();
		
		file.write(Name);
		file.write("\r\t");
		
		
		System.out.println("Enter Id:");
		 Id=s.nextInt();
		
		file.write(String.valueOf(Id));
			file.write("\r\t");
		
		System.out.println("Enter Mark1:");
		 M1=s.nextInt();
		
		file.write(String.valueOf(M1));
			file.write("\r\t");
		
		System.out.println("Enter Mark2:");
		M2=s.nextInt();
		
		file.write(String.valueOf(M2));
			file.write("\r\t");
		
		System.out.println("Enter Mark3:");
		M3=s.nextInt();
		
		file.write(String.valueOf(M3));
			file.write("\r\t");
		
		System.out.println("Enter Mark4:");
		M4=s.nextInt();
		
		file.write(String.valueOf(M4));
			file.write("\r\t");
		
		System.out.println("Enter Mark5:");
		M5=s.nextInt();
		
		file.write(String.valueOf(M5));
			file.write("\r\t");

		file.write("Record is added");
		 file.close();
		}
		
		catch(Exception ea)
		{
		ea.printStackTrace();//catch and report any errors
		//System.out.println("Error!");
		
		}
		 
		 
		e.setName(Name);
		e.setId(Id);	//setting value to the object;   writer.write(text);
		e.setmark1(M1);
		e.setmark2(M2);
		e.setmark3(M3);
		e.setmark4(M4);
		e.setmark5(M5);
		  
		  
		  
		System.out.println(e.getName());  
		System.out.println(e.getId());
		System.out.println(e.getmark1());
		System.out.println(e.getmark2());
		System.out.println(e.getmark3());
		System.out.println(e.getmark4());
		System.out.println(e.getmark5());
		  
		 
		}
}  