package opt.com.treselle;
//venni

import java.util.Scanner;
class Lorry extends sound implements vehicle , fourwheeler
    {
     static int speed= 10;
	 int maxSpeed = 50;
	 int limit =40;
	 
	 // creating function for Increase and Decrease the Speed
	 
	 void increaseSpeed() 
	    { 
		    Exception e = new Exception();
	         speed = 10+speed;
		    /* while(limit!=speed)
		    {
		     System.out.println("\n \t Now the bike is running at the Speed of " + speed + " Km/h.");
			}*/
		System.out.println("\n \t Now the bike is running at the Speed of " + speed + " Km/h.");
		  if(speed==maxSpeed)
		    {
			 System.out.println(" Alert !!! Alert!!! Your Exceeding the speed limit");
			}
		   else if ( speed>=limit)
			{
			 System.out.println("\n\t Your running at the 80% of the speed");
			 }
		    
	    }
	 void decreaseSpeed()
	    {
	         speed =speed-20;
		     System.out.println("\n\t Now the Lorry is running at the Speed of " + speed +"  Km/h." );
		}
		
		
	 // implementation of Interface methods 
	  void horn()
        {
         System.out.println("\n \t Beeeeeeeep");
        }
	 
	 public void openDoor()
	    {
		     System.out.println("\n \t Open the Door");
		}
	 public void closeDoor()
	    {
		     System.out.println("\n\t Close the Door");
		}
		
	 public void start()
	     {
			 openDoor();
			 closeDoor();
		     System.out.println("\n \t Now the Lorry Started at the Initial Speed of 10 km/h");
		 }
	 public void turn()
	     { 
		    
		     decreaseSpeed();
		     horn();
		     System.out.println( " \n \t Turn Completed , and Increasing the Speed");
		     increaseSpeed();
		  }
	 public void stop()
		 {
		    while(speed!=10)
			     { 
				     decreaseSpeed();
				 }
		    System.out.println("\n \t Now the Lorry is stopped ");
			openDoor();
			closeDoor();
		 }
		 
		Scanner in = new Scanner(System.in);
		public void excecute()
		{
		int n =1;
     	while(n!=5)
		{
		   
			System.out.println("\n  *!*!*!*! provide me an instuction to drive the car.");
			System.out.println("\n \n \t \t Press 1 : To Start \n\t\tPress 2 : To increase the speed \n\t\t Press 3 : To return \n\t\tPress 4 : To Stop");
			
            int ch = in.nextInt();
			switch(ch)
			{
			case 1:
				start();
				break;
			case 2:
			    increaseSpeed();
				break;
			case 3:
				turn();
				break;
			case 4:
				stop();
				break;
			}
		n=ch;
		
		}
     }
	}
	