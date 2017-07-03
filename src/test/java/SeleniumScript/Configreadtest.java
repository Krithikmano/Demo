package SeleniumScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Configreadtest {

   
	  public static void main(String[] args) throws IOException {
		  Properties p = new Properties();  		
		  				File f = new File("E:\\Eclicpse\\workspace\\Selenium\\src\\test\\java\\config.properties\\config.properties");
				FileInputStream fi = new FileInputStream(f);
				p.load(fi);		
				 	    
		System.out.println(p.getProperty("Drivername"));
		System.out.println(p.getProperty("Driverexe"));
		System.out.println(p.getProperty("URL"));
		System.out.println(p.getProperty("Password"));
	  }	
}
