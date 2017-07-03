package SeleniumScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class amazonTest {
public WebDriver driver;
@Test
public void amazon() {

System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Chrome Webdriver\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
//System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\geckodriver-v0.15.0-win64\\geckodriver.exe");
//driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//JavascriptExecutor jse = (JavascriptExecutor) driver;
//jse.executeScript("document.getElementById('twotabsearchtextbox').value = 'toys for 3 year old boys';");
driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("toys for 3 year old boys");
WebElement Searchbutton = driver.findElement(By.cssSelector("input[type='submit'][value='Go']"));
//Searchbutton.click();
Searchbutton.sendKeys(Keys.RETURN);
String SearchText = driver.findElement(By.cssSelector("h2#s-result-count")).getText();
System.out.println(SearchText);
Assert.assertTrue(SearchText.contains("toys for 3 year old boys"));
//driver.findElement(By.cssSelector("h2[data-attribute*='Building Educational And Construction']")).isDisplayed();
driver.findElement(By.cssSelector("h2[class*='a-size-base a-color-null s-inline scx-truncate s-access-title a-text-normal']")).click();
driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
WebElement cart = driver.findElement(By.xpath(".//*[@id='hlb-subcart']/div[1]"));
String cartmessage  = cart.getText();	
System.out.println(cartmessage);
Assert.assertTrue(cartmessage.contains("subtotal (1 item):"));
driver.findElement(By.xpath(".//*[@id='hlb-ptc-btn-native']")).click();
driver.findElement(By.cssSelector("input#ap_email")).sendKeys("krithikmano");
driver.findElement(By.cssSelector("input#ap_password")).sendKeys("Chicago1!");
driver.findElement(By.cssSelector("input#signInSubmit")).click();

}
}