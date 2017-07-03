package Utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Webtablepom {
  
	@FindBy(how=How.LINK_TEXT, using="HTML Tables")
	WebElement Table;
	
	@FindBy(how=How.XPATH, using=".//*[@id='customers']/tbody/tr")
	List <WebElement> Tablec;
	
	public Webtablepom(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void table(){
		Table.click();
	}
	
	/*public int list(){
		return Tablec.size();
	}*/
	public List<WebElement> Tablec(){
		return Tablec;			
	}
	
}
