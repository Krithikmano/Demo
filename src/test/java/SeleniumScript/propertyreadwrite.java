package SeleniumScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class propertyreadwrite {
      
	 public static void main(String[] arg)
	 {
	    		try {
	    			Properties p;
	    		p = new Properties();
			File f = new File("C:\\Users\\krith\\workspace\\Selenium\\src\\test\\java\\config.properties");
			FileInputStream fi = new FileInputStream(f);
			p.load(fi);		
		    System.out.println(p);
		    p.setProperty("harshan", "Age");
		    //FileOutputStream fos = new FileOutputStream(f);
		    FileWriter fos = new FileWriter(f);
		    p.store(fos, "updated via program");
			  	}
			catch (Exception e) {
			System.out.println("Exception is=="+e.getMessage());
			}
	    		finally{
	    				    		}
	       }
}

