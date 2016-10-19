package output.com.treselle;
class CompleteStudentDetails
{
	public static void main(String args[])
	{
		//public void choice()
		//{
			System.out.println("Enter Your chioch:");
		CreateTable createtable=new CreateTable();
		createtable.createTable();
		Insert insert=new Insert();
		insert.insertData();
	}
}