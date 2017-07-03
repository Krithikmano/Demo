package SeleniumScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ProperyfileReader {
WebDriver driver;
@Test
public void readproperty() throws IOException{
	    Properties p = new Properties();
		File f = new File("C:\\Users\\krith\\workspace\\Selenium\\src\\test\\java\\Readfile.properties");
		FileInputStream fi = new FileInputStream(f);
		p.load(fi);
		String WD = p.getProperty("Webdrivername");
		String EXE = p.getProperty("Driverexe");
		String BR = p.getProperty("Browsername");
		System.out.println(WD);
		System.out.println(EXE);
		System.out.println(BR);
		System.setProperty("WD", "EXE");
		driver=new FirefoxDriver();
}
}
