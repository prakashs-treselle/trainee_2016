package opt.com.treselle;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
public class CountCharacterAndWord
   {
   public static void main(String []args)throws IOException
        {
         FileReader inputStream = null;
         try
           {
           inputStream=new FileReader("D://workspace2//file2.txt");
            int c;
            String word = " ";
            int count = 0;
                   Map<String, Integer>wordMap = new HashMap<String, Integer>();
                    Map<String, Integer>characterMap=new HashMap<String, Integer>();
                      while((c = inputStream.read()) != -1)
                             {
                             char ch = (char) c;
//System.out.println(ch);
                                 if(ch != ' ')
                                      {
                                         word=word + ch;
                                       }
                                        if(ch == ' ' && !word.isEmpty())
                                           {
	  //System.out.println("wordcomplete"word);
	  }
//code for Word Count
                                           if(wordMap.containsKey(word))
                                             {
                                              count = wordMap.get(word);
                                              count++;
                                              wordMap.put(word, count);
                                               }
                                          else 
                                            {
                                              wordMap.put(word, 1);
                                             }
//make empty for next word="";
                                           if(ch != ' ')
                                             {
//code for character count
                                              word=word+ch;
                                               String character = ""+ ch;
                                              character=character.toUpperCase();
											  
                                          if(characterMap.containsKey(character))
                                            {
                                            int charCount=characterMap.get(character);
                                            Count++;
                                            characterMap.put(character, Count);
											}
                                             else
                                              {
                                             characterMap.put(character , 1);
                                                  }
                                             }
//This logic condition added for last word
                                         if(wordMap.containsKey(word))
                                         {
                                         int count=wordMap.get(word);
                                          count++;
                                          wordMap.put(word, count);
                                            }
                                            else
                                          {
                                           wordMap.put(word, 1);
                                           }
										   
										  }
//system.out.println("print:"wordmap");
//System.out.println("printMap:"+Charmap);
//Display the actual output
                                    System.out.println("\n WordCount:");
                                    for(Map.Entry<String,Integer> entry : wordMap.entrySet())
                                        {
                                       System.out.println(entry.getKey() + " = " + entry.getValue());
                                       }
                                      System.out.println("\n character count based on the character:");
                                      for(Map.Entry<String,Integer> entry : characterMap.entrySet())
                                     {
										System.out.println(entry.getKey() + "=" + entry.getValue());
									}
					}
				}
					
				catch(Exception e)
					{
					e.printStackTrace();
					}
				finally
					{
					if(inputStream != null)
					{
					 inputStream.close();
					}
					}
        }
}





