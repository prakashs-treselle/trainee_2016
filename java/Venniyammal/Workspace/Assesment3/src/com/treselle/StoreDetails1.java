package opt.com.treselle;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

class StoreDetails
{

    Scanner in = new Scanner(System.in);
	
	int n=0;
	
	Student s = new Student();
    ArrayList <Student> al = new ArrayList<Student> (); 
    public void setStudent(){   
	// writing Details in a csv File
  FileWriter fw=null;
    try{
	
	 System.out.println("Enter the number of records:");
	 Student s = new Student();
	 n = in.nextInt();
	 fw = new FileWriter("StudentRecord");
     System.out.println("Success");
	// getting N number of student Details
	
	
	         String COMMA_DELIMITER = ",";
             String NEW_LINE_SEPARATOR = "\n";
		     String FILE_HEADER = "id,firstName,lastName,gender,age";
            
           
	for(int i=1; i<=n;i++)
	{
	    System.out.println("Enter the student record no:" +i );
		s.setName();
		s.setId();
		s.setAddress();
		s.setMark1();
		s.setMark2();
		s.setMark3();
		s.setMark4();
		s.setMark5();
		al.add(s);
				
    
	    
			
	    
		//Write the CSV file header
            fw.append(FILE_HEADER.toString());
        //Add a new line separator after the header
            fw.append(NEW_LINE_SEPARATOR);
	     
		 for(Student s1: al)
		  {
		     fw.append(s1.getName());
			 fw.append(COMMA_DELIMITER);
			 System.out.println("success");
			 
		     fw.append(String.valueOf(s1.getId()));
			 fw.append(COMMA_DELIMITER);
			 System.out.println("success");
			 
			 fw.append(s1.getAddress());
			 fw.append(COMMA_DELIMITER);
			 System.out.println("success");
			 
			 fw.append(String.valueOf(s1.getMark1()));
			 fw.append(COMMA_DELIMITER);
			 System.out.println("success");
			 
			 fw.append(String.valueOf(s1.getMark2()));
			 fw.append(COMMA_DELIMITER);
			 System.out.println("success");
			 
			 fw.append(String.valueOf(s1.getMark3()));
			 fw.append(COMMA_DELIMITER);
			 System.out.println("success");
			 
			 fw.append(String.valueOf(s1.getMark4()));
			 fw.append(COMMA_DELIMITER);
			 System.out.println("success");
			 
			 fw.append(String.valueOf(s1.getMark5()));
			 fw.append(COMMA_DELIMITER);
			 fw.append(NEW_LINE_SEPARATOR);
			 System.out.println("success");
			} 
	}
}
    catch (Exception e) {

            System.out.println("Error in CsvFileWriter !!!");

            e.printStackTrace();

        } finally {
             
            try {

                fw.flush();

                fw.close();

            } catch (IOException e) {

                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
       }	
	  }
	  }