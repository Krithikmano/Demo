package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FramehandleTest {
	WebDriver driver;
	@Test
    public void frame () throws InterruptedException{
       
    System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\geckodriver-v0.15.0-win64\\geckodriver.exe");
    driver=new FirefoxDriver();
    //System.setProperty("webdriver.ie.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
    //driver=new InternetExplorerDriver();
   // System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Chrome Webdriver\\chromedriver_win32\\chromedriver.exe");
   // driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
    driver.switchTo().frame("packageFrame");
    driver.findElement(By.linkText("JUnit4AndTestNgConditionRunner")).click();
    //Thread.sleep(3000);
    //String text = driver.findElement(By.xpath("html/body/div[3]/h2")).getText();
    /// System.out.println (text);         
    driver.switchTo().defaultContent();
    driver.switchTo().frame("packageListFrame");
    driver.findElement(By.linkText("org.openqa.selenium.firefox")).click();
    driver.switchTo().defaultContent();
    driver.switchTo().frame("classFrame");
    driver.findElement(By.linkText("org.openqa.selenium.firefox")).click();
	}
}
