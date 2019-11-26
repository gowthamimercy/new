package Newtours;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login extends Baseclass {
	
	
	@Test
	public void log() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\gowthami\\seleniumtesting\\exceldata\\multiple data.xlsx");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
			XSSFWorkbook workbook = new XSSFWorkbook(file); 
			XSSFSheet sheet = workbook.getSheet("sheet1");
			int  row_count =sheet.getLastRowNum();
			System.out.println("no of rows :"+   row_count);
	          
			String expected_title ="filght";
			String actualtilte="FLIGHT FINDER";
			for(int i=1;i<=row_count;i++)
			{
				Row row=sheet.getRow(i);
				
				driver.findElement(By.name("userName")).sendKeys(row.getCell(0).getStringCellValue());
				driver.findElement(By.name("password")).sendKeys(row.getCell(1).getStringCellValue());
				driver.findElement(By.name("login")).click();
				
				if(expected_title.equals(actualtilte))
				{
					System.out.println(expected_title);
					
				}
				else {						{
					
					System.out.println(actualtilte);
				
						}
			}
	
			}
	}
}

	
	 

	 
	


