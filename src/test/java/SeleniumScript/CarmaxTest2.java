package SeleniumScript;

import java.io.IOException;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

//import Utility.Capturescreenshot;

public class CarmaxTest2 {
	
	
	  public WebDriver driver;
	    @Test
		public void carmaxhome() throws InterruptedException, IOException
		{
	    	  System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Chrome Webdriver\\chromedriver_win32\\chromedriver.exe");
	    	    driver=new ChromeDriver();
	    	//System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\geckodriver-v0.15.0-win64\\geckodriver.exe");
			//driver=new FirefoxDriver();
			driver.get("https://www.carmax.com/");
			//driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			WebElement menu =driver.findElement(By.xpath("//a[@title='Research']"));
			Actions builder = new Actions(driver);
			builder.moveToElement(menu).perform();
			driver.findElement(By.cssSelector("[title*='Research All Cars'][class*='global']")).click();
			String Text=driver.findElement(By.cssSelector("h2.link-plantation--header")).getText();
			//Capturescreenshot.screenshot(driver,"car1");
			System.out.println(Text);
			Assert.assertEquals(Text, "Research Used Cars at CarMax");
			driver.findElement(By.xpath("//a[@class='link-plantation--item-make']")).click();
			String Text1=driver.findElement(By.cssSelector("h2.make--hero-title")).getText();
			System.out.println(Text1);
			driver.close();
		}
		

}
