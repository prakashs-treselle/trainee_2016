package output.com.treselle;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Set;
class RulePipe{
		String fileName = "D:/Rulepipeline/rulepipeline.txt";
		String contents ="";
		String line=" ";
		String key1 =" ";
		String value1= " ";
		String get_value = " ";
		String get_key = " ";
		String finalkey =" ";
		String finalvalue=" ";
		String get_urlvalue ="";
	
		String [] datas = null;
		String [] data=null;
		String [] splittext = null;
		String [] getcontent=null;
		String [] getdata=null;
		//ArrayList Declaration
		ArrayList<String> al2 = new ArrayList<String>();
		ArrayList<String> al3 =null;
		public static HashMap<String, String> urlsplit = null;
		public static HashMap<String,HashMap<String, Integer>> outermap = null;
		public static HashMap<String, Integer>colonsplit = null;	
		private final static Logger LOGGER = Logger.getLogger(RulePipe.class.getName()); 
	public HashMap<String, String>  splitUrl() {
		
		try{
				urlsplit = new HashMap<String,String>(); 
				// FileReader reads text files
				FileReader in = new FileReader(fileName);
				// Always wrap FileReader in BufferedReader.
				BufferedReader br=  new BufferedReader(in);
				//arraylist Declaration 
				ArrayList<String> al = new ArrayList<String>();
				while((contents = br.readLine()) != null) {
					al.add(contents);
				}	
				for(int i = 0;i < al.size();i++){
						
						String var = al. get(i);
						if(var.contains("=")){
							data = var.split("=");
							String key = data[0];
							String value = data[1];
					//if the map contains key it will values to the corrosponding key
							if (urlsplit.containsKey(key)){
								
								urlsplit.put(key,value +","+ urlsplit.get(key));
							}
							else{
								urlsplit.put(key,value);
							}
						}
						else{
							al2.add(var);
						}
				
					br.close();
				}
			LOGGER.info("The values added successfully to the map\n");
        }
		catch(FileNotFoundException ex) {
			//set the LogLevel to  warning
			LOGGER.warning("unable to open file");
		}
		catch(IOException ex){
			//set the LogLevel to  severe 
			LOGGER.log(Level.SEVERE,"Error reading file",ex);
		}
		return urlsplit;
	}

	public  HashMap	splitValues(HashMap urlsplit){
		try{		
					outermap =  new HashMap<String,HashMap<String, Integer>>();
					Iterator it = urlsplit.entrySet().iterator();
					while (it.hasNext()){
						Map.Entry pair = (Map.Entry)it.next();
						get_key = (String)pair.getKey();
						get_value = (String)pair.getValue();
					
						if(get_value.contains(","))
						{	//split by commas
							datas = get_value.split(",");
							colonsplit = new HashMap<String,Integer>();
							for(String s :datas )
							{
								//split the values by colon 
								splittext = s.split(":");
								key1 = splittext[0];
								value1 = splittext[1];
								int text = Integer.parseInt(value1);
								if (colonsplit.containsKey(key1)){
									int  getdata = colonsplit.get(key1);
									//System.out.prinln(getdata);
									text = text + getdata;
									//add the values to the inner map
									colonsplit.put(key1,text );
									//add the values to the outer map
									outermap.put(get_key,colonsplit);			
								}
								else{
									colonsplit.put(key1,text );
									outermap.put(get_key,colonsplit);
								}
							}						
						}
						else{
							continue;
						}
					}	
			LOGGER.info("The values added successfully to the outermap\n");
		}
		catch(Exception ex){
			LOGGER.log(Level.SEVERE,"error"+ex);
		}
		return outermap;
	}

	public void printmap(HashMap outermap ){
		FileWriter fw = null;
		BufferedWriter writer =null;
		try{	
		
			fw  = new FileWriter("D:/RulePipeline/lib.html");
			// Always wrap FileWriter in BufferedReader.
			writer =  new BufferedWriter(fw);
			//Write html file
			writer.write("<html><head><title>LIBRARY URL AND RULE</title></head>");
			writer.write("<body><table border = 1 bgcolor='lightblue' align='center'>");
			writer.write("<tr><th>S.No</th><th>LIBRARY URI</th><th>DOC COUNT</th><th>RULES&CONSUMED TIME</th></tr>");
			Iterator it = outermap.entrySet().iterator();
			int sno=1;
			while (it.hasNext()){
					Map.Entry pair = (Map.Entry)it.next();
					String get_urlkey = (pair.getKey()).toString();
					get_urlvalue = (pair.getValue()).toString();
					writer.write("<tr><td>"+ (sno++)  +"</td><td>"+get_urlkey+"</td>");
					String [] getdata = get_urlvalue.split(",");
					String printdata  = getdata[getdata.length-1];
					printdata = printdata.replaceAll("size=", " ");
					printdata =  printdata.replaceAll("}", " ");
					writer.write("<td>"	+printdata+	"</td>");
					String[] rule=get_urlvalue.split(",");
					String time=null;
					al3= new ArrayList<String>();
					for(String st:rule){		
										
						if(!st.contains("size")){
							getcontent = st.split("=");
							String getcontentkey = getcontent[0];
							String getcontentval = getcontent[1];
							int getintval = Integer.parseInt(getcontentval);
							time=getcontentkey+" "+getintval+" ms";
							//writer.write("<td>"+a+" "+d+"ms"+"</td>");
								if(getintval>1000){
									getintval = getintval/1000;
									time=getcontentkey+" "+getintval+"seconds";
								}
							al3.add(time);						
						}
					}
					writer.write("<td>");
					for(String str:al3){
						str=str.replace("{","");
						writer.write(str+"<br>");
					}
				writer.write("</td>");
				writer.write("</tr>");
			}
			//Set Declaration 
			Set<String> uniqueSet = new HashSet<String>(al2);
			//Iterate the elements
			for (String temp : uniqueSet) {
				writer.write("<tr><td>"+(sno++)+"</td><td>"+temp+"</td><td>"+Collections.frequency(al2, temp)+"</td><td>Processing Time</td></tr>");
			}
			writer.write("</table>");
			writer.write("</body>");
			writer.write("/html>");
			LOGGER.info("The values are written to the html format\n");
		}
	catch(Exception e){
			System.out.println(e);
		}
		finally{
			 try{//close the writer object 
				writer.close();
			 }
			 catch(IOException e){
				LOGGER.log(Level.SEVERE,"Error writing html file",e);
			 }
		}
	}
}

	
	
  

	
	
	


