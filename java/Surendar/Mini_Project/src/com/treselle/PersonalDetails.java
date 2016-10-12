/* 
class - Bean Class to get 
Technical details of candidates Details

*/
package opt.com.treselle;

import java.util.Scanner;
import java.io.Serializable;

class PersonalDetails implements Serializable

{  
	private String name, dob, maritalStatus, gender;
	private int id, age;
 
     
	 void setName(String name1)
	 {
         this.name = name1;
	 }
	 void setId(int id1)
	 {
	     this.id   = id1;
	 }
	 void setAddress(String dob1)
	 {
	     this.dob= dob1;
	 }
	 void setMaritalStatus(String maritalSts)
	 {
	     this.maritalStatus = maritalSts;
	 }
	 
	 void setGender(String gender1)
	 {
		 this.gender = gender1;
	 }
	 void setage(int age1)
	 {
		 this.age= age1;
	 }
	
	 
	
    String getName()
    {
    return name;
	}
    int getId()
    {
	return id;
	}
	String getDOB()
	{
	return dob;
	}
	String getMaritalStatus()
	{
	return maritalStatus;
	}
	String getGender()
	{
	return gender;
	}
	int getAge()
	{
	return age;
	}
	
   
 }