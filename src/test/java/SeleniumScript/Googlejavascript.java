package SeleniumScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Googlejavascript {
WebDriver driver;
@Test
public void javascript(){
	System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Gecko\\geckodriver-v0.16.1-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("alert('hello world');");
	driver.switchTo().alert().getText();
	System.out.println("Alert Message" + driver.switchTo().alert().getText());
	//driver.switchTo().alert().accept();
}
	
}
