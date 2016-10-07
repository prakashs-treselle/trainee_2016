package opt.com.treselle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class CopyDirectoryFile
 {
  public void copyFile( String src,String dest)
   {
      
      File f = null;
	  InputStream inStream = null;
      OutputStream outStream = null;
      String[] paths;
     /* String src = "d:/data/";
      String dest = "d:/target/";  */
      try{   


           	  
         // create new file
         f = new File(src);
                                 
         // array of files and directory
         paths = f.list();
            
         // for each name in the path array
         for(String path:paths)
         {
            // prints filename and directory name
           String src1 = src+path;
		   String dest1 = dest+path;
		   
    	    File file1 =new File(src1);
    	    File file2 =new File(dest1);
			 inStream = new FileInputStream(file1);
    	     outStream = new FileOutputStream(file2);
			  byte[] buffer = new byte[1024];
 
    	    int length;
    	    while ((length = inStream.read(buffer)) > 0){
    	    	outStream.write(buffer, 0, length);
    	    }
 
    	    if (inStream != null)inStream.close();
    	    if (outStream != null)outStream.close();
 
    	    System.out.println("File Copied..");
    	}
		}
		catch(IOException e){
    		e.printStackTrace();
    	}
      }
   }