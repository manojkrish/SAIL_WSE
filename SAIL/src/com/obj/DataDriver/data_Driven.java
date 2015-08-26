/*package com.obj.DataDriver;

import java.io.FileInputStream;
import java.io.IOException;
//import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class data_Driven {

	public static void main(String args[]) {

		try {
			// Open the Excel file
			FileInputStream fis = new FileInputStream(
					"F:\\ExcelInput\\Input.xls");
			// Access the required test data sheet
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheet = wb.getSheet("testdata");
			// Loop through all rows in the sheet
			// Start at row 1 as row 0 is our header row
			for (int count = 1; count <= sheet.getLastRowNum(); count++) {
				HSSFRow row = sheet.getRow(count);
				System.out.println("Running test case "
						+ row.getCell(0).toString());
				// Run the test for the current test data row
	//			runTest(row.getCell(1).toString(), row.getCell(2).toString());

			}
			fis.close();
		} catch (IOException e) {
			System.out.println("Test data file not found");
		}

	}
}
*/