package SeleniumScript;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class toatllinks {
WebDriver driver;
@Test
public void links() throws IOException{        
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Chrome Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.wpengine.com/");
 
		List<WebElement> links = driver.findElements(By.tagName("a"));
 
		System.out.println(links.size());
 
		for (WebElement e : links)
 
		{      
			        String u = e.getAttribute("title");
			        Verifylinkacitve(u);
			        
         			System.out.println(e.getAttribute("title"));
         			//System.out.println("GetText=========" + e.getText());
		}
 
	}
private void Verifylinkacitve(String urr) throws IOException {
try{
	URL u = new URL(urr);
	HttpURLConnection h = (HttpURLConnection)u.openConnection();
	h.connect();
	if(h.getResponseCode()==200)
    {
        System.out.println(urr+ "- "+h.getResponseMessage());
     }
   if(h.getResponseCode()==h.HTTP_NOT_FOUND)  
    {
        System.out.println(urr+" - "+h.getResponseMessage() + " - "+ h.HTTP_NOT_FOUND);
     }
 } catch (Exception e) {
    
 }
	
}
 
}

