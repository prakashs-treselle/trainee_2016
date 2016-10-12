package output.com.treselle;
import java.util.Scanner;
public class VehicleImpl1 extends Door1 implements I1
{
Scanner sc=new Scanner(System.in);
public int standOfTheBike()
	{
	System.out.println("Do you want Release the stand or Hold the stand");
	System.out.println("\tPress 1.Release the stand\t2.Hold the stand");
		int standStatus=sc.nextInt();
			switch(standStatus)
			{
				case 1:
					System.out.println("Stand was Released");
					break;
				case 2:
					System.out.println("Stand in ///////////////Hold");
					break;
			}
		return 1;
	}
public void start()
{
	System.out.println("My vehicle was started");
}
public int increaseSpeed()
{
		System.out.println("Initial Speed of my vehicle is: "+initialSpeed);
		int maxSpeed=80;
		int incSpeed=20;
		int currSpeed=initialSpeed+incSpeed;
		if(currSpeed>maxSpeed)
		{
			System.out.println("oh!!!!! I am driving vehicle very fast\tSpeed of my vehicle is now "+currSpeed+" i need to reduce my speed");
		}
			else
			{
						System.out.println("Current Speed of my vehicle is "+currSpeed);
			}
		return 1;
}
public int decreaseSpeed()
{
		int decreaseSpeed=20;
			System.out.println("My vehicle speed is decreased by "+decreaseSpeed);
			return 1;
}
	public void stop()
	{
		
		System.out.println("My vehicle was stopped\tBye Bye\tSee u later");
	}
public void openDoor()
{
	System.out.println("Open my vehicle door");
}
public void closeDoor()
{
		System.out.println("Close my vehicle all doors\tBe Safe");
}
}