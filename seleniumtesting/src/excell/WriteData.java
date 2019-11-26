package excell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteData {

	public static void main(String[] args) throws IOException {

	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\gowthami\\seleniumtesting\\driver files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String url ="http://www.newtours.demoaut.com";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country =driver.findElement(By.name("country"));
		List<WebElement>list=country.findElements(By.tagName("option"));
		int countries=list.size();
		System.out.println(countries);
		FileInputStream file= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\gowthami\\seleniumtesting\\screenshot\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook("file");
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		for(int i=0;i<=countries;i++)
			
		{
			String countryname=list.get(i).getText();
			System.out.println(countryname);
			Row r =sheet.createRow(i);
			
			Cell c=r.createCell(0);
			c.setCellValue(countryname);
			
			FileOutputStream file1=new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\gowthami\\seleniumtesting\\screenshot\\data.xlsx");
			
			workbook.write(file1);
		}
	}

}
