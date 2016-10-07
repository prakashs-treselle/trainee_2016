package opt.com.treselle;

import java.util.Properties;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


class FileCopy
{
  public static void main(String [] args)
   {
   
    Properties p = new Properties();
	CopyDirectoryFile cd = new CopyDirectoryFile();
	
	String src = null;
    String dest = null; 
	
    try
	{
	FileReader os = new FileReader("d:\\documentDirc.properties");
	p.load(os);
	src= p.getProperty("source");
	dest = p.getProperty("destination");
	
	os.close();
	 
    }
    catch (IOException io) 
	{
  		io.printStackTrace();
    } 
	cd.copyFile(src,dest);
  }
}