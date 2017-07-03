package SeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Allbrowser {
WebDriver driver;
@BeforeMethod
@Parameters("browser")
 public void browsers(String browser){
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
			}
@Test
public void aface()
{
	driver.get("https://www.facebook.com");
}

@AfterMethod
public void close()
{
	driver.quit();
}
	   
}