/*Start -> Close door -> initial speed -> increase speed ->turn ->decrease speed ->horn ->increase speed->initial speed->stop-> open door
 ->close door*/

 
package output.com.treselle;
import java.util.Scanner;
class Vehicle		//Base class to define a methods used to drive a car
{
     protected void start()	//Method to start a car
    {
            System.out.println("********My Car has Started********");
    }
     protected void stop()	//Method to stop a car
    {
           System.out.println("Car Stopped \nBye!!!!Bye!!!!");
    }
     protected void increaseSpeed(int cS)		//Method to incresase speed of the car
    {
           System.out.println("My Car going very fast!!!\nNow My Car Speed is: "+cS);
     }
     protected void decreaseSpeed(int dS)		//Method to decrease speed of the car
     {
           System.out.println("I reduce the Car speed~~~~~ Now My Car Speed is: "+dS);
      }
     protected void turn()			//Method to turn a car
     {
          System.out.println("You want to turn Left or Right\t1.Left\t2.Right");
          int side;
          Scanner sc=new Scanner(System.in);
          side=sc.nextInt();
                  switch(side){
   	          case 1:
		    System.out.println("Turn this side <--<--<--<--<--");
		    break;
	          case 2:
		    System.out.println("Turn this side -->-->-->-->-->");
		    break;
		    }
      }
      protected void horn()			//Method to horn a car
     {
            System.out.println("Move!!!!Move Move!!!!!");
     }
}
class Car extends Vehicle			//Class car extended from the parent class Vehicle
{
	public void openDoor()		//Method to open a door in a car
	{
       		System.out.println("Open the Door!!!!!");
	}
	public void closeDoor()		//Method to close a door in a car
	{
       		System.out.println("Close the Door!!!!!\t");
	}
}   
class Driver 				//Main class 
{
public static void main(String args[])
{
	final int initialSpeed=20;
	Scanner sc1=new Scanner(System.in);
	Car obj=new Car();
	obj.openDoor();
	System.out.println();
	obj.closeDoor();
	System.out.println();
	obj.start();
	System.out.println();
	System.out.println("The Initial Speed of the car is: "+initialSpeed);
	System.out.println();
	System.out.println("Enter the speed to increse: ");
	int increaseSpeed =sc1.nextInt();
	int currentSpeed=initialSpeed+increaseSpeed;
	obj.increaseSpeed(currentSpeed);
	System.out.println();
	obj.turn();
	System.out.println();
	System.out.println("Enter the speed to decrese: ");
	int decreaseSpeed=sc1.nextInt();
	int decreasedSpeed=currentSpeed-decreaseSpeed;
	obj.decreaseSpeed(decreasedSpeed);
	System.out.println();
	obj.horn();
	System.out.println();
	System.out.println("Enter the speed to increse: ");
	increaseSpeed=sc1.nextInt();
	currentSpeed=initialSpeed+increaseSpeed;
	obj.increaseSpeed(currentSpeed);
	System.out.println();
	System.out.println("The Initial Speed of the car is: "+initialSpeed);
	System.out.println();
	obj.stop();
	System.out.println();
	obj.openDoor();
	System.out.println();
	obj.closeDoor();
	System.out.println();
	System.out.println("!!!!!!!!!!!!!!THANK U!!!!!!!!!!!!!!!!!!!");
}
}