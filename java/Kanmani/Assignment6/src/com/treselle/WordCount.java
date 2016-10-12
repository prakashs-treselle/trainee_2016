//Class to Count the words in a file
package output.com.treselle;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Map.Entry;
 
public class WordCount 
{
     //Method to Count the words in a file
    public Map<String, Integer> WordCounting(String file)
	{
 
        FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader br = null;
        Map<String, Integer> wordMap = new HashMap<String, Integer>(); //To get a string and number of times
        try 
		{
            fis = new FileInputStream(file);		//calling the file
            dis = new DataInputStream(fis);
            br = new BufferedReader(new InputStreamReader(dis));
            String line = null;
            while((line = br.readLine()) != null)
			{
				//using StringTokenizer to split the separate words in the line 
                StringTokenizer st = new StringTokenizer(line, " ");
                while(st.hasMoreTokens())
				{
                    String str = st.nextToken().toLowerCase();
                    if(wordMap.containsKey(str))
					{
                        wordMap.put(str, wordMap.get(str)+1);
                    } else 
					{
                        wordMap.put(str, 1);
                    }
                }
            }
        }
		}
		catch (FileNotFoundException e) 
		{
            e.printStackTrace();
        } 
		catch (IOException e)
		{
            e.printStackTrace();
        } finally{
            try{if(br != null) br.close();}catch(Exception ex){}
        }
        //return wordMap;
    }

     
    public List<Entry<String, Integer>> sortByTimes(Map<String, Integer> wordMap)
	{
         
        Set<Entry<String, Integer>> set = wordMap.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		//find the words and sorting it that maximum number of times the words were appear
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        return list;
    }
}
     
    
        
    
