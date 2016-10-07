package output.com.treselle;
import java.util.Scanner;
class Vehicle
{         //Methods are defined here
		  protected void start()
		  {
		   // when calling the start method  this satate ment will execute
			System.out.println("The car gets started");
			System.out.println("Driver drove the car with the initial speed of 20km/hr");
		  }
		  protected void stopCar()
		  {
		   // to stop the car
			System.out.println("The car has stopped");
		  }
		  protected void increasedSpeed(int a,int b)
		  {
			 System.out.println("The speed of the Vehicle increased by" +(a+b)+"km/hr" );
		   }
			 
		   protected void decsp(int a1)
		  {
			  System.out.println("The speed of the Vehicle decreased by" +a1+"km/hr" );
		  }
		  protected void turn()
		  {
			System.out.println("The turning comes while driving so the driver decrease the car speed");
		  }
		  protected void horn()
		  {
		   System.out.println("The horn blows before turning");
		  }
 }
  class car extends Vehicle
    {
		protected void openDoor()
		{
		System.out.println("The door is opened");
		}
		protected void closeDoor()
		{
		System.out.println("The door is closed");
		}
	}  
	
	public class Driver
	{
		public static void main(String[] args)
		{
		   final int speed =20;
		   car ob1= new car();   //object created for the class car
		   
		   Scanner v= new Scanner(System.in);
		    
			ob1.start();   
			ob1.closeDoor();
			System.out.println("Enter the increasing speed value");
			int increasingspeed=v.nextInt();   //getting increasing speed from the user
			ob1.increasedSpeed(speed,increasingspeed);
		    int r=speed+increasingspeed;
			ob1.turn();
			System.out.println("Decreasing the speed value");
			int decreasingspeed=v.nextInt();
			int dec=((speed+increasingspeed)-decreasingspeed);  //to get the decreasing speed we do this
			ob1.decsp(dec);
			ob1.horn();
	        ob1.increasedSpeed(speed,increasingspeed);
		    ob1.stopCar();
			ob1.openDoor();
			ob1.closeDoor();
	    }
	}


