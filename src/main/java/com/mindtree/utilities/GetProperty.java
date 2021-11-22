package com.mindtree.utilities;

import java.io.FileInputStream;

import java.util.Properties;



public class GetProperty {
	public static Properties get;

	public GetProperty() throws Exception {
		if (get == null) {
			
				get = new Properties();
				FileInputStream fis = new FileInputStream(".//src//test//resources//config.properties");
				get.load(fis);
			} 
		 
			}
	public String getUrl() throws Exception
	   {
		   String url = get.getProperty("url");
		   if(url==null)
			   throw new Exception("url not found in property file"); 
		   
		   return url;
	   }
	public String getBrowserPath() throws Exception
	   {
		   String browserPath =  get.getProperty("browserpath");
		   if(browserPath==null)
			   throw new Exception("password not found in property file"); 
		   
		   return browserPath;
	   }
	   
	   public String getBrowser() throws Exception
	   {
		   String browser =  get.getProperty("browsername");
		   
		   if(browser==null)
			   throw new Exception("browser not found in property file"); 
		   
		   return browser;
	   } 
	   
	   
	   
	   public String getExcelSheetPath()
	   {
		   String excelsheetPath =  get.getProperty("excelsheetPath");
		   
		   return excelsheetPath;
	   }
	   
	   public String getEmail()
	   {
		   String email =  get.getProperty("email");
		   
		   return email;
	   }
	   
	   public String getName()
	   {
		   String name =  get.getProperty("name");
		   
		   return name;
	   }
	   
	   public String getMessage()
	   {
		   String message =  get.getProperty("message");
		   
		   return message;
	   }
	   
	   
	
		
	
}
