package SeleniumScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.POMwebtable;
import Utility.Webtablepom;

public class dynamicwebtablepom {
	WebDriver driver;
	@Test
    public void webtable () {
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Chrome Webdriver\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.w3schools.com/html/default.asp");
    Webtablepom pom = new Webtablepom(driver);
    //List <WebElement> E= driver.findElements(By.xpath(".//*[@id='customers']/tbody/tr"));
     //int rowcount=POM.Tablec().size();
    pom.table();
    System.out.println(pom.Tablec().size());
    int i = 2;
    String xpath1 = ".//*[@id='customers']/tbody/tr[";
    String xpath2 = "]/td[1]";
    String xpath3 = "]/td[2]";
    String xpath4 = "]/td[3]";
    for(i=2;i<=pom.Tablec().size();i++){
    	String company = new StringBuilder().append(xpath1).append(i).append(xpath2).toString();
    	String companyName = driver.findElement(By.xpath(company)).getText();
    	//System.out.println(companyName);
    	String contact = new StringBuilder().append(xpath1).append(i).append(xpath3).toString();
    	String contactName = driver.findElement(By.xpath(contact)).getText();
    	//System.out.println(contactName);
    	String country = new StringBuilder().append(xpath1).append(i).append(xpath4).toString();
    	String countryName = driver.findElement(By.xpath(country)).getText();
    	//System.out.println(countryName);
    	if(companyName.equalsIgnoreCase("Island Trading") && contactName.equalsIgnoreCase("Helen Bennett") && countryName.equalsIgnoreCase("UK")){
    		String Expected1 ="Island Trading";
    		String Expected2 ="Helen Bennett";
    		String Expected3 ="UK";
    		Assert.assertEquals(Expected1, companyName);
    		Assert.assertEquals(Expected2, contactName);
    		Assert.assertEquals(Expected3, countryName);
    		System.out.println("Values are present ====="+companyName+contactName+countryName);
    	}
      }
          
}
}