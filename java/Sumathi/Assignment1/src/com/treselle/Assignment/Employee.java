package Assignment1.output.com.treselle.Assignment;
class Employee1{
	private int employeeId;
	
	private String employeeName;
	
	private String designation;
	
	public int getEmployeeId() {
		return employeeId;
		
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
		
	}
	public String getEmployeeName() {
		return employeeName;
		
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
		
	}
	public String getDesignation() {
		return designation;
		
	}
	public void setDesignation(String designation) {
		this.designation = designation;
		
	}	
}		
class Employee
{
public static void main(String args[])
{
Employee1 e=new Employee1();
e.setEmployeeId(21);
System.out.println(e.getEmployeeId());
e.setEmployeeName("seema");
System.out.println(e.getEmployeeName());
e.setDesignation("manager");
System.out.println(e.getDesignation());
}
}