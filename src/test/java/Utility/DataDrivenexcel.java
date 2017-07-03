package Utility;
import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.testng.annotations.DataProvider;

public class DataDrivenexcel {
	//@DataProvider(name = "Testdata")
	public static void main(String[] arg) throws IOException
	//public Object[][] ReadExcel() throws IOException
	{
	 File f = new File("C:\\Users\\krith\\Desktop\\Selenium IDE\\Data.xls");
	 POIFSFileSystem fi = new POIFSFileSystem(f);
	 HSSFWorkbook wb = new HSSFWorkbook(fi);
	 //HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(new File("C:\\Users\\krith\\Desktop\\Selenium IDE\\Data.xls")));
	 HSSFSheet s= wb.getSheet("Sheet1");
	 int rownum = s.getLastRowNum()+1;
	 //int rownum = s.getPhysicalNumberOfRows();
	 //System.out.println(rownum);
	 int colnum = s.getRow(1).getLastCellNum();
	 String data[][] = new String [rownum][colnum];
	 for(int i=1;i<rownum;i++)
	 {
		 HSSFRow row = s.getRow(i);
		  for (int j=0;j<colnum;j++)
		   {
			HSSFCell cell = row.getCell(j);
			 String value = cell.toString();
			 data [i][j] = value;
			 System.out.println(value);
			
		     }
		 
		 }
	    
	 	 //wb.close();
	 	//return data;
	}
	     
	 }

