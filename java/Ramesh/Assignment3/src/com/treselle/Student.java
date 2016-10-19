package opt.com.treselle; 
//import java.io.Serializable;
public class Student implements java.io.Serializable
{  
	private int id;  
	private String name;
	private int mark1;
	private int mark2;
	private int mark3;
	private int mark4;
	private int mark5;
	private String address;  
  
	public Student()
	{
	}  
  
	public void setId(int id){this.id=id;}  
	  
	public int getId(){return id;}  
	  
	public void setName(String name){this.name=name;}  
	  
	public String getName(){return name;}

	public void setMark1(int mark1){this.mark1=mark1;} 

	public int getMark1(){return mark1;}

	public void setMark2(int mark2){this.mark2=mark2;} 

	public int getMark2(){return mark2;} 

	public void setMark3(int mark3){this.mark3=mark3;} 

	public int getMark3(){return mark3;} 

	public void setMark4(int mark4){this.mark4=mark4;} 

	public int getMark4(){return mark4;} 

	public void setMark5(int mark5){this.mark5=mark5;} 

	public int getMark5(){return mark5;}

	public void setAddress(String address){this.address=address;} 

	public String getAddress(){return address;}   


  
}  