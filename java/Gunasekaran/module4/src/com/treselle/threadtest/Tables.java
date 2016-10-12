package opt.com.treselle.Threadtest;
class Tables extends Thread
{
	int i;
	int table=5;
	//constructor initialized
	Tables()
	{
		//thread gets started
		start();
	}
		// run method to start running the thread
		public void run()
		{
		try
		{
			//to print the tables of 5
			for(i=1;i<=10;i++)
			{
			System.out.println(table+ "*" +i+ "=" +table*i);   
		 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	


}