package com.obj.LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage implements Sail_Interface_Login_page {

	WebDriver driver;

	By LoginText = By
			.xpath("html/body/div[2]/div[2]/div[4]/div/div/div/div/h4");

	By UserName = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div/div/form/div[1]/div[1]/input"); 

	By UserNamePlaceholder = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div/div/form/div[1]/div[1]/input");

	By Password = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div/div/form/div[1]/div[2]/input");

	By UserSelect = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div/div/form/div[2]/button");

	By User1 = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div/div/form/div[2]/ul/li[5]/a");

	By User2 = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div/div[2]/form/div[3]/div[1]/div/ul/li[2]/a");

	By User3 = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div/div[2]/form/div[3]/div[1]/div/ul/li[3]/a");

	By User4 = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div/div[2]/form/div[3]/div[1]/div/ul/li[4]/a");

	By User5 = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div/div[2]/form/div[3]/div[1]/div/ul/li[5]/a");

	By User6 = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div/div[2]/form/div[3]/div[1]/div/ul/li[11]/a");

	By User7 = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div/div[2]/form/div[3]/div[1]/div/ul/li[12]/a");

	By User8 = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div/div[2]/form/div[3]/div[1]/div/ul/li[13]/a");

	By User9 = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div/div[2]/form/div[3]/div[1]/div/ul/li[14]/a");

	By LoginButton = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div/div/form/button");

	By Logout = By
			.xpath("/html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[3]/li[5]/a/i");

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	public void selectUserToggle() {

		driver.findElement(UserSelect).click();

		WebElement myDynamicElement = (new WebDriverWait(driver, 5))
				.until(ExpectedConditions.presenceOfElementLocated(User1));

		myDynamicElement.click();

		// driver.findElement(User1).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(LoginButton).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public boolean LoginTextIsdisplayed() {

		WebElement ele = driver.findElement(LoginText);

		String elem = ele.getText();

		String Expected = "Login";

		if (elem.contentEquals(Expected)) {

			System.out.println("Login Page is appears");

		} else {

			System.out.println("Login Page is not appears");

		}

		return elem.equals("Login");

	}

	public boolean UserNameFieldDidplayed() {

		return driver.findElement(UserName).isEnabled();
	}

	public boolean UserNamePlaceHoldeIsDisplayed() {

		String ele = driver.findElement(UserNamePlaceholder).getAttribute(
				"placeholder");
		String Expected = "User name";
		if (ele.contentEquals(Expected)) {

			System.out.println("UserName Placholder is Displayed");

		} else {

			System.out.println("UserName is not Displayed");

		}

		return ele.contentEquals("User name");
	}

	public boolean PasswordFieldDidplayed() {

		return driver.findElement(Password).isEnabled();
	}

	public boolean PasswordPlaceHoldeIsDisplayed() {

		String ele = driver.findElement(Password).getAttribute("placeholder");
		String Expected = "Password";
		if (ele.contentEquals(Expected)) {

			System.out.println("PassWord Placholder is Displayed");

		} else {

			System.out.println("PassWord Placholder is not Displayed");

		}
		return ele.contentEquals("Password");

	}

	public void LogoutIsDisplayed() {

		driver.findElement(Logout).isDisplayed();

	}

	public void LogoutIsEnabled() {

		driver.findElement(Logout).isEnabled();

	}

	public void LogoutClick() throws InterruptedException {

		Thread.sleep(4000);
		
		driver.findElement(Logout).click();
	}

}