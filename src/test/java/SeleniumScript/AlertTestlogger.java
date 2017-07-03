package SeleniumScript;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;



public class AlertTestlogger {
	WebDriver driver;
	Logger logger;
	@Test
    public void Alertmessage (){
    System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Chrome Webdriver\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.open('https://yahoo.com')");
    /*("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
    driver.navigate().to("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
   // driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
	String message = driver.switchTo().alert().getText();
	System.out.println("Alert Message========" + message);
	driver.switchTo().alert().accept();
	driver.close();
   */
    
}
}