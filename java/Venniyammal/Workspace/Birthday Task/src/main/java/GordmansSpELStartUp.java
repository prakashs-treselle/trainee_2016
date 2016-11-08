 import com.treselle.ReadGordmansExcel;
 
 import java.io.IOException;
 import jxl.read.biff.BiffException;
 
 
 class GordmansSpELStartUp{
	 public static void main(String[] args)  throws BiffException, IOException  {
		ReadGordmansExcel readGordmansExcel = new ReadGordmansExcel();
		//calling the readExcel funcation
		readGordmansExcel.readExcel(); 
	 }
 }