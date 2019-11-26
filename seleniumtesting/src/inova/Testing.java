package inova;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\eclipse-workspace\\gowthami\\seleniumtesting\\driver files\\geckodriver.exe");
		WebDriver driver = null;
		   
		driver = new FirefoxDriver();
		String url ="https://www.inova.org";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Find a Doctor")).click();
		WebElement drop =driver.findElement(By.className("dropdown bootstrap-select bs3"));
		Select selection1 =new Select(drop);
		selection1.selectByIndex(0);
		
	}

}
