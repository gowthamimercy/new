package excell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {

	public static void main(String[] args) throws IOException {

		FileInputStream file =new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\gowthami\\seleniumtesting\\library files\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		Row r =sheet.getRow(0);
		Cell c= r.getCell(0);
		String data =c.getStringCellValue();
		System.out.println(data);
		
	}

}
