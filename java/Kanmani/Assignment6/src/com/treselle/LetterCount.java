//Class to Count the Letters in a file
package output.com.treselle;
import java.util.TreeMap;
import java.io.File;
import java.util.Map;
import java.util.Scanner;

public class LetterCount {
	//Method to count the letters in a file
    public static void letterCount() throws Exception
	{
        TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();
        File file = new File("E:\\Workspace\\Assignment6\\src\\com\\treselle\\simple.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            char[] ch = scanner.nextLine().toLowerCase().toCharArray();
            for (Character c : ch) {
                if(!Character.isLetter(c)){
                    continue;
                }
                else if (hm.containsKey(c)) {
                    hm.put(c, hm.get(c) + 1);
                } else {
                    hm.put(c, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println("\t"+entry.getKey() + ": " + entry.getValue()+"\n");
        }
    }
}