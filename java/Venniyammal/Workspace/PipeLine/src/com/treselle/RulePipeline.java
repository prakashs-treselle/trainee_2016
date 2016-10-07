package com.treselle;
/*class for calculating */				 
import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.logging.Logger;

public class RulePipeline{
	
		  ArrayList<String> str1= new ArrayList<String>();
		  ArrayList<String> urlEqual= new ArrayList<String>();
		  LinkedHashMap<String, Integer> Sizepair = null;
		  HashMap<String, LinkedHashMap<String, Integer>> finalMap = null;

	public TreeMap<String, String> readAndSplit(){
		TreeMap<String, String> UrlPair = null; 
		Map<String, String> UrlMap = null;
		Logger logger=Logger.getLogger( "readAndSplit" );	
		String Contents="";
		String str="";
		String url="";
		String val="";
		try{
			UrlMap=new TreeMap<String, String>();
			UrlPair=new TreeMap<String, String>();
			BufferedReader br = new BufferedReader (new FileReader("D:\\rulepipe.txt")); // opening the file to operate
			
			
		// reading input file
		while ((Contents = br.readLine()) != null){
            str1.add(Contents);
		}
		String  s= null;
		String[] sn=null;
		for(int i=0; i<str1.size();i++){
			s = str1.get(i);
			if(s.contains("=")){
			sn=	s.split("=");
			url=sn[0];
			val=sn[1];
			UrlMap.put(url,val);
			if(UrlMap.containsKey(url)){
				UrlPair.put(url,UrlPair.get(url) == null ? val : ((UrlPair.get(url)).toString()).concat(","+val));	
			}
			else{
				continue;
				}
			}
			else{
				urlEqual.add(s); 
			}
		  }
		}
		catch (Exception e){
	   logger.info("Exception in read and Split"+e);
	  }
	  return UrlPair;
	 }

//function to calculate 	 
	public HashMap<String, LinkedHashMap<String, Integer>> splitRule(TreeMap<String, String> UrlPair){
	
		String url="";
		String ruleSizeVal="";
		String ruleKey="";
		String ruleSeconds="";
		String [] rules=null;
		String [] ruleVal=null;
		Logger logger=Logger.getLogger( "readAndSplit" );	
			try{	
					finalMap=new HashMap<String, LinkedHashMap<String, Integer>> ();
					Iterator it = UrlPair.entrySet().iterator();
					//iterating Map
					while (it.hasNext()){
						Map.Entry pair = (Map.Entry)it.next();
						url = (String)pair.getKey();
						ruleSizeVal = (String)pair.getValue();
						if(ruleSizeVal.contains(","))
						{
							rules = ruleSizeVal.split(",");   //Spliting the Rules 
							Sizepair = new LinkedHashMap<String,Integer>();
							for(String s :rules )
							{
								ruleVal = s.split(":");// Spliting rule and its seconds
								ruleKey = ruleVal[0];
								ruleSeconds = ruleVal[1];
								int val = Integer.parseInt(ruleSeconds);
								//calculating the Seconds
								if (Sizepair.containsKey(ruleKey)){
									int  getdata = Sizepair.get(ruleKey);
									val = val + getdata;
									Sizepair.put(ruleKey,val );
									finalMap.put(url,Sizepair);
								}
								else{
									Sizepair.put(ruleKey,val );
									finalMap.put(url,Sizepair);
								}
							}
						}
						else
						{
							continue;
						}
					}
					}catch (Exception e){
						logger.info("Exception in splitRule Function"+e);
					}
					return finalMap;
	 }
	 
//Writting Map data in HTML File
	public void writeHtml(HashMap<String, LinkedHashMap<String, Integer>> urlSizepair){
		Logger logger=Logger.getLogger( "writeHtml" );	
		FileWriter fWriter = null;
		BufferedWriter writer = null;
		int seconds;
		float sizeseconds;
		int count =1;
		String urlEqualLess=urlEqual.get(1);
		int urlequalsize=urlEqual.size();
		try{
			//opening html file to write the content
			fWriter = new FileWriter("E:/workspace/PipeLine/Rule.html");
			writer = new BufferedWriter(fWriter);
			//writing on HtmlFile
			writer.write("<html>\n<h1 align= 'center'>"); 
			writer.write(" Rule PipeLine</h1>\n<title> Treselle</title>\n<body>"); 
			writer.write("\n<div>\n\t<table border=2 align= 'center'>"+"\n\t<tr bgcolor='#6699FF'><th>S.No</th><th>Library</th>");
			writer.write("\n\t<th>DOC Count</th><th>Rules and it Seconds</th></tr>\n"); 
			writer.write("<tr bgcolor='Aqua'><td>"+(count++)+"</td>");
			writer.write("<td>"+urlEqualLess+"</td>");
			writer.write("<td>"+urlequalsize+"</td><td> </td></tr>");
			//iterating the finalMap
			for(String url : urlSizepair.keySet()){
					HashMap<String, Integer> valueMap = urlSizepair.get(url);
					writer.write("<tr  bgcolor='Aqua'><td>"+(count++)+"</td>");
					writer.write("<td>"+url+"</td>");
					
					writer.write("<td>");
					for(String rulekey :valueMap.keySet()){
						if(rulekey.equals("size")){
								seconds = valueMap.get(rulekey);
								writer.write( seconds+"\n"+"</td>");
								writer.write("<td>");	
							}
						else{
						seconds = valueMap.get(rulekey);
						if(seconds>1000){
							sizeseconds=seconds/1000;
							writer.write(rulekey+"  "+sizeseconds+"  seconds\n<br>");
						}
						else{
							writer.write(rulekey+"  "+seconds+"  Milliseconds\n<br>");
						}
						}
					}
				writer.write("</td>");
				continue;
			}
			writer.write("\n\t</table>\n\t</div>\n\t</body>\n\t</html>");
			}
			catch (Exception e){
					logger.info("Exception in WriteHTML" +e);
			}
			finally{
				try{
					writer.close();
				}
				catch(Exception e){
					 logger.info("Exception in WriteHTML");
				}
			}
		}
//Fucntion to call the function				
public void callAllFunction(){
		Logger logger=Logger.getLogger( "callAllFunction" );	
	   TreeMap<String, String> UrlPair=null;
	   HashMap<String, LinkedHashMap<String, Integer>> urlSizepair = null;
	   try{
	   UrlPair = readAndSplit();  
	   urlSizepair = splitRule(UrlPair);
	   writeHtml(urlSizepair);
	   }
	   catch(Exception e){
		   logger.info("Exception in callAllFunction");
	   }
	}
}