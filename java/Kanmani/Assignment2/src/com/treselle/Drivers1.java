package output.com.treselle;
import java.util.Scanner;
public class Drivers1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Which vehicle u want\nPress \n\t1.Bike\n\t2.Car\n\t3.Jeep\n\t4.Lorry");
		int vehicle=sc.nextInt();
		switch(vehicle)
		{
			case 1:
				Bike1 b=new Bike1();
				break;
			case 2:
				Car1 c=new Car1();
				break;
			case 3:
				Jeep1 j=new Jeep1();
				break;
			case 4:
				Lorry1 l=new Lorry1();
				break;
			default:
				System.out.println("Sorry!!!! This vehicle not available @ here\tThank u");
		}
	}
}