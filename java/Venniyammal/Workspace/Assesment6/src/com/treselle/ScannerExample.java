
public class ScannerExample {

    public static void main(String args[]) throws FileNotFoundException {
  
        //creating File instance to reference text file in Java
        File text = new File("C:/temp/test.txt");
      
        //Creating Scanner instnace to read File in Java
        Scanner scnr = new Scanner(text);
      
        //Reading each line of file using Scanner class
        int lineNumber = 1;
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }       
    
    }   
  
}


Read more: http://www.java67.com/2012/11/how-to-read-file-in-java-using-scanner-example.html#ixzz4ILMJUcVn