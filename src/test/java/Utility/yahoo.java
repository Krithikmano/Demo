package Utility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestNGListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class yahoo {
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	
	public void browsers1(String browser){
	crossbrowser cb = new crossbrowser();
	driver = cb.browsers(browser);
	}
	
	@Test
	public void login()
	{
		driver.get("https://www.yahoo.com");
	}
	
	@Test
	public void login1()
	{
		driver.get("https://www.bing.com");
	}

	@AfterClass
	public void closeyahoo()
	{
		driver.quit();
	}

}
