package com.obj.Delete_Option;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

public class Delete_In_Feed {
	
	public WebDriver driver;
	
	By Post_feed_option = By
			.xpath(".//*[@id='post-widget-body']/section/header/div[2]/div/button");

	By Edit_Option = By
			.xpath(".//*[@id='post-widget-body']/section/header/div[2]/div/ul/li[2]/a[2]/div/div");

	By Delete_Post_option = By.xpath("/html/body/div[2]/div[2]/div[5]/div/div/div[3]/div/div/div[2]/share-preview[2]/section/div[1]/section/header/div[3]/div/ul/li[2]/a[1]/delete-post/div");
	
		
	public Delete_In_Feed(WebDriver driver)
	{

		this.driver = driver;

	}
	
	public void Click_Post_Feed_Option() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		wait.until(ExpectedConditions.elementToBeClickable(Post_feed_option));

		///driver.findElement(Post_feed_option).click();

		WebElement We = driver.findElement(Post_feed_option);
		
		We.click();
		
	}

	public boolean Is_Delete_Option_Displayed() 
	{

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("scroll(0, 700)");

		WebDriverWait wait = new WebDriverWait(driver,25);
		
		wait.until(ExpectedConditions.elementToBeClickable(Delete_Post_option));
		
		WebElement we = driver.findElement(Delete_Post_option);

		return we.isDisplayed();

	}

	public void Click_Delete_Option()
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Delete_Post_option)));
		
		driver.findElement(Delete_Post_option).click();
	}
	
}
