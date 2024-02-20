package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	
	public static String TestData(int rowindex, int cellindex) throws EncryptedDocumentException, IOException {
  String Path = System.getProperty("user.dir")+"\\src\\Testdata\\Practic Microsoft Excel Worksheet.xlsx";
		FileInputStream fis =new FileInputStream(Path);
		
		String value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(rowindex).getCell(cellindex).getStringCellValue();
	
		return value;
	}
	
	
  public static String property_file(String key) throws IOException {
	  Properties prop = new Properties();
	  String path = System.getProperty("user.dir")+"\\src\\property_file\\amazon.properties";
	  FileInputStream file = new FileInputStream(path);
	  
	  prop.load(file);
	 String value = prop.getProperty(key);
	  return value; 
  }

}
