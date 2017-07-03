package Utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class POMwebtable {
	
	@FindBy(how=How.LINK_TEXT, using="HTML Tables")
	WebElement Tablelink;
	
	@FindBy(how=How.XPATH, using=".//*[@id='customers']/tbody/tr")
	List <WebElement> Tablec;
	
	public POMwebtable(WebDriver driver)
	{
	 PageFactory.initElements(driver, this);
	}
	
	/*public void Tablelink(){
		Tablelink.click();
	}*/
	public List<WebElement> Tablec(){
		return Tablec;			
	}
}
