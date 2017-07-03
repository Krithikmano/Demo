package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class POM {
	//Loginpage			
	@FindBy(how=How.CSS, using="#u_0_q")
	WebElement Loginlink;
	
	@FindBy(how=How.CSS, using="#email")
	WebElement Email;
	
	@FindBy(how=How.CSS, using="#pass")
	WebElement Password;
	
	@FindBy(how=How.CSS, using="#SubmitLogin")
	WebElement Submit;
	
	@FindBy(how=How.CSS, using=".account>span")
	WebElement Message;
	
		
	public POM(WebDriver driver)
	{
	 PageFactory.initElements(driver, this);
	}
	public void link(){
		Loginlink.click();
	}
	public void login(String Uid, String Pwd){
		
		Email.sendKeys(Uid);
		Password.sendKeys(Pwd);
		Loginlink.click();
					
	}
	public String Message(){
	return Message.getAttribute("innerText");
	}
}
