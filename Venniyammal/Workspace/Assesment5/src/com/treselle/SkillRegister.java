/* 
class - Bean Class to get 
Technical details of candidates 
*/
package opt.com.treselle;

import java.util.Scanner;
import java.io.Serializable;

class SkillRegister implements Serializable

{  
	private String name , address,email, degree, skill, skill1,degree;
	private int id, phone;
    Scanner in = new Scanner(System.in);
   
   
   
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
	 void setEmail(String mail)
	 {
	     this.email = mail;
	 }
	 void setPhone(int ph)
	 {
	     this.phone = ph;
	 }
	 void setDegeree(String deg)
	 {
		 this.degeree = deg;
	 }
	 void setskill(String skl)
	 {
		 this.skill= skl;
	 }
	 void setSkill1(String skl1)
	 {
	     this.skill1 = skl1;
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
	String getEmail()
	{
	return mail;
	}
	int getPhone(){
	return ph;
	}
	String getDegree()
	{
	return degeree;
	}
	String getSkill()
	{
	return skill;
	}
	String getSkill1()
	{
	return skill1;
	}
	
   public String toString() {

        return "Student [Name=" + name + "id=" + id + ", Address =" + address + ",Mark1=" + m1 +",Mark2=" + m2+",Mark3=" + m3 +",Mark4=" + m4 +",Mark5=" + m5 + "]";
    }
}