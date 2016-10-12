//main class for Sending mail
package com.treselle.view;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.treselle.DAO.InsertRecord;
import com.treselle.controll.SendMailNewUser;
import com.treselle.controll.Status;
import com.treselle.validate.Validating;
import org.apache.log4j.Logger;
import com.treselle.pojo.PojoEmail;
import com.treselle.property.StoredProperty;
//import java.util.logging.Logger;

//This Class is main 
public class StartUp{
	
	public static void main(String args[]) throws IOException{
		
		Logger  logger = Logger.getLogger("StartUp");
		
		logger.info("\t\t****Send Email ***");
		Scanner s=new Scanner(System.in);
		String in=null;
		Validating valid=new Validating();
		SendMailNewUser sendmail=new SendMailNewUser();
		StoredProperty sp=new StoredProperty();
		PojoEmail pojoemail=sp.storedProperty();
		
		do{
			
		try{
			//display the choice
			logger.info("\n\n\t1.Add User\n\t2.Send Mail\n\t3.Status\n\t4.Exit\n\t\nSelect Your choice:");
			 in=s.next();
			//check the input
			if(in.equals("1")){
				//add the new user and send sending mail
				try{
						logger.info("Enter the No.of users:");
						int no=s.nextInt();
						InsertRecord insertrecord=new InsertRecord();
						insertrecord.insertRecordDB(no);	
				}
				catch (InputMismatchException e) {

					logger.error("Input is Not Valid!");

				 }	
			}
			else if(in.equals("2")){
				//If click Two to send the mail from the new Users	
				try{
					//load the Property File
			/*Properties prop = new Properties();
			InputStream inp = new FileInputStream("D:/Workspace1/Assignment11/src/com/treselle/property/Query.properties");
				prop.load(inp);
				
				String selectFull = prop.getProperty("selectFull");
				String copy = prop.getProperty("copy");
				String delete = prop.getProperty("delete");*/
				String selectFull=pojoemail.getSelectFull();
				String copy =pojoemail.getCopy();
				String delete=pojoemail.getDelete();
			
			//This is main logic of the program
			//new data are stored temporary table and send the welcome mail after the delete
			
					if(valid.checkDBEmpty()==true){
						
						SendMailNewUser sendmailnew=new SendMailNewUser();
						sendmail.newUserMail(selectFull);
						sendmailnew.moveTable(copy);
						sendmailnew.deleteTable(delete);
						
					}
					else{
						logger.info("\n\n Sorry! no user Register...");
					}
				
				}
				catch(Exception ioe){
					logger.error("File read Error"+ioe);
				}
								
			}
			else if(in.equals("3")){
				Status status=new Status();
				status.checkStatus();
				
				
			}
			else if(in.equals("4")){
				//log out the user
				logger.info("Process Terminated!");
				System.exit(0);
			}
			
			else{
				logger.info("Please Enter the Valid input");
			}
			
			
		}
		catch(Exception e)
		{
		logger.error(e);	
		}/*
		finally
		{
			if(s!=null){
				try{
					s.close();
				}
				catch(Exception e){
					
				}
				
			}
			
			
		}*/
		s.nextLine();
		System.out.println("\n\n\tIf you want to Continue type y otherwise type any key!");
		//}while(in !=null);
		}while(s.nextLine().equals("y"));
		
		
	}
}