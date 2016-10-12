package output.com.treselle;
//Bean class 
//class to get general student details

class GeneralDetailsOfTheStudent implements java.io.Serializable 
{																											//Declaring variables which are student general details
	private int rollNo;																																										
	private String name;
	private String surName;
	private String gender;
	private String fatherName;
	private String fOccupation;
	//private Date dOB;
	private String address;

	
	public int getRollNo()																					//Getting Data from the user
	{
		System.out.println("RollNo of the student is : "+rollNo);
		return rollNo;
	}
	public String getName()
	{
		System.out.println("Name of the student is : "+name);
		return name;
	}
	public String getSurName()
	{
		System.out.println("SurName of the student is : "+surName);
		return surName;
	}
	public String getGender()
	{
		System.out.println("Gender of the student is : "+gender);
		return gender;
	}
	public String getFatherName()
	{
		System.out.println("Father Name of the student is : "+fatherName);
		return fatherName;
	}
	public String getFOccupation()
	{
		System.out.println("Father Occupation of the student is : "+fOccupation);
		return fOccupation;
	}
	
	//public Date getDOB()
	//{
	//	System.out.println("Gender of the student is : "+gender);
	//	return dOB;
	//}
	
	public String getAddress()
	{
		System.out.println("Gender of the student is : "+gender);
		return address;
	}
	
	
	public void setRollNo(int rollNo)																	//Assigning value for the variables
	{
		this.rollNo=rollNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSurName(String surName)
	{
		this.surName=surName;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public void setFatherName(String fatherName)
	{
		this.fatherName=fatherName;
	}
	public void setFOccupation(String fOccupation)
	{
		this.fOccupation=fOccupation;
	}
	
	//public void setDOB(Date dOB)
	//{
	//	this.dOB=dOB;
	//}
	public void setAddress(String address)
	{
		this.address=address;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	









