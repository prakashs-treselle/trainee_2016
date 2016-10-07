  package opt.com.treselle;
 
 import java.sql.Connection; 
 import java.sql.Statement;

class Execution
   {
    public static void main(String [] args)
	  { 
	   
	
      	  
	  StoreDetails sd = new StoreDetails();
	  CreateTable ct = new CreateTable();
	  Statement stmt = con1.createStatement();
	 
	  ct.createTable(stmt);
	  
	  sd.setStudentDetails();
	  sd.addStudentDetails(con1);
	  }
   }