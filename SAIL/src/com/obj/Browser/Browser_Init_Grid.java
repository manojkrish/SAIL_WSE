package com.obj.Browser;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;

import com.obj.LoginPage.LoginPage;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

public class Browser_Init_Grid
{
   public WebDriver driver;
   public String URL, Node;
   protected ThreadLocal<RemoteWebDriver> threadDriver = null;
   
   @Parameters("browser")
   @BeforeClass
   public void launchapp(String browser) throws MalformedURLException
   {
      String URL = "http://testnsels.azurewebsites.net";
      
      if (browser.equalsIgnoreCase("firefox"))
      {
         System.out.println(" Executing on FireFox");
         String Node = "http://192.168.0.6:5555/wd/hub";
         DesiredCapabilities cap = DesiredCapabilities.firefox();
         cap.setBrowserName("firefox");
         driver = new RemoteWebDriver(new URL(Node), cap);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.navigate().to(URL);
         driver.manage().window().maximize();
         
         try {
 			LoginPage lp = new LoginPage(driver);

 			lp.LoginTextIsdisplayed();

 			lp.UserNameFieldDidplayed();

 			lp.UserNamePlaceHoldeIsDisplayed();

 			lp.PasswordFieldDidplayed();

 			lp.PasswordPlaceHoldeIsDisplayed();

 			lp.selectUserToggle();
 			
 			//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 		} 
 		catch (Exception e) 
 		{
 			System.out.println("Login Failed");
 		}
      }
      else if (browser.equalsIgnoreCase("chrome"))
      {
         System.out.println(" Executing on CHROME");
         DesiredCapabilities cap = DesiredCapabilities.chrome();
         cap.setBrowserName("chrome");
         String Node = "http://10.98.5.176:5558/wd/hub";
         driver = new RemoteWebDriver(new URL(Node), cap);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.navigate().to(URL);
         driver.manage().window().maximize();
         
         try {
 			LoginPage lp = new LoginPage(driver);

 			lp.LoginTextIsdisplayed();

 			lp.UserNameFieldDidplayed();

 			lp.UserNamePlaceHoldeIsDisplayed();

 			lp.PasswordFieldDidplayed();

 			lp.PasswordPlaceHoldeIsDisplayed();

 			lp.selectUserToggle();
 			
 			//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 		} 
 		catch (Exception e) 
 		{
 			System.out.println("Login Failed");
 		}
      }
      else if (browser.equalsIgnoreCase("ie"))
      {
         System.out.println(" Executing on IE");
         DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
         cap.setBrowserName("ie");
         String Node = " http://10.98.5.176:5557/wd/hub";
         driver = new RemoteWebDriver(new URL(Node), cap);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.navigate().to(URL);
         driver.manage().window().maximize();
         
         try {
 			LoginPage lp = new LoginPage(driver);

 			lp.LoginTextIsdisplayed();

 			lp.UserNameFieldDidplayed();

 			lp.UserNamePlaceHoldeIsDisplayed();

 			lp.PasswordFieldDidplayed();

 			lp.PasswordPlaceHoldeIsDisplayed();

 			lp.selectUserToggle();
 			
 			//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 		} 
 		catch (Exception e) 
 		{
 			System.out.println("Login Failed");
 		}
      }      
      /*else if (browser.equalsIgnoreCase("safari"))
      {
         System.out.println(" Executing on Safari");
         DesiredCapabilities cap = DesiredCapabilities.safari();
         cap.setBrowserName("Safari");
         String Node = "http://192.168.0.11:5559/wd/hub";
         driver = new RemoteWebDriver(new URL(Node), cap);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.navigate().to(URL);
         driver.manage().window().maximize();
         
         try {
 			LoginPage lp = new LoginPage(driver);

 			lp.LoginTextIsdisplayed();

 			lp.UserNameFieldDidplayed();

 			lp.UserNamePlaceHoldeIsDisplayed();

 			lp.PasswordFieldDidplayed();

 			lp.PasswordPlaceHoldeIsDisplayed();

 			lp.selectUserToggle();
 			
 			//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 		} 
 		catch (Exception e) 
 		{
 			System.out.println("Login Failed");
 		}
      }*/
      
      else
      {
         throw new IllegalArgumentException("The Browser Type is Undefined");
      }
   }
   
  
   @AfterClass
   public void closeBrowser()
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
	   
      driver.close();
   }
}
