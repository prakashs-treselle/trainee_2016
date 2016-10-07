package Assignment1.output.com.treselle.Assignment;
import java.util.Scanner;
class vehicle
{
		protected void start(int x)
			{
			int y=x;
			System.out.println("**welcome**");
			System.out.println("closed all door");
			System.out.println("initial speed of car:"+y);
			
			}


		protected void stop()
			{
			
			System.out.println("car is stopped now, destination reached.");
			}


		protected void incSpeed(int n)
			{
			int a=n;
			System.out.println("Increased Speed of car now:"+a+"Kmph");

			}
			
	
		protected void trun_Horn()
			{
			System.out.println("now  car is turning, pushing horn...");
			}
		protected void decSpeed(int m)
			{
			int b=m;
			System.out.println("Decreased Speed is:"+b+"Kmph");
			}
}

class car extends vehicle
	{
		protected void openDoor()
		{
		
			System.out.println("car door is open, get inside!");
		}
		protected void closeDoor()
		{
		System.out.println("car door is closed...");
		}
	}
	
	
public class driver
		{
		 public static void main(String args[])
		 
		{
		 Scanner s=new Scanner(System.in);
		 final int initialSpeed=40;
		car c =new car();
		System.out.println("\n");
		c.openDoor();
		System.out.println("\n");
		c.closeDoor();
		//System.out.println(\n);
		c.start(initialSpeed);
	//System.out.println(\n);
		System.out.println("\tEnter increasing speed:\n");
		int n=s.nextInt();
		n=n+initialSpeed;
		c.incSpeed(n);
		c.trun_Horn();
		System.out.println("\tEnter decreasing speed:\n");
		int m=s.nextInt();
		m=n-m;
		c.decSpeed(m);
		c.trun_Horn();
		c.incSpeed(n);
		c.stop();
		
		}
}
