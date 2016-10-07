package opt.com.treselle;
import java.util.Scanner;
import java.util.Collections;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.InputMismatchException;

class Mapping
{
	Scanner in = new Scanner(System.in);
	HashMap<Integer, String> map = new HashMap<Integer, String> ();
	// standard key value library
	public void putKey()
	{
		map.put(1, " One");
		map.put(2, " Two");
		map.put(3, " Three");
		map.put(4, " Four");
		map.put(5, " Five");
		map.put(6, " Six");
		map.put(7, " Seven");
		map.put(8, " Eight");
		map.put(9, " Nine");
		map.put(0, " Zero");
		
	
	}
	public void checking()
	{	
		
		
		String str= new String() ;
		
		
		System.out.println("\n\n\t\t***Enter the Integer value ***\n");
	    String keys = in.next();
		char[] key1 = keys.toCharArray();
		System.out.println("\n\n\n\t you have entered the value "+ keys);
		String s =null;
		for (char i : key1)
		{
			//boolean check=Character.isDigit(i);
			if((Character.isDigit(i))==true)
			{
				str=str+i;	
			}
			else
			{
				continue;
			}
			
		}
		System.out.println();
		for (char i : key1)
		{
			
			if((Character.isDigit(i))==false)
			{
				s = "invalid input";
			}
			
		}
		System.out.println(s);
		
		 getkey(str);
		
	}		

	
	 
	public void getkey(String key)
	{
		System.out.println(" \n\n\tThe input value has this integers "+key);
		String str = key.toString();
		char[] key1 = str.toCharArray();
		String al1 = new String();
		for (char i : key1)
		{
		
				int n = Character.getNumericValue(i);
				String value = map.get(n);
				
				al1=al1+value;
		}
			System.out.println("\n The String Equivalent of "+ key + " this integer value  "+al1);
		}
		
		
		
	   
}