package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	WebDriver driver;
	    
		public WebDriver firefox() {
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Gecko\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		return driver;
		}
	    
    public WebDriver chrome(){
    	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Chrome Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		
		}
	    
    public WebDriver ie() {
		System.setProperty("webdriver.ie.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\IE\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		return driver; 
		
		}
    
   
}