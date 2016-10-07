/* 
class - Bean Class to get 
Student Details

*/
package opt.com.treselle;

import java.util.Scanner;
import java.io.Serializable;

class Student implements Serializable

{  


	String name , address;
	int id, m1,m2,m3,m4, m5;
    Scanner in = new Scanner(System.in);
   
    public Student(String name,int id, String address, int m1, int m2, int m3, int m4, int m5 )
	{
	
	  this.name = name;
	  this.id   = id;
	  this.address= address;
	  this.m1 = m1;
	  this.m2 = m2;
	  this.m3 = m3;
	  this.m4 = m4;
	  this.m5 = m5;
	}
   
	 void setName()
	 {
     System.out.println("Enter the name:");
	 name = in. next();
	 }
	 void setId()
	 {
	 System.out.println("Enter the id:");
	 id = in. nextInt();
	 }
	 void setAddress()
	 {
	 System.out.println("Enter the Address:");
	 address = in. next();
	 }
	 void setMark1()
	 {
	 System.out.println("Enter the Mark1:");
	 m1 = in. nextInt();
	 }
	 void setMark2()
	 {
	 System.out.println("Enter the Mark2:");
	 m2 = in. nextInt();
	 }
	 void setMark3()
	 {
	 System.out.println("Enter the Mark3:");
	 m3 = in. nextInt();
	 }
	 void setMark4()
	 {
	 System.out.println("Enter the Mark4:");
	 m4 = in. nextInt();
	 }
	 void setMark5()
	 {
	 System.out.println("Enter the Mark5:");
	 m5 = in. nextInt();
	 }
	 
	
   String getName()
   {
    return name;
	}
   int getId()
    {
	return id;
	}
	String getAddress()
	{
	return address;
	}
	int getMark1()
	{
	return m1;
	}
	int getMark2(){
	return m2;
	}
	int getMark3()
	{
	return m3;
	}
	int getMark4()
	{
	return m4;
	}
	int getMark5()
	{
	return m5;
   }
   public String toString() {

        return "Student [Name=" + name + "id=" + id + ", Address =" + address + ",Mark1=" + m1 +",Mark2=" + m2+",Mark3=" + m3 +",Mark4=" + m4 +",Mark5=" + m5 + "]";
    }
}