package opt.com.treselle;
import java.util.Scanner;


// Super class 
class Vehicle
   { 
     public  static int speed =10;
     
// start the car
    public void start()
    {
       System.out.println("The car is started and running at  the speed of  " + speed + " Km/h");
    }
// increase speed 
	public void increaseSpeed()
    {
      int s = ++speed;
      System.out.println("\n\tNow the car is running at the speed of  "  + s +  " Km/h");
    }
	public static void decreaseSpeed()
    {
     int s =  --speed;
     System.out.println("\t Decreasing the speed to " + s+" Km/h\n"); 
    }
//turn comes
  
    public void trunHorn()
    {
      System.out.println("\t Now the car going to slow down ... so decreasing the speed  and Horning \n");
    }


    public void stop()    // stop the car
    {
      System.out.println("\t Car going to stop ready to get down\n");
    } 

}


// main class that inherits the Vehicle and all the methods

class Car extends Vehicle

{
    Vehicle v = new Vehicle();
    
    public  void openDoor()  // open door
    {
       System.out.println(" \tOpen the Door now \n");
    }   
    public void closeDoor()   // close door
    {
       System.out.println("\tClose the door now");
    } 
    public void initialSpeed() // to initial Speed
    {
   while(speed!=10)
    {
      v.decreaseSpeed();
    }
  }
}


class Driver

 {
   public static void main(String [] args)
    {
      Scanner in = new Scanner(System.in);
      int ch;
      Car c = new Car();
	
      
       System.out.println("*~*  Hello all Welcome to Treselle Caps !!! \n \n \t I am the driver of this cap  Please Provid me Instruction as follows to autoDrive.");

	do{
		   
      		System.out.println(" \n Press 1: \t To Start Drive \n Press 2: \t To Increase the Speed \n Press 3: \t To Turn \n Press 4: \t To Stop ");

		ch = in.nextInt(); 
     	switch(ch)
			{		
    			case 1:
					c.openDoor();
					c.closeDoor();
					c.start();
					break;
				case 2:
					c.increaseSpeed();	
					break;
				case 3:
					c.trunHorn();
					c.decreaseSpeed();
					System.out.println("Truning completed and Speed is Increasing");
					c.increaseSpeed();
					break;
				case 4: 
					c.stop();
					c.initialSpeed();
					System.out.println("\tCar is stopped");
					c.openDoor();
					c.closeDoor();
					System.out.println("Thank you!!!");
					break;
				default:
   					System.out.println("Provide me the correct Instruction");
			    }
         }while(ch!=4);	
    }

   }   				   