package	output.com.treselle;

import	output.com.treselle.RulePipe;
import java.util.HashMap;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;

class RulePipeLine{
	private final static Logger LOGGER = Logger.getLogger(RulePipe.class.getName()); 
	public static void main(String args[])throws Exception{
			try{
			//Object creation
			RulePipe rulepipe = new RulePipe();
			
			HashMap urlsplit = rulepipe.splitUrl(); 
			HashMap outermap=rulepipe.splitValues(urlsplit);
			rulepipe.printmap(outermap);
			}
			catch(Exception e)
			{
				LOGGER.log(Level.WARNING,"Error"+e);
			}
		}
}