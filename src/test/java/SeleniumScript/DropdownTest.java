package SeleniumScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import Utility.Configreader;
import Utility.Pagefactorypompractise;

public class DropdownTest {
    Configreader config = new Configreader();   
    public WebDriver driver;
    @Test
    public void dropdown() {
	//driver.get("https://accounts.google.com/SignUpExpress?service=adwords&continue=https%3A%2F%2Fadwords.google.com%2Fum%2Fidentity%3Fsourceid%3Dawo%26subid%3Dus-en-adon-bi-aw-a-search_1%21o2%26hl%3Den_US%26_ga%3D1.154918712.1815371488.1492312822&ltmpl=signin&hl=en_US");
    System.setProperty(config.drivername(), config.driverpath());
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(config.applicationurl());
    Pagefactorypompractise p = new Pagefactorypompractise(driver);
 	p.userprofile();
  for(WebElement element:p.dropdown())
	{
	String innerhtml = element.getText();
	//System.out.println(innerhtml);	
	if(innerhtml.contains("Aug"))
       {
	    element.click();
	    System.out.println(innerhtml);
	    break;
	   }	    	
    }
	p.country();
	for(WebElement element1:p.countrydrop())
	{
	String innerhtmlcountry = element1.getText();
	System.out.println(innerhtmlcountry);
	//if(innerhtmlcountry.contains("Kuwait"))
		if(innerhtmlcountry.startsWith("India"))
	{
		element1.click();
		break;
	}
	}
	//driver.close();
  }
}


