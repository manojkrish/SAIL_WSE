package com.obj.MyFriends;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFriends implements MyFriends_Interface {
	
	public WebDriver driver;
	
	By MyFriends = By.xpath("/html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[1]/li[1]/ul/li[2]/a");
	
	By Total_Friends_Count = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/section/div[1]/span/empty/ng-pluralize");
	
	By All = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div/div/ul/li[1]");
	
	By Students = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div/div/ul/li[2]");
	
	By Staff = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div/div/ul/li[3]");
	
	By MyCenter = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div/div/ul/li[4]");
	
	By ALL_Friends = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div/div/div/div[1]/friends-grid/div");
	
	By Students_Friends = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div/div/div/div[2]/friends-grid/div");
	
	By Staff_Friends = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div/div/div/div[3]/friends-grid/div");
	
	By MyCenter_Friends = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div/div/div/div[4]/friends-grid/div");
	
	By ALL_No_More_Activity = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div/div/div/div[1]/friends-grid/div/div[2]");
			
	By Student_No_More_Activity = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div/div/div/div[2]/friends-grid/div/div[2]");

	By Staff_No_More_Activity = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div/div/div/div[3]/friends-grid/div/section/div[2]");
	
	By MyCenter_No_More_Activity = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div/div/div/div[4]/friends-grid/div/section/div[2]");

	By Search_Box = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/section/div[1]/div[1]/input");
	
	By Find_Friends_Button = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/section/div[1]/div[2]/button");
	
	public MyFriends(WebDriver driver)
	{
		
		this.driver = driver;
		
	}
	
	public boolean Is_My_Friends_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(MyFriends);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_My_Friends_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(MyFriends);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void Click_My_Friends() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(MyFriends);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}
	
	public boolean Is_Total_Friends_Count_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Total_Friends_Count);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Total_Friends_Count_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Total_Friends_Count);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public String get_Total_Friends_Count() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Total_Friends_Count);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.getText();
	}
	
	public boolean Is_All_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(All);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_All_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(All);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public boolean Is_Students_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Students);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_Students_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Students);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public boolean Is_Staff_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Staff);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Staff_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Staff);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public boolean Is_My_Center_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(MyCenter);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_My_Center_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(MyCenter);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	
	public void click_All_Tab() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(All);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	
	public void click_Students_Tab() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Students);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}


	public void click_Staff_Tab() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Staff);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	
	public void click_My_Center_Tab() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(MyCenter);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	
	public String get_Members_In_All() throws InterruptedException {
		
		boolean IsDisplayed = IsMembers_All_No_More_visibility();
		
		while(!IsDisplayed)
		{
			
			IsDisplayed = IsMembers_All_No_More_visibility();
			
			int x=0,y=400;
			
			while(!IsDisplayed)
			{
				JavascriptExecutor jse = (JavascriptExecutor) driver;

				jse.executeScript("scroll("+x+","+y+")");

				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				IsDisplayed = IsMembers_All_No_More_visibility();	
			
				x=y;
				
				y=x+x;
			}
		}
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(ALL_Friends);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.getText();
	}


	public String get_Members_In_Students() throws InterruptedException {
		
		boolean IsDisplayed = IsMembers_Student_No_More_visibility();
		
		while(!IsDisplayed)
		{
			
			IsDisplayed = IsMembers_Student_No_More_visibility();
			
			int x=0,y=400;
			
			while(!IsDisplayed)
			{
				JavascriptExecutor jse = (JavascriptExecutor) driver;

				jse.executeScript("scroll("+x+","+y+")");

				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				IsDisplayed = IsMembers_Student_No_More_visibility();	
			
				x=y;
				
				y=x+x;
			}
		}
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Students_Friends);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.getText();
	}

	
	public String get_Members_In_Staff() throws InterruptedException {
		
		boolean IsDisplayed = IsMembers_Student_No_More_visibility();
		
		while(!IsDisplayed)
		{
			
			IsDisplayed = IsMembers_Staff_No_More_visibility();
			
			int x=0,y=400;
			
			while(!IsDisplayed)
			{
				JavascriptExecutor jse = (JavascriptExecutor) driver;

				jse.executeScript("scroll("+x+","+y+")");

				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				IsDisplayed = IsMembers_Student_No_More_visibility();	
			
				x=y;
				
				y=x+x;
			}
		}
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Staff_Friends);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.getText();
	}
	
	public String get_Members_In_MyCenter() {
		
		boolean IsDisplayed = IsMembers_Student_No_More_visibility();
		
		while(!IsDisplayed)
		{
			
			IsDisplayed = IsMembers_MyCenter_No_More_visibility();
			
			int x=0,y=400;
			
			while(!IsDisplayed)
			{
				JavascriptExecutor jse = (JavascriptExecutor) driver;

				jse.executeScript("scroll("+x+","+y+")");

				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				IsDisplayed = IsMembers_MyCenter_No_More_visibility();	
			
				x=y;
				
				y=x+x;
			}
		}
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(MyCenter_Friends);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.getText();
	}

	
	public boolean IsMembers_All_No_More_visibility()
	{
			
			boolean result = false;
			
			try{
				
				WebElement we = driver.findElement(ALL_No_More_Activity);
				
				result = we.isDisplayed();
				
			}
			catch(Exception e)
			{
				
				result = false;
				
			}
			
			return result;
		}
	
	public boolean IsMembers_Student_No_More_visibility()
	{
			
			boolean result = false;
			
			try{
				
				WebElement we = driver.findElement(Student_No_More_Activity);
				
				result = we.isDisplayed();
				
			}
			catch(Exception e)
			{
				
				result = false;
				
			}
			
			return result;
		}

	public boolean IsMembers_Staff_No_More_visibility()
	{
			
			boolean result = false;
			
			try{
				
				WebElement we = driver.findElement(Staff_No_More_Activity);
				
				result = we.isDisplayed();
				
			}
			catch(Exception e)
			{
				
				result = false;
				
			}
			
			return result;
		}

	public boolean IsMembers_MyCenter_No_More_visibility()
	{
			
			boolean result = false;
			
			try{
				
				WebElement we = driver.findElement(MyCenter_No_More_Activity);
				
				result = we.isDisplayed();
				
			}
			catch(Exception e)
			{
				
				result = false;
				
			}
			
			return result;
		}

	
	public boolean Is_Search_Box_Enabled() {
			
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Search_Box);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	
	public boolean Is_Search_Box_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Search_Box);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	
	public void Enter_Search_UserName() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Search_Box);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.sendKeys("Kitty");
		
		
	}

	
	public boolean Is_Find_Friend_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Find_Friends_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));		
		
		return We.isEnabled();
	}

	
	public boolean Is_Find_Friend_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Find_Friends_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));		
		
		return We.isDisplayed();
		
	}

	
	public void Click_Find_Friends() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Find_Friends_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));		
		
		We.click();
		
	}


	public String Get_Mem_title() {
		
		String st = driver.getCurrentUrl();
		
		return st;
	}

	@Override
	public boolean Is_Members_Enabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Is_Members_Displayed() {
		// TODO Auto-generated method stub
		return false;
	}
}
