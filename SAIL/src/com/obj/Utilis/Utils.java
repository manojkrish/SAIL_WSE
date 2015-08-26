package com.obj.Utilis;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Utils {
	
	WebDriver driver;
	
	public void scrolling()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
        js.executeScript("javascript:window.scrollBy(250,350)");
	}

}
