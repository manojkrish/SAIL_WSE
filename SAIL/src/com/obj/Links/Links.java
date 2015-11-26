package com.obj.Links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Links implements Links_Interface{
	
	public WebDriver driver;
	
	By Link_Tab = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[1]/section/div/ul/li[4]/a");
	
	By Link_Text_Field = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[1]/section/div/div/div[4]/div/div/link-post/div[1]/div/div[1]");
	
	By Meta_Description = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[1]/section/div/div/div[4]/div/div/link-post/div[2]/div");
	
	By Meta_Description_Close = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[1]/section/div/div/div[4]/div/div/link-post/div[2]/div/button");
	
	By clickPost = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[2]/button");
	
	public Links(WebDriver driver)
	{
	
		this.driver = driver;
	}

	public boolean Is_Link_Tab_Enabled() 
	{
	
		WebElement We = driver.findElement(Link_Tab);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
		
		
	}

	public boolean Is_Link_Tab_Displayed() {
		
		WebElement We = driver.findElement(Link_Tab);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}

	public void Click_Link_Tab() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement We = driver.findElement(Link_Tab);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	public boolean Is_Link_Text_Field_Enabled() {
		
		WebElement We = driver.findElement(Link_Text_Field);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
	
	}

	public boolean Is_Link_Text_Field_Displayed() {
	
		WebElement We = driver.findElement(Link_Text_Field);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}

	public void Click_Link_Text_Field() throws InterruptedException {
		
		
		
		String st[] = {"http://www.youtube.com","http://www.yahoo.com","http://www.gmail.com"};
		
		for(int i =0 ; i<st.length ;i++)
		{
			
		WebElement we = driver.findElement(Link_Text_Field);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		//we.click();
		
		we.sendKeys(st[i]);
		
		we.sendKeys(Keys.SPACE);
		
		Assert.assertEquals(Is_Meta_Description_Close_button_Enabled(),true);
		
		Thread.sleep(4000);
		
		//Assert.assertEquals(Is_Meta_Description_Displayed(), true);
		
		WebElement We = driver.findElement(clickPost);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
		Thread.sleep(2000);
		
		WebElement We1 = driver.findElement(Link_Tab);
		
		/*WebDriverWait wait2 = new WebDriverWait(driver,10);
		
		wait2.until(ExpectedConditions.elementToBeClickable(We1));*/
		
		We1.click();
		
	
		}
	}

	public boolean Is_Meta_Description_Enabled() {

		
		WebElement We = driver.findElement(Meta_Description);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
		
	}

	public boolean Is_Meta_Description_Displayed() {
	
		WebElement We = driver.findElement(Meta_Description);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}

	public void Click_Meta_Description_Close() {
		
		WebElement We = driver.findElement(Meta_Description_Close);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();

		
	}

	public boolean Is_Meta_Description_Close_button_Enabled() {
		
		WebElement We = driver.findElement(Meta_Description_Close);
		
		WebDriverWait wait = new WebDriverWait(driver,100);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
		
	}

	public boolean Is_Meta_Description_Close_button_Displayed() {
		
		WebElement We = driver.findElement(Meta_Description_Close);
		
		WebDriverWait wait = new WebDriverWait(driver,100);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}

	 
}
