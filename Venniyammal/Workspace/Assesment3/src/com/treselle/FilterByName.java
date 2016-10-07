import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Arrays;
import java.util.List;

class FilterByName
{
public static void main(String [] args)
 {
  BufferedReader br = null;

		try {

			String str;

			br = new BufferedReader(new FileReader("D:\\filter.txt"));

			while ((str = br.readLine()) != null) 
			{
			 String[] items = str.split(",");
			 List<String> itemList = new ArrayList<String>();
           for (String item : items) 
		    {
              itemList.add(item);
            }
				System.out.println(item);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 }
}