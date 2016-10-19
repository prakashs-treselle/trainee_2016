//Get property values and send the pojo class 
package com.treselle.property;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.treselle.pojo.PojoEmail;

public class StoredProperty
{
		public PojoEmail storedProperty()
		{
			Properties prop = new Properties();
			PojoEmail pojo=new PojoEmail();
			
			 
			try
			{
				//to get the input from the property file
				InputStream input = new FileInputStream("D:/Workspace1/BeanTest/property/src/Query.properties");
				prop.load(input);
				
				 String url = prop.getProperty("url");
				 String driverName = prop.getProperty("driverName");
				 String username = prop.getProperty("username");
				 String password = prop.getProperty("password");
				 String insertrec = prop.getProperty("insertrec");
				 String selectFull = prop.getProperty("selectFull");
				 String copy= prop.getProperty("copy");
				 String delete= prop.getProperty("delete");
				 String emailid = prop.getProperty("emailid");
				 String emailPassword = prop.getProperty("emailPassword");
				 String host = prop.getProperty("host");
				 String port = prop.getProperty("port");
				 String m_subject = prop.getProperty("m_subject");
				
				pojo.setUrl(url);
				pojo.setDriverName(driverName);
				pojo.setUserName(username);
				pojo.setPassword(password);
				pojo.setInsertrec(insertrec);
				pojo.setSelectFull(selectFull);
				pojo.setCopy(copy);
				pojo.setDelete(delete);
				pojo.setEmailId(emailid);
				pojo.setEmailPassword(emailPassword);
				pojo.setHost(host);
				pojo.setSubject(m_subject);
				pojo.setPort(port);
				
				
				
			}
			catch(IOException se)
			{
				System.out.println("Exception"+se);
			}
			return pojo;
		}	
}