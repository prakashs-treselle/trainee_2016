package opt.com.treselle;

import java.util.Scanner;

class Driver1

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
				    Bike b = new Bike();
					b.excecute();
					break;
					
	  
				case 2:
	                Car c= new Car();
					c.excecute();
					break;
					
				case 3:
					Jeep j= new Jeep();
					j.excecute();
					break;
					
				case 4:
					Lorry l= new Lorry();
					l.excecute();
					break;
					
				default:
   					System.out.println("Provide me the correct Instruction");
			    }
			}
	
		
         }


       				   