package SeleniumScript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.Browser;
import Utility.Configreader;

public class Googlecallproperty {
public WebDriver driver;
Configreader config = new Configreader();
@Test
public void google() throws InterruptedException{
	Browser b =new Browser();
	driver = b.chrome();
	Thread.sleep(5000);
	driver.get(config.applicationurl());
	 List<WebElement> e = driver.findElements(By.id("ss"));
	 
	 
	
	}
}
