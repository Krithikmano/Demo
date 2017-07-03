package SeleniumScript;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Brokenlink {
	WebDriver driver;
	@Test
	public void linkconnection(){
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Gecko\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		List<WebElement> linknames = driver.findElements(By.tagName("a"));
		System.out.println(linknames.size());
		for(WebElement e:linknames){
		String urlnames = e.getAttribute("href");
		verifyLinkactive(urlnames);
			
		}
}
	public void verifyLinkactive(String url1) {
		// TODO Auto-generated method stub
		
		try {
			URL u = new URL(url1);
			HttpURLConnection httpURLConnect = (HttpURLConnection)u.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			int r = httpURLConnect.getResponseCode();
			if(r==200)
	           {
	               System.out.println(url1+" - "+httpURLConnect.getResponseMessage());
	           }
		    if(r!=200)
	           {
	               System.out.println(url1+" - "+httpURLConnect.getResponseMessage());
		       }
	           }
		catch (Exception e) {
			  e.getMessage();
		}
		
		
		}
	}
