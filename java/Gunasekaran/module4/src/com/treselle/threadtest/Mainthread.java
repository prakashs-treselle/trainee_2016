package opt.com.treselle.threadtest;
 import opt.com.treselle.threadtest.Tables;

 
class Mainthread 
{
	public static void main(String args[])
	{

		Tables t=new Tables();
			 //to print the even numbers upto 20
				for(int i=1;i<=20;i++)
				{
					i=i+1;
					System.out.println(i);
				}
 	}
}