package multiple_data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtest {

	public static void main(String[] args) throws FileNotFoundException {

        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\gowthami\\seleniumtesting\\driver files\\chromedriver.exe");
        driver = new ChromeDriver();
        String url ="http://www.newtours.demoaut.com/";
        driver.get(url);
        
        FileInputStream file = new FileInputStream("C:\\Users\\HP\\Documents\\new.xlsx");
        XSSFWorkBook workbook = new XSSFWorkBook()
        
        
        
	}

}
