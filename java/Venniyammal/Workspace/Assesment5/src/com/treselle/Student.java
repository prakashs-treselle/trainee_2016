/* 
class - Bean Class to get 
Student Details

*/
package opt.com.treselle;

import java.util.Scanner;
import java.io.Serializable;

class Student implements Serializable

{  


	private String name , address;
	private int id, m1,m2,m3,m4, m5;
    Scanner in = new Scanner(System.in);
   
    public void Student(String name,int id, String address, int m1, int m2, int m3, int m4, int m5 )
	
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
   
	 void setName(String name1)
	 {
         this.name = name1;
	 }
	 void setId(int id1)
	 {
	     this.id   = id1;
	 }
	 void setAddress(String address1)
	 {
	     this.address= address1;
	 }
	 void setMark1(int mk1)
	 {
	     this.m1 = mk1;
	 }
	 void setMark2(int mk2)
	 {
	     this.m2 = mk2;
	 }
	 void setMark3(int mk3)
	 {
		 this.m3 = mk3;
	 }
	 void setMark4(int mk4)
	 {
		 this.m4 = mk4;
	 }
	 void setMark5(int mk5)
	 {
		 this.m5 = mk5;
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