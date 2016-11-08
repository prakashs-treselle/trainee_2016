/* 
class - Bean Class to get 
Technical details of candidates 
*/
package opt.com.treselle;

import java.util.Scanner;
import java.io.Serializable;

class SkillRegister implements Serializable

{  
	private String name , address,email, phone, degree, skill, skill1, date;
	private int id;
    Scanner in = new Scanner(System.in);
   
   
   // seting all the details of candidate
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
	 void setPhone(String ph)
	 {
	     this.phone = ph;
	 }
	 void setDegeree(String deg)
	 {
		 this.degree = deg;
	 }
	 void setskill(String skl)
	 {
		 this.skill= skl;
	 }
	 void setSkill1(String skl1)
	 {
	     this.skill1 = skl1;
	 }
	 void setDate(String dt)
	{
	     this.date=dt;
	}
	
	
// getting all the details from the candidate
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
	return email;
	}
	String getPhone()
	{
	return phone;
	}
	String getDegree()
	{
	return degree;
	}
	String getSkill()
	{
	return skill;
	}
	String getSkill1()
	{
	return skill1;
	}
	String getDate()
	{
	 return date;
	}
 
}