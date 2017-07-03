package SeleniumScript;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Multiplewindow {
	String child;
	WebDriver driver;
	@Test
	public void windowhandling() throws InterruptedException
	{
		//System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	   // driver=new FirefoxDriver();
	    //System.setProperty("webdriver.ie.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
	    //driver=new InternetExplorerDriver();
	    System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Chrome Webdriver\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.hdfcbank.com/");
	    WebElement E = driver.findElement(By.cssSelector("#cee_closeBtn>img"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(E).click().perform();
	    String parent = driver.getWindowHandle();
	    System.out.println(parent);
	    driver.findElement(By.cssSelector("img[src*='home_loan_new.gif']")).click();
	    //driver.findElement(By.cssSelector("a#loginsubmit")).click();
	    Set<String> handles=driver.getWindowHandles();
	    System.out.println(handles);
	      for(String s:handles)
	      {
	    	  System.out.println(s);
	    	  String child = driver.getWindowHandle();
	    	  System.out.println(child);
	    	   System.out.println(driver.getCurrentUrl());
	    	  /*if(s.contains("e6069fead1bd"))
	    	  {
	    	   driver.switchTo().window(s);
	    	   driver.findElement(By.linkText("Continue to NetBanking")).click();
	    	   System.out.println(driver.getCurrentUrl());
	          }*/
	      }
	       /*driver.switchTo().window(parent);
	       driver.findElement(By.linkText("Careers")).click();
	      System.out.println("Parent URL" + driver.getCurrentUrl());
	      for(String s:handles)
	      {
	    	  if(s.contains("d09c1ed1ac60"))
	    	  {
	    	   driver.switchTo().window(s);
	    	   driver.findElement(By.linkText("HDFC Bank branch")).click();
	 	       System.out.println(driver.getCurrentUrl());
	    	  }
	      }*/
	      
		     }
}