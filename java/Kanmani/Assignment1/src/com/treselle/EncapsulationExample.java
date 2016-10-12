package output.com.treselle;
class HiddenData
{
	private int EmpID;
	private String EmpName;
	private int EmpSalary;

	public int getEmpID()
	{
		return EmpID;
	}
	public String getEmpName()
	{
		return EmpName;
	}
	public int getEmpSalary()
	{
		return EmpSalary;
	}
	public void setEmpID(int EmpID)
	{
		this.EmpID=EmpID;
	}
	public void setEmpName(String EmpName)
	{
		this.EmpName=EmpName;
	}
	public void setEmpSalary(int EmpSalary)
	{
		this.EmpSalary=EmpSalary;
	}
}
class EncapsulationExample
{
public static void main(String args[])
{
	HiddenData hd=new HiddenData();
		hd.setEmpID(1);
		hd.setEmpName("KanmaniVenkatesan");
		hd.setEmpSalary(8000);
		System.out.println("Employee ID: "+hd.getEmpID()+"\nEmployee Name: "+hd.getEmpName()+"\nEmployee Salary: "+hd.getEmpSalary()+" ");
}
}

