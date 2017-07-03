	package SeleniumScript;
	
	import java.io.File;
	import java.io.IOException;
	
	import org.apache.poi.hssf.usermodel.HSSFCell;
	import org.apache.poi.hssf.usermodel.HSSFRow;
	import org.apache.poi.hssf.usermodel.HSSFSheet;
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.apache.poi.poifs.filesystem.POIFSFileSystem;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
	
	public class Datadrivenng {
	public WebDriver driver;
	Allbrowser ab = new Allbrowser();
	
	@BeforeMethod
	@Parameters("browser")
	public void openbrowser(String browser){
		ab.browsers(browser);
	}
	
	@Test
	public void login()
	{
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("x");
		driver.findElement(By.id("pass")).sendKeys("y");
		driver.findElement(By.id("u_0_q")).click();
	}
	@AfterMethod
	public void Close()
	{
		driver.quit();
		}
	}
	
	
