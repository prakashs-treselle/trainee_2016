//pojo class
package com.treselle.pojo;

public class PojoEmail implements java.io.Serializable{
	//This is used for global usage of local variable
	private String url=null;
	private String driverName=null;
	private String username=null;
	private String password=null;
	private String insertrec=null;
	private String selectFull=null;
	private String copy=null;
	private String delete=null;
	private String emailid=null;
	private String emailPassword=null;
	private String host=null;
	private String port=null;
	private String m_subject=null;
	
	public void setUrl(String url){
		this.url=url;
	
		}
		
	public void setDriverName(String driverName){
			
		this.driverName=driverName;
		
	}
	public void setUserName(String username){
			this.username=username;
			
		
	}
	public void setPassword(String password){
			
		this.password=password;
	
	}
	public void setInsertrec(String insertrec){
			
		this.insertrec=insertrec;
	
	}
	public void setSelectFull(String selectFull){
			
		this.selectFull=selectFull;
		
	}
	public void setCopy(String copy){
			
		this.copy=copy;
		
	}
	public void setDelete(String delete){
			this.delete=delete;
			
	}
	public void setEmailId(String emailid){
			
		this.emailid=emailid;
	
	}
	public void setEmailPassword(String emailPassword){
			
		this.emailPassword=emailPassword;
	
	}
	public void setHost(String host){
			
		this.host=host;
	
	}
	
	public void setSubject(String m_subject){
			this.m_subject=m_subject;
		
	}
	public void setPort(String port){
			
		this.port=port;
		
	}
	
	//get methods
	
	public String getUrl(){
		return url;
	}
	public String getDriverName(){
		return driverName;
	}
	public String getPassword(){
		return password;
	}
	public String getUserName(){
		return username;
	}
	public String getInsertrec(){
		return insertrec;
	}
	public String getSelectFull(){
		return selectFull;
	}
	public String getCopy(){
		return copy;
	}
	public String getDelete(){
		return delete;
	}
	public String getEmailId(){
		return emailid;
	}
	public String getEmailPassword(){
		return emailPassword;
	}
	public String getHost(){
		return host;
	}
	public String getPort(){
		return port;
	}
	public String getSubject(){
		return m_subject;
	}
	
}