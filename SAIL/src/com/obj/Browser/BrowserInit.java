package com.obj.Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.obj.LoginPage.LoginPage;

public class BrowserInit {
	
	public WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:/ChromeDriver/chromedriver.exe");
		 
	    driver=new ChromeDriver();
	   	
		//driver = new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().deleteAllCookies();
	    
	    driver.navigate().refresh();
		
		driver.get("http://testnselsqa.azurewebsites.net");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		try {
			LoginPage lp = new LoginPage(driver);

			lp.LoginTextIsdisplayed();

			lp.UserNameFieldDidplayed();

			lp.UserNamePlaceHoldeIsDisplayed();

			lp.PasswordFieldDidplayed();

			lp.PasswordPlaceHoldeIsDisplayed();

			lp.selectUserToggle();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector("span.glyphicon.glyphicon-remove")).click();
			
			//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		} 
		catch (Exception e) 
		{
			System.out.println("Login Failed");
		}
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		try{
			LoginPage lp = new LoginPage(driver);

			lp.LogoutIsDisplayed();

			lp.LogoutIsEnabled();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			lp.LogoutClick();
			
			driver.close();

			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}

}