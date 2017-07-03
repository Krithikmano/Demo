package SeleniumScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
	
public class Practice {
WebDriver driver;
@Test
public void seleniumdemo() throws InterruptedException
{
	//System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Gecko\\geckodriver-v0.16.1-win64\\geckodriver.exe");
    //driver=new FirefoxDriver();
    //System.setProperty("webdriver.ie.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
    //driver=new InternetExplorerDriver();
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Chrome Webdriver\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.get("http://www.seleniumframework.com/Practiceform/");
    driver.findElement(By.cssSelector("#vfb-10")).clear();
    //driver.findElement(By.cssSelector("#vfb-10")).sendKeys("Karthik");
    driver.findElement(By.cssSelector("#vfb-9")).clear();
    //driver.findElement(By.cssSelector("#vfb-9")).sendKeys("Harshan");
    driver.findElement(By.cssSelector("#vfb-6-0")).click();
    driver.findElement(By.cssSelector("#vfb-6-1")).click();
    driver.findElement(By.cssSelector("#vfb-6-2")).click();
    driver.findElement(By.cssSelector("#vfb-7-2")).click();
    WebElement W = driver.findElement(By.cssSelector("#vfb-11"));
    W.clear();
    W.sendKeys("http://www.yahoo.com");
    WebElement S = driver.findElement(By.cssSelector("#vfb-12"));
    Select d = new Select(S);
    d.selectByVisibleText("Option 3");
   // driver.findElement(By.cssSelector("#vfb-3")).sendKeys("50");
    WebElement drag = driver.findElement(By.xpath(".//*[@id='draga']"));
    WebElement drop = driver.findElement(By.xpath(".//*[@id='dragb']"));
    Actions action = new Actions(driver);
    Thread.sleep(3000);
    action.clickAndHold(drag).moveToElement(drop).release().build().perform();
    //action.dragAndDrop(drag, drop).build().perform();
    
}
}
