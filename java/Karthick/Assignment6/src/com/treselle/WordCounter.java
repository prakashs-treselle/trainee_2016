package opt.com.treselle;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
public class WordCounter
{
public static void main(String args[]) throws IOException
{
	FileInputStream fin=new FileInputStream("D:/best_practice_java.txt");
	Scanner fileInput=new Scanner(fin);
	
	ArrayList<String> words=new ArrayList<String>();
	ArrayList<Integer> count=new ArrayList<Integer>();
	
	while(fileInput.hasNext())
	{
		String nextWord=fileInput.next();
		
		if(words.contains(nextWord))
		{
			int index=words.indexOf(nextWord);
			count.set(index,count.get(index)+1);
			 
		}
		else
		{
			words.add(nextWord);
			count.add(1);
			
			
		}
	}
	fileInput.close();
	fin.close();
	
	for(int i=0;i<words.size(); i++)
	{
		System.out.println(words.get(i)+ "occured"+"  "+count.get(i)+""+"times");
	}
	
	
}
}