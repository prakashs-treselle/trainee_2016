package com.treselle;
/*

*/

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Arrays;
import java.util.List;

class FilterByName extends CrudOperationTechDetail implements Details
{
   
    CrudOperationTechDetail cd  = null;
	List<String> itemList = null;

// implementing the interface method for setting the csv file values to ArrayList	
 public void setDetails() 
   {
  BufferedReader br = null;

	try {
			boolean  isContain= false;
			String str ;

			br = new BufferedReader(new FileReader("D:\\filter.txt"));
			
			
			while ((str = br.readLine()) != null) 
			{
			 String[] items = str.split(",");
			 itemList = new ArrayList<String>();
           for (String item : items) 
		    {
              itemList.add(item);
            }
		}
	}
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				if (br != null)br.close();
			} 
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	  
	}
  public void getDetails()
     {  
	 
	 String uname=null;
	    cd = new CrudOperationTechDetail();
	    try
		  {
           for(int i = 0; i<itemList.size();i++	)
           {
		     uname = itemList.get(i);
			 System.out.println(uname);
			 cd.retriveByName(uname);
			}
		} 
		catch(Exception e)
		 {
		  System.out.println(e);
		 }
      }
}