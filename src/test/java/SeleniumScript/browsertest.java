package SeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utility.crossbrowser;

public class browsertest {
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void browsers(String browser){
	crossbrowser cb = new crossbrowser();
	driver = cb.browsers(browser);
	}
	@Test
	public void aface()
	{
		driver.get("https://www.facebook.com");
	}

	@AfterClass
	public void close()
	{
		driver.quit();
	}
	
	@Test
	public void gmail()
	{
		driver.get("https://www.gmail.com");
	}
	
		   
	}
