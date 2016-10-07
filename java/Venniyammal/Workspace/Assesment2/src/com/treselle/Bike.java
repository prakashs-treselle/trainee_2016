package opt.com.treselle;
//venni

import java.util.Scanner;

class Bike extends sound implements vehicle ,twowheeler
    {
     static int speed= 10;
	 int maxSpeed = 80;
	 int limit=64;
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
		  if(speed==80)
		    {
			 System.out.println(" Alert !!! Alert!!! Your Exceeding the speed limit");
			}
		   else if ( speed>=64)
			{
			 System.out.println("\n\t Your running at the 80% of the speed");
			 }
		    
	    }
	void decreaseSpeed()
	    {
	         speed = speed-20;
		     System.out.println("\n\t Now the Bike is running at the Speed of " + speed +"  Km/h." );
		}
		
		
	 
	 // implementation of Interface methods 
	 
	
		
	 public void start()
	     {
		     releaseStand();
			 
		     System.out.println("\n \t Now the bike Started at the Initial Speed of 10 km/h");
		 }
	 public void turn()
	     { 
		    
		   decreaseSpeed();
		   System.out.println( " \n \t Turn Completed , and Increasing the Speed");
		   increaseSpeed();
		  }
	 public void stop()
		 {
		    speed =10;
		    System.out.println("\n \t\t now the speed decreased to 10 Km/h.");
			releaseStand();
			putStand();
		    System.out.println("\n \t Now the bike is stopped ");
			 }
	public void releaseStand()
			{
			System.out.println("\n \t Release the side Stand ");
			}
	public void putStand()
			{
			System.out.println("\n \t Lock the side Stand ");
			}
	void horn()
        {
         System.out.println("\n \t Beeeeeeeep");
        }
		
		 Scanner in = new Scanner(System.in);
		public void excecute()
		{
		int n =1;
     	while(n!=5)
		{
		   
			System.out.println("\n  *!*!*!*! provide me an instuction to drive the Bike. !*!*!*!*!*");
			System.out.println("\n \n \t \tPress 1 : To Start \n\t\tPress 2 : To increase the speed \n\t\tPress 3 : To return \n\t\tPress 4 : To Stop \n\t\tPress 5 : To Halt");
			
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
	