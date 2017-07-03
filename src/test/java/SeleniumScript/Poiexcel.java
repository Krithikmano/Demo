package SeleniumScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class Poiexcel {

	public static void main(String[] args) throws IOException {
		//public Object [][] ReadExcel() throws IOException
		//{
		 File f = new File("C:\\Users\\krith\\Desktop\\Selenium IDE\\Data.xls");
		 FileInputStream fi = new FileInputStream(f);
		 //POIFSFileSystem fi = new POIFSFileSystem(f);
		 HSSFWorkbook wb = new HSSFWorkbook(fi);
		 HSSFSheet s= wb.getSheet("Sheet1");
		 int rownum = s.getLastRowNum()+1;
		 System.out.println(rownum);
		 System.out.println(s.getRow(1).getCell(0));
		 int colnum = s.getRow(0).getLastCellNum();
		 //System.out.println(colnum);
		 //String [][] data = new String [rownum][colnum];
		 for(int i=1;i<rownum;i++)
		 {
			 HSSFRow row = s.getRow(i);
			  for (int j=0;j<colnum;j++)
			   {
				HSSFCell cell = row.getCell(j);
				 System.out.println(cell);
				 //String value = cell.toString();
				// data [i][j] = value;
				// System.out.println(value);
				
			     }
			 
			 }
		    
		 	 
		     
		 }
				
	}

