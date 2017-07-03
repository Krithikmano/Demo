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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Configreader;
import Utility.POM;
import Utility.Pagefactorypompractise;

public class SeleniumpracusingPagefactory {
WebDriver driver;
Configreader config= new Configreader();

@Test
public void Method1Browser(){
	 
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Chrome Webdriver\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
     //driver.get(config.applicationurl());
     driver.get(config.applicationurl());
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }

@Test
public void Method2signin() throws IOException, InterruptedException{
POM pf = new POM(driver);
pf.login(config.Username(), config.Password());
pf.link();
//System.out.println(pf.Message());
Capturescreenshot.screenshot(driver, "Successfulsingin");
}

}