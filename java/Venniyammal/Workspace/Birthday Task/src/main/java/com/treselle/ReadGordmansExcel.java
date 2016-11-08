package com.treselle;

import com.treselle.pojo.BirthDay;
import com.treselle.pojo.BirthDayList;
import com.treselle.mailutil.MailSender;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap ;
import java.util.Map;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class ReadGordmansExcel {

  /**
   * @param args
   * @throws IOException 
   * @throws BiffException 
   */
  public void readExcel() throws BiffException, IOException {
	ExpressionParser parser = new SpelExpressionParser();
	//Opening a file
    Workbook workbook = Workbook.getWorkbook(new File("E:/Scrapy Project/bithdayList.xls"));
	Sheet firstSheet = workbook.getSheet(0);
	ArrayList <String> list= null;
	ArrayList <BirthDay> birthdayList= new ArrayList <BirthDay> ();
	StandardEvaluationContext context = null;
	SimpleDateFormat dateFormat = null;
	Date todayDate= null;
	 
	MailSender mailSender = null;
	BirthDayList birthList = null;
	String Name,eMail,City,dob,currentdate,mailId,userName;
	
	
	try{
		dateFormat = new SimpleDateFormat("dd/MMM");
		todayDate = new Date();
		currentdate = dateFormat.format(todayDate);
		birthList= new BirthDayList();
		context = new StandardEvaluationContext(birthList);
		mailSender = new MailSender();
		///reading the Excel file
		for (int row = 0 ; row < firstSheet.getRows(); row ++ ) {
			list= new ArrayList<String>();
			for (int column = 0 ; column < firstSheet.getColumns(); column ++) {
			  list.add(firstSheet.getCell(column, row).getContents());
				}
			Name=list.get(0); 
			eMail=list.get(1); 
			City=list.get(2); 
			dob=list.get(3); 
		
			birthdayList.add(new BirthDay(Name,eMail,City,dob,currentdate));
			System.out.println(currentdate + " " + dob);
			}
			
			///setting value in Birth date List 
			birthList.setBirthDayList(birthdayList);
			List<BirthDay> subList = (List<BirthDay>) 
					  parser.parseExpression("BirthDayList.?[dob.substring(0,6)==currentdate]").getValue(context);
			for(BirthDay s: subList){
				 userName =s.getName();
				 mailId = s.getEmail();
				 System.out.println(mailId +"  "+userName+ " " +s.getDob());	 
				 mailSender.sendEMail(userName,mailId);
				}
	}
	catch(Exception e)	{
	System.out.println(e +" Error Message in java mail");
	}
    workbook.close(); //closing the workbook
  }

}
   