package com.obj.Browser;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

//import com.obj.DataDriver.data_Driven;
import com.obj.LoginPage.LoginPage;

public class OpenBrowser  {

	public WebDriver driver;
	@SuppressWarnings("resource")
	@BeforeSuite
	public void createDriverByType() throws Exception{
		
		int a;
		System.out.println("Please Choose your below appropriate browser need to test in Windows");
		System.out.println("Please enter 1 for intilizing the browser in FF");
		System.out.println("Please enter 2 for intilizing the browser in Chrome");
		System.out.println("Please enter 3 for intilizing the browser in IE");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Integer : ");
		a = in.nextInt();
       System.out.println("You entered Integer "+a);
       switch (a) {
       case 1:
       driver=new FirefoxDriver();
       System.out.println("Firefox Browser Initilized");
       //driver.get("testnsela.azurewebsites.net");
       return;
       case 2:
       System.setProperty("webdriver.chrome.driver", "F:/ChromeDriver/chromedriver.exe");
       driver=new ChromeDriver();
       System.out.println("Chrome Browser Initilized");
       return;
       case 3:
       System.setProperty("webdriver.ie.driver", "F:/IE_Driver/IEDriverServer.exe");
       driver=new InternetExplorerDriver();
       System.out.println("IE Browser Initilized");
       return;
       default :
    	   System.out.println("No option as such");
       }
	}

	@BeforeClass
	public void OpenBrowse() throws InterruptedException { 
		
		/*WebDriver driver = new FirefoxDriver(); */
/*		
		driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"F:\\ChromeDriver\\chromedriver.exe");*/
/*
 *	driver = new ChromeDriver();
*/
		// WebDriver driver = new HtmlUnitDriver();

		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "F:\\IE_Driver\\IEDriverServer.exe");
		 * 
		 * driver = new InternetExplorerDriver();
		 */

		driver.manage().deleteAllCookies();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Thread.sleep(3000);

		driver.get("http://testoddworld.azurewebsites.net");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
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

	@AfterClass
	public void closeBrowser() throws InterruptedException {

		try{
		LoginPage lp = new LoginPage(driver);

		lp.LogoutIsDisplayed();

		lp.LogoutIsEnabled();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		lp.LogoutClick();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	/*@AfterSuite
	public void CloseBrowseInitialization(){
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.close();
		
	}*/
}
