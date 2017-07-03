package SeleniumScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utility.Browser;


public class callconstructor {
WebDriver driver;

@Test
public void Method2signin() throws InterruptedException, IOException{
Browser b = new Browser();
b.firefox();
b.chrome();
b.ie();
/*driver.get(config.applicationurl());
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.cssSelector(".login")).click();
driver.findElement(By.cssSelector("#email")).sendKeys("krithikmano@gmail.com");
driver.findElement(By.cssSelector("#passwd")).sendKeys("Chennai1!");
driver.findElement(By.cssSelector("#SubmitLogin")).click();
Thread.sleep(3000);
String message = driver.findElement(By.cssSelector(".account>span")).getAttribute("innerText");
Assert.assertEquals("karthik manoharan", message);
Capturescreenshot.screenshot(driver, "Successfulsingin");
System.out.println(message);*/
}
@Test(enabled=false)
public void Method3searchitem() throws IOException{
	driver.findElement(By.cssSelector("#search_query_top")).sendKeys("Jeans");
	driver.findElement(By.cssSelector("[name='submit_search']")).click();
	String Searchmessage = driver.findElement(By.cssSelector(".alert.alert-warning")).getText();
	Capturescreenshot.screenshot(driver, "searchitem");
	System.out.println("Product Search message" +Searchmessage);
	Assert.assertEquals("No results were found for your search \"Jeans\"", Searchmessage, "Message is not proper");
} 
@Test(enabled=false)
public void Method3selectdress() throws InterruptedException, IOException{
	driver.findElement(By.xpath(".//*[@id='best-sellers_block_right']/div/ul/li[1]/a/img")).click();
	String Dressmessage = driver.findElement(By.cssSelector("[itemprop='name']")).getText();
	Assert.assertEquals("Printed Chiffon Dress", Dressmessage);
	driver.findElement(By.cssSelector("#color_15")).click();
	driver.findElement(By.xpath("//*[@id='add_to_cart']/button")).click();
	Thread.sleep(3000);
	String Pricemessage = driver.findElement(By.xpath(".//span[@class='ajax_block_products_total']")).getText();
	System.out.println("Price1" +Pricemessage);
	Assert.assertEquals("$16.40", Pricemessage);
	driver.findElement(By.cssSelector("[Class*='button-medium']>span")).click();
	Thread.sleep(3000);
	String Finalprice = driver.findElement(By.cssSelector("#total_price")).getText();
	Capturescreenshot.screenshot(driver, "FianlPrice");
	System.out.println("Finalprice1" +Finalprice);
	Assert.assertEquals("$18.40", Finalprice);
	driver.findElement(By.xpath("//*[text()='Proceed to checkout']")).click();
	}

@Test(enabled=false)
public void Method4closebrowser(){
	driver.close();
}
}