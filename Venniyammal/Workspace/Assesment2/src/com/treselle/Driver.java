package opt.com.treselle;

import java.util.Scanner;

class Driver

 {
  public static void main(String [] args)
    {
        

		int ch ;		 
		// bike Execute method to call Bike class methods 
         Scanner in = new Scanner(System.in);
	    
        // Switch case to Choose the Vehicle
	    System.out.println(" \n \t *~*~*~*~* Choice the Vehicle *~*~*~*~*\n \t\t Press 1 :Bike \n \t \t Press 2 : Car \n\t\t Press 3 : Jeep \n\t\t Press 4 : Lorry " ); 
		  ch = in.nextInt(); 
     		switch(ch)
  			    {
    			case 1:
					Car c= new Car();
					c.excecute();
					break;
	  
				case 2:
	  
					Jeep j= new Jeep();
					j.excecute();
					break;
				case 3:
	 
					lorry l= new lorry();
					l.excecute();
					break;
				case 4:
	  
					Bike b = new Bike();
					b.excecute();
					break;
				default:
   					System.out.println("Provide me the correct Instruction");
			    }
			}
	
		
         }


       				   