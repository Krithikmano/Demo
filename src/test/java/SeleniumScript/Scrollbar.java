package SeleniumScript;

import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollbar {

WebDriver driver;
@Test
public void movescrollbar() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SELENIUM WEBDRIVER\\Chrome Webdriver\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://jqueryui.com/");
    Thread.sleep(5000);
    JavascriptExecutor js =((JavascriptExecutor)driver);
    js.executeScript("scroll(0,800)");
    veifylinkacitve
    URL u = new URL();
}


}
