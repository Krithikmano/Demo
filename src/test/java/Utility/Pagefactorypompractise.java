package Utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pagefactorypompractise {
	
	@FindBy(how=How.CSS, using="input#FirstName")
	WebElement Firstname;
	
	@FindBy(how=How.CSS, using="input#LastName")
	WebElement Lastname;
	
	@FindBy(how=How.CSS, using="input#EmailAddress")
	WebElement Email;
	
	@FindBy(how=How.CSS, using="input#Passwd")
	WebElement password1;
	
	@FindBy(how=How.CSS, using="input#PasswdAgain")
	WebElement password2;
	
	@FindBy(how=How.CSS, using="span#BirthMonth")
	WebElement Month;
	
	@FindBy(how=How.XPATH, using="//div[@class='goog-menu goog-menu-vertical']//div/div")
	List<WebElement> dropdownvalues;
	
	@FindBy(how=How.CSS, using="div#CountryCode")
	WebElement country;
	
	@FindBy(how=How.XPATH, using="//div[@class='goog-menu goog-menu-vertical']//div/div")
	List<WebElement> countrydropdown;
	
	public Pagefactorypompractise(WebDriver driver)
	{
	 PageFactory.initElements(driver, this);
	}
	public void userprofile(){
		Firstname.sendKeys("Karthik");
		Lastname.sendKeys("Manoharan");
		Email.sendKeys("krithikmano@gmail.com");
		password1.sendKeys("Chicago1@");
		password2.sendKeys("Chicago1@");
		Month.click();
	} 
	
	public List<WebElement> dropdown(){
		List<WebElement> m = dropdownvalues;
		return m;
	}
	
	public void country(){
		country.click();
	  }

	public List<WebElement> countrydrop(){
		List<WebElement> c = countrydropdown;
		return c;
	}


}

