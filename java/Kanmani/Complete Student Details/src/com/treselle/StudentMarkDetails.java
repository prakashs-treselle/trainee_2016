package output.com.treselle;
//Bean class 
//class to get mark details of the student

class StudentMarkDetails extends GeneralDetailsOfTheStudent implements java.io.Serializable 
{	
																											//Declaring variables which are student general details
	private String term;
	private int mark1;																																										
	private int mark2;																																										
	private int mark3;																																										
	private int mark4;																																										
	private int mark5;																																										

	public String getTerm()																					//Getting Data from the user
	{
		System.out.println("Which Term of marks : "+term);
		return term;
	}
	public int getMark1()																					
	{
		System.out.println("First Mark of the student is : "+mark1);
		return mark1;
	}
	public int getMark2()																					
	{
		System.out.println("First Mark of the student is : "+mark2);
		return mark2;
	}
	public int getMark3()																					
	{
		System.out.println("First Mark of the student is : "+mark3);
		return mark3;
	}
	public int getMark4()																					
	{
		System.out.println("First Mark of the student is : "+mark4);
		return mark4;
	}
	public int getMark5()																					
	{
		System.out.println("First Mark of the student is : "+mark5);
		return mark5;
	}
	
	
	public void setTerm(String term)																	//Assigning value for the variables
	{
		this.term=term;
	}
	public void setMark1(int mark1)																	
	{
		this.mark1=mark1;
	}
	public void setMark2(int mark2)																	
	{
		this.mark2=mark2;
	}
	public void setMark3(int mark3)																	
	{
		this.mark3=mark3;
	}
	public void setMark4(int mark4)																	
	{
		this.mark4=mark4;
	}
	public void setMark5(int mark5)																	
	{
		this.mark5=mark5;
	}
}