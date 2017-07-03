package SeleniumScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Capturescreenshot {

public static void screenshot(WebDriver driver,String screenshotname) throws IOException{
	
	//create instance for new file location
	File f = new File("C:\\Users\\krith\\workspace\\SeleniumTest\\Screenshot\\"+screenshotname+".png");
	//Create interface for TakesScreenshot
	TakesScreenshot Ts = ((TakesScreenshot)driver);
	File Src = Ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Src, f);
	
	//Copy and paste the below line in your code
	//Instead of google, change the proper name
	//Capturescreenshot.screenshot(driver,"google");
}
	
}

