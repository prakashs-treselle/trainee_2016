package com.treselle.pojo;

public class BirthDay {

	private String Name,eMail,City,dob,currentdate;
	
	//constructor to set the values
	public BirthDay( String Name, String eMail,String City,String dob,String currentdate){
		this.Name = Name;
		this.eMail =eMail;
		this.City =City;
		this.dob =dob;
		this.currentdate =currentdate;
	}
	
	public String getName() {
		return Name;
	}
	public String getEmail() {
		return eMail;
	}
	public String getCity() {
		return City;
	}
	public String getDob() {
		return dob;
	}
	public String getCurrentdate(){
		return currentdate;
	}
}