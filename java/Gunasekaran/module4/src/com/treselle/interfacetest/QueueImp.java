package opt.com.treselle.interfacetest;
import java.util.Queue;
import java.util.LinkedList;
import java.io.IOException;
import java.util.Scanner;
class QueueImp implements Iqueue
{
Queue <Integer> q=new LinkedList <Integer>();
Scanner sc=new Scanner(System.in);
	int n;
	public void insert()
	{
		try
		{
		System.out.println("ente the no. value u want to add in queue");
		n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
		//adding the values into the queue
		q.add(i);
		}
		System.out.println(+n+ "values are added in the queue");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void delete()
	{
		try
		{
		//deletes the head element in the queue
		q.remove();
		System.out.println("head value is deleted");
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	public void display()
	{
	//displays all the element in the queue in fifo
	System.out.println(q);
	}
}

	