package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class crossbrowser {
	WebDriver driver;
	 public WebDriver browsers(String browser){
			if (browser.equalsIgnoreCase("firefox"))
		{		
			System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Gecko\\geckodriver-v0.16.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
			else if(browser.equalsIgnoreCase("chrome"))
			{		
				System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Chrome Webdriver\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			
			else if(browser.equalsIgnoreCase("ie"))
			{		
				System.setProperty("webdriver.ie.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\IE\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
			return driver;
			
				}
}
