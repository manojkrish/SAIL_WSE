package com.obj.Appium.Configuration;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.obj.Bubble_Login.Bubble_Login;
 
@SuppressWarnings("unused")
public class Appium {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Lenovo");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome"); //Name of mobile web browser to automate. Should be an empty string if automating an app instead.
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app-package", "com.android.chrome"); //Replace with your app's package
		capabilities.setCapability("app-activity", "APP PACKAGE.ANDROID ACTIVITY"); //Replace with app's Activity
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4750/wd/hub"), capabilities);
		driver.get("https://159.182.18.93/index.jhtml?redirecturl=https://testoddworld.wallstreetenglish.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try {
			
			Bubble_Login bl = new Bubble_Login(driver);
			
			bl.Is_Bubble_Login_Page_Enabled();
			
			bl.Is_Bubble_Login_Page_Displayed();
			
			bl.Get_Bubble_Login();
			
			bl.Is_User_Name_Field_Enabled();
			
			bl.Is_User_Name_Field_Displayed();
			
			bl.Insert_User_Name();
			
			bl.Is_Password_Field_Enabled();
			
			bl.Is_Password_Field_Displayed();
			
			bl.Insert_Password();
			
			bl.Is_Login_Button_Enabled();
			
			bl.Is_Login_Button_Displayed();
			
			bl.Click_Login_Button();
			
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			
			/*LoginPage lp = new LoginPage(driver);

			lp.LoginTextIsdisplayed();

			lp.UserNameFieldDidplayed();

			lp.UserNamePlaceHoldeIsDisplayed();

			lp.PasswordFieldDidplayed();

			lp.PasswordPlaceHoldeIsDisplayed();

			lp.selectUserToggle();*/
			
			WebDriverWait wait = new WebDriverWait(driver,200);
			
			WebElement We = driver.findElement(By.cssSelector("span.glyphicon.glyphicon-remove"));
			
			wait.until(ExpectedConditions.elementToBeClickable(We));
			
			We.click();
			
		} 
		catch (Exception e) 
		{
			System.out.println("Login Failed");
		}
	}
	
	

}