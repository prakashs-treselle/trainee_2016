package opt.com.treselle;

/*
  Class to read the trail file from D: drive 
  and to find the character and word count
*/

import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class CharAndWordCount 
{
   
       /* FileInputStream file = null;
        DataInputStream dis = null;
        BufferedReader br = null;
		*/
	InputStream inStream = null;
	
    public void charectorCount ()
	  {
		
        try
        {
        inStream = new FileInputStream("D:\\trial.txt");
       /* file = new FileInputStream("D:\\trial.txt");
        dis = new DataInputStream(file);
        br = new BufferedReader(dis);*/
		
		          
        String Contents="";
        String str="";

        while ((Contents = br.readLine()) != null)
		{
            str=Contents;
        }
        char[] char_array = str.toCharArray();

        System.out.println("The Given String is : " + str);

        Map<Character, Integer> charcount = new TreeMap<Character, Integer>();

        for (char i : char_array)
		{
        charcount.put(i,charcount.get(i) == null ? 1 : charcount.get(i) + 1);
		}

      for (Character key : charcount.keySet()) 
	   {
         System.out.println("occurrence of '" + key + "' is  "+ charcount.get(key));
        }
    }
	catch (Exception e)
	{
	 System.out.println(e);
	}
  }
  
  //method to find count word
  public void wordCount()
  {
     try{
	   // opening the file to operate
	    file = new FileInputStream("D:\\trial.txt");
        dis = new DataInputStream(file);
        br = new BufferedReader(dis);
		
        String Contents="";
        String str="";
		
		// reading input file
		while ((Contents = br.readLine()) != null)
		  {
            str=Contents;
          }
		String[] string_array = str.split("\\s");
		System.out.println("The Given String is : " + str);

        Map<String, Integer> strcount = new TreeMap<String, Integer>();

        for (String i : string_array)
		 {
        strcount.put(i,strcount.get(i) == null ? 1 : strcount.get(i) + 1);
		 }

        for (String key : strcount.keySet()) 
	     {
         System.out.println("occurrence of '" + key + "' is  "+ strcount.get(key));
         }
      }
	  catch (Exception e)
	  {
	    System.out.println(e);
	  }
     
  }
    
}