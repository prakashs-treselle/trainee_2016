package com.treselle;

import java.util.Scanner;
/*
Main class to call the methods of crud operation and filter by name
*/
import java.util.Scanner;

class InterviewPreprocess
{
  public static void main(String [] args)
     {
        CrudOperationTechDetail cd = new CrudOperationTechDetail();
		FilterByName fn = new FilterByName();
	    int n=0;
		Scanner in = new Scanner(System.in);
    //getting user choice to register the candidate detail and show	
	do{ 
	    System.out.println("Enter 1. To Register the candidate detail \n 2 .To get details of the names present in csv \n 3.Exit");
		
		n =in. nextInt();
		switch(n)
		 {
		    case 1:
			   
		      cd.createTable();
              cd.setDetails();
			  cd.getDetails();
			  break;
			  
			case 2:
             
		      fn.setDetails();
              fn.getDetails();
			  break;
		 }
	  }while(n!=3);	
	 
   }
}