package output.com.treselle;
import java.util.Map;
import java.util.List;
import java.util.Map.Entry;
class WordAndLetterCountInAFile
{
	public static void main(String args[]) throws Exception
	{
		LetterCount letter=new LetterCount();			
		System.out.println("\n\t\tCounting Letters in the File\n");
		letter.letterCount();
		
		WordCount word = new WordCount();
		System.out.println("\n\n\t\tCounting Words in the File\n");
        Map<String, Integer> wordMap = word.WordCounting("E:\\Workspace\\Assignment6\\src\\com\\treselle\\simple.txt");
        List<Entry<String, Integer>> list = word.sortByTimes(wordMap);
        for(Map.Entry<String, Integer> me:list){
            System.out.println("\t"+me.getKey()+" = \t"+me.getValue());
			}
	}
}
