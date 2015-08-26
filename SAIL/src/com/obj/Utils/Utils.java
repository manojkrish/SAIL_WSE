package com.obj.Utils;

import java.io.File;
import java.io.IOException;
//import java.util.jar.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	
	WebDriver driver;
	
	public void screenShot() throws IOException{
		
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("F:\\SAIL_WSE\\ScreenShot\\ScreenShot"));
		
	}

}
