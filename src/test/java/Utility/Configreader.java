package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class Configreader {
	WebDriver driver;
    Properties p;
  public Configreader() {
	    		try {
	    			p = new Properties();
			File f = new File("E:\\Eclicpse\\workspace\\Selenium\\src\\test\\java\\config.properties");
			FileInputStream fi = new FileInputStream(f);
			p.load(fi);		
			  	}
			catch (Exception e) {
			System.out.println("Exception is=="+e.getMessage());
			}
	    		finally{
	    				    		}
	       }
public String drivername(){
	    System.out.println(p.getProperty("Drivername"));
		return p.getProperty("Drivername");
}
 
public String driverpath(){
	System.out.println(p.getProperty("Driverexe"));
	return p.getProperty("Driverexe");
}
public String applicationurl(){
	System.out.println(p.getProperty("URL"));
	return p.getProperty("URL");
}
 
 public String Username(){
	
		 return p.getProperty("Username");
}

public String Password(){

	return p.getProperty("Password");
	
}
/*@Test
public WebDriver browser(){
	driver=new FirefoxDriver();
	driver=new ChromeDriver();
	driver=new InternetExplorerDriver();
	return driver;
	}*/
}
