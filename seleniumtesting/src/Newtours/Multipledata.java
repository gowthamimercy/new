package Newtours;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Multipledata extends Baseclass {
	@Test
	public void lo() throws IOException {
		FileInputStream file=new  FileInputStream("C:\\Users\\HP\\eclipse-workspace\\gowthami\\seleniumtesting\\exceldata\\registration.xlsx");
         
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row_count=sheet.getLastRowNum();
		System.out.println("no of rows:"+row_count);
		for(int i=1;i<=row_count;i++)
		{
			Row rows=sheet.getRow(i);
			driver.findElement(By.linkText("REGISTER")).click();
			driver.findElement(By.name("firstName")).sendKeys(rows.getCell(0).getStringCellValue());
			
		driver.findElement(By.name("lastName")).sendKeys(rows.getCell(1).getStringCellValue());
		
		 WebElement phn=driver.findElement(By.name("phone"));
		// Type casting
		 int ph=(int)rows.getCell(2).getNumericCellValue();
		 phn.sendKeys(String.valueOf(ph));
		 
     }
         
         
         
         
	}
	
	
	
	
	
	

	
   
}
