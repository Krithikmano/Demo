package SeleniumScript;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Utility.Browser;
import Utility.Configreader;

public class facebook {
	public WebDriver driver;
	Configreader config = new Configreader();
	@Test
	@Parameters("a")
	public void facebooklogin(String dd) throws InterruptedException{
		Browser b =new Browser();
		driver = b.chrome();
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#u_0_h")).click();
		/*List<WebElement> r = driver.findElements(By.cssSelector("._58mt"));
		for(WebElement e : r){
			String gt =e.getText();
			System.out.println("GetText  -" +gt);
			if(gt.equalsIgnoreCase("Female")){
				e.click();
			}
		}*/
		}
	}
