package opt.com.treselle;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CountingWc
   {
    public void Countchr()
      {
  	     try
		 {
		   TreeMap<Character, Integer> hashMap = new TreeMap<Character, Integer>();
           File file = new File("D:/best_practice_java.txt");
           Scanner in= new Scanner(file);
		        while (in.hasNext()) 
			{
            char[] chars = in.nextLine().toUpperCase().toCharArray();
            for (Character c : chars) 
			
			
	{
                if(!Character.isLetter(c))
				{
                    continue;
                }
                else if (hashMap.containsKey(c))
				{
                    hashMap.put(c, hashMap.get(c) + 1);
                } else {
                    hashMap.put(c, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet())
		{
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
		}
		catch(Exception e)
		 {
		 e.printStackTrace();
		 }
		
             }
	public void CountWord()
 	{
		try
		{
			String value="";
			int wcount = 0;
			FileInputStream file = new  FileInputStream("D:/best_practice_java.txt");
			DataInputStream din = new DataInputStream(file);
			BufferedReader br=new BufferedReader(new InputStreamReader(din));
			String str="";  
			int i=0;
			while(( str=br.readLine())!=null){  
			value=str;
			}  
			file.close();  
			value = value.toLowerCase(); 
			String[] tokens = value.split( " " );
			ArrayList< String > al = new ArrayList< String >();   //creating arraylist from the string
			al.addAll( Arrays.asList( tokens ) );
			for(  i = 0; i < al.size(); i++ )
			{
				System.out.printf( "%s: ", al.get( i ) );
				for( int j = 0; j < al.size(); j++ )
				{
					if( al.get( i ).equals( al.get( j ) ) )
					wcount++;
					if( al.get( i ).equals( al.get( j ) ) && wcount > 1 )
					al.remove( j );                      
				}                                               
				System.out.printf( "%d\n", wcount );
				wcount = 0;
			}
	
		}
	
	catch(FileNotFoundException  e)
			{
			e.printStackTrace();
			}
	catch(IOException  e)
			{
			e.printStackTrace();
			}
	
	}		 
}