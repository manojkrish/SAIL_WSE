package com.obj.Dashboard_Widget;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

@SuppressWarnings("unused")
public class Dashboard_Widget implements Dashboard_Widget_Interface {
	
	public WebDriver driver;

	By Status_Feed_Avail = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[1]");

	By Profile_Image = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[1]/figure/a/img");

	By Status_Feed_Input_Field = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[1]/section/div/div/div[1]/div/div/div/div/div");

	By Status_Feed_PlaceHolder = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/share-widget/section/div[1]/section/div/div/div[1]/div/div/div/div/div[2]");

	By clickPost = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[2]/button");
	
	By Popup_Header_Text = By.xpath("/html/body/div[4]/div/div/div[1]");

	By Popup_Footer_Text = By.xpath("html/body/div[4]/div/div/div[2]");

	By Close_Status_Empty_Pop = By
			.xpath("/html/body/div[4]/div/div/div[1]/button");

	By Is_Login_UserName = By
			.xpath("/html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[3]/li[1]/p");

	By Is_Feed_UserName = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[2]/div/div/feed-activity[1]/div/section/div/a");

	By Is_Time_Stamp = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[2]/div/div/feed-activity[1]/div/section/div/span[2]/timeago");

	By Is_Profile_Image_In_Feed_Post = By
			.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[2]/div/div/feed-activity[1]/div/figure/a/img");
	
	By Is_Status_option = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[2]/div/button");
	
	By Is_EveryOne_option = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[2]/div/ul/li[1]/a");
	
	By Is_MyFriends_option = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[2]/div/ul/li[2]/a");
	
	By Teaser_Feed = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[2]/div/div/feed-activity[1]/div");

	By Feed_Page_Navigation = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[2]/div/button");
	// FileUpload Tab
	
	
	By FileTab = By.xpath(".//*[@id='tabclick_1']/a/tab-heading"); 
	
	By FileTab_StatusField = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[1]/section/div/div/div[2]/div/div/upload-file/div/div/div[1]/div/div[1]"); 
	
	By FileTab_Upload_Area = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[1]/section/div/div/div[2]/div/div/upload-file/div/div/div[2]/div[1]/input");
	
	By Status_Feed_ID = By.xpath("status-widget-body");
	
	By File_Tab_Post_Button = By.cssSelector("html.ng-scope body.push-menu.ng-scope div.app-container div.content div.ng-scope div.ng-scope div#dashboard.container.ng-scope div.sail div.ng-scope div.sail-block.ng-scope div.col-md-6.clr-right-pad div.row share-widget.ng-isolate-scope section#status-widget.col-xs-12.col-sm-12.col-md-12.fadeInUp div#status-widget-footer.row button.post-btn.pull-right");
	
	By File_Tab_Empty_Alert_Popup = By.xpath("/html/body/div[4]/div/div");
	
	By File_Tab_Empty_Alert_Close_Button = By.cssSelector("body > div.modal.fade.ng-isolate-scope.sail-modal.in > div > div > div.sail-m.modal-header.ng-scope > button");
	
	By ThumbNail_Close = By.cssSelector("html.ng-scope body.push-menu.ng-scope div.app-container div.content div.ng-scope div.ng-scope div#dashboard.container.ng-scope div.row.sail div.ng-scope div.col-md-6.col-sm-8.col-xs-12.ng-scope.ng-isolate-scope share-widget.ng-isolate-scope section#status-widget.col-xs-12.col-sm-12.col-md-12.fadeInUp div#status-widget-body section.status-box div.ng-isolate-scope div.tab-content div.tab-pane.ng-scope.active div.status-body.ng-scope div.ng-scope upload-file.ng-pristine.ng-untouched.ng-valid.ng-isolate-scope div div div.input-element.status-image-block div.previewThumb.thumbnail.ng-scope span.closeThumb");
	
	By Click_ThumbNail = By.cssSelector("html.ng-scope body.push-menu.ng-scope div.app-container div.content div.ng-scope div.ng-scope div#dashboard.container.ng-scope div.row.sail div.ng-scope div.col-md-6.col-sm-8.col-xs-12.ng-scope.ng-isolate-scope share-widget.ng-isolate-scope section#status-widget.col-xs-12.col-sm-12.col-md-12.fadeInUp div#status-widget-body section.status-box div.ng-isolate-scope div.tab-content div.tab-pane.ng-scope.active div.status-body.ng-scope div.ng-scope upload-file.ng-pristine.ng-untouched.ng-valid.ng-isolate-scope div div div.input-element.status-image-block div.previewThumb.thumbnail.ng-scope img");
	
	By Progress_bar = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/share-widget/section/div[1]/section/div/div/div[2]/div/div/upload-file/div/div/div[2]/div[2]/div/div");
	
	By FileUpload_Bar_Close_Button = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/share-widget/section/div[1]/section/div/div/div[2]/div/div/upload-file/div/div/div[2]/div[3]/div/div[3]/a");
	
	By Invalid_File_Upload_Alert = By.cssSelector(".sail-m.modal-header.ng-scope");
	
	By Invalid_File_upload_Alert_Close = By.cssSelector("body > div.modal.fade.ng-isolate-scope.sail-modal.in > div > div > div.sail-m.modal-header.ng-scope > button");
	
	By Is_File_upload_Edit_Cancel_button = By.cssSelector("html body.push-menu div.app-container div.content div div div#dashboard.container div.row.sail div div.col-md-6.col-sm-8.col-xs-12 div.preview-container share-preview#feed_id-55b62df58ed4a2648db370cc section#post-widget.col-xs-12.col-sm-12.col-md-12.fadeInUp div#post-widget-body.row div.preview-block section.posting-body div.post-body div.data-list div.disp-list div div.btn-grp button.btn.btn-sm.btn-default.ng-binding");
	
	By Is_File_upload_Edit_Done_button = By.cssSelector("html body.push-menu div.app-container div.content div div div#dashboard.container div.row.sail div div.col-md-6.col-sm-8.col-xs-12 div.preview-container share-preview#feed_id-55b62df58ed4a2648db370cc section#post-widget.col-xs-12.col-sm-12.col-md-12.fadeInUp div#post-widget-body.row div.preview-block section.posting-body div.post-body div.data-list div.disp-list div div.btn-grp button.btn.btn-sm.btn-info.ng-binding");
	
	
	//Links Tab
	
	By Link_Tab = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[1]/section/div/ul/li[4]");
	
	By Link_Text_Field = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[1]/section/div/div/div[4]/div/div/link-post/div[1]/div/div");
	
	By Meta_Description = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[1]/section/div/div/div[4]/div/div/link-post/div[2]/div");
	
	By Meta_Description_Close = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[1]/section/div/div/div[4]/div/div/link-post/div[2]/div/button");
	
	By clickPost1 = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div[3]/div/div/div[1]/div/share-widget/section/div[2]/button");
	
	public Dashboard_Widget(WebDriver driver) {

		this.driver = driver;

	}

	public boolean Is_Status_Feed_Enabled() 
	{
		
		WebElement We =driver.findElement(Status_Feed_Avail); 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
		
	}

	public boolean Is_Profile_Image_Enabled() {
		
		
		WebElement We = driver.findElement(Profile_Image); 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_Profile_Image_Displayed() {
		// TODO Auto-generated method stub
		WebElement We = driver.findElement(Profile_Image); 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public boolean Is_Status_feed_Text_Field_Enabled() {
				
		WebElement We = driver.findElement(Status_Feed_Input_Field); 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_Status_feed_Text_Field_Displayed() {
		
		WebElement We = driver.findElement(Status_Feed_Input_Field); 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public boolean IsStatus_feed_Place_Holder_Enabled() {
		
		WebElement We = driver.findElement(Status_Feed_PlaceHolder);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean IsStatus_feed_Place_Holder_Displayed() {

		WebElement We = driver.findElement(Status_Feed_PlaceHolder);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void EmptyStatus() {

		WebElement We = driver.findElement(clickPost);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();	
	}

	public boolean IsEmpty_Status_Alert_Enabled() {
		
		WebElement We = driver.findElement(Popup_Header_Text);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean IsEmpty_Status_Alert_Displayed() {

		WebElement We = driver.findElement(Popup_Header_Text);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void close_Empty_Alert() {
				
		WebElement We = driver.findElement(Close_Status_Empty_Pop);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	public void Insert_Empty_Feed() {
		
		WebElement We = driver.findElement(Status_Feed_Input_Field);

		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.sendKeys("               ");
	}

	public boolean IsStatus_Post_Button_Enabled() {
		
		WebElement We = driver.findElement(clickPost);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean IsStatus_Post_Button_Displayed() {


		WebElement We = driver.findElement(clickPost);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	
	}

	public void Click_Post_Button() {
		
		WebElement We = driver.findElement(clickPost);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}

	public boolean Is_Privacy_Drop_Down_Enabled() {
		
		WebElement We = driver.findElement(Is_Status_option);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
	}

	public boolean Is_Privacy_Drop_Down_Displayed() {
		
		WebElement We = driver.findElement(Is_Status_option);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}

	public boolean Is_EveryOne_Option_Enabled() {
		
		Actions action = new Actions(driver);
		
		WebElement mainMenu = driver.findElement(Is_Status_option);
		
		action.moveToElement(mainMenu).moveToElement(driver.findElement(Is_EveryOne_option)).click().build().perform();
		
		return driver.findElement(Is_EveryOne_option).isEnabled();
	}

	public boolean Is_EveryOne_Option_Displayed() {
		
		
		WebElement We = driver.findElement(Is_Status_option);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
		WebElement We1= driver.findElement(Is_EveryOne_option);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We1));
		
		return We1.isDisplayed();
	}	

	public boolean Is_MyFriend_Option_Enabled() {
		
		WebElement We = driver.findElement(Is_MyFriends_option);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_MyFriend_Option_Displayed() {
		
		/*WebElement We = driver.findElement(Is_Status_option);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();*/
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		WebElement We1= driver.findElement(Is_MyFriends_option);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We1));
		
		return We1.isDisplayed();
	}

	public void SelectEveryone() {
		/*
		WebElement We = driver.findElement(Is_Status_option);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();*/
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		WebElement We1= driver.findElement(Is_EveryOne_option);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We1));
		
		We1.click();
	
		
		
	}

	public void SelectMyFriend() {
		
		/*WebElement We = driver.findElement(Is_Status_option);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();*/
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		WebElement We1= driver.findElement(Is_MyFriends_option);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We1));
		
		We1.click();
		
	}

	public void Slowscrolling() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for (int second = 0;; second++) {
		        if(second >=60){
		            break;
		        }
		            jse.executeScript("window.scrollBy(0,600)", ""); //y value '800' can be altered
		            Thread.sleep(3000);
		}
		
	}
	
	public void Insert_Text_In_The_Feed() 
	{
		
	WebElement We1=driver.findElement(Status_Feed_Input_Field);
	
	WebDriverWait wait1 = new WebDriverWait(driver,10);
	
	wait1.until(ExpectedConditions.elementToBeClickable(We1));	
	
	We1.sendKeys("Posted....");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public boolean Is_Logged_In_UserName_Enabled() 
	{
		
		WebElement We = driver.findElement(Is_Login_UserName);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We));	
				
		return We.isEnabled();
		
	}
	
	public boolean Is_Logged_In_UserName_Displayed() {
		
		WebElement We = driver.findElement(Is_Login_UserName);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We));	
				
		return We.isDisplayed();
	}

	public String Get_Feed_UserName() {
	
	WebElement WE = driver.findElement(Is_Feed_UserName);
	
	WebDriverWait wait1 = new WebDriverWait(driver,10);
	
	wait1.until(ExpectedConditions.elementToBeClickable(WE));	
	
	String st = WE.getText();
		
	return st;
	}
	
	public String Get_Logged_UserName() {
		
		WebElement WE = driver.findElement(Is_Login_UserName);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(WE));
		
		String st1 = WE.getText();
			
		return st1;
		
	}
	
	public boolean Is_Feed_In_UserName_Enabled() 
	{
		return driver.findElement(Is_Feed_UserName).isEnabled();
		
	}
	
	public boolean Is_Feed_In_UserName_Displayed() 
	{
		
		WebElement WE = driver.findElement(Is_Feed_UserName);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(WE));
		
		 return WE.isDisplayed();
	}

	public boolean Is_Time_Stamp_Enabled() {
	
		WebElement We = driver.findElement(Is_Time_Stamp);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Time_Stamp_Displayed() {
	
		WebElement We = driver.findElement(Is_Time_Stamp);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public String Get_Time_Stamp() {
		
			WebDriverWait wait = new WebDriverWait(driver,10);
		
			WebElement We3 = driver.findElement(Is_Time_Stamp);
			
			wait.until(ExpectedConditions.elementToBeClickable(We3));
			
			String St4=We3.getText();
			
			return St4;
	}
		
	public void Scrolling_The_Page()
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;

			jse.executeScript("scroll(0, 500)");

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
	
	public void Insert_Links_In_The_Feed() 
	{
		
	WebElement We1=driver.findElement(Status_Feed_Input_Field);
	
	WebDriverWait wait = new WebDriverWait(driver,10);
	
	wait.until(ExpectedConditions.elementToBeClickable(We1));
	
	We1.sendKeys("http://www.yahoo.com ");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	public boolean Is_Teaser_Feed_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We3 = driver.findElement(Teaser_Feed);
		
		wait.until(ExpectedConditions.elementToBeClickable(We3));
		
		return We3.isEnabled();
	}
	
	public boolean Is_Teaser_Feed_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We3 = driver.findElement(Teaser_Feed);
		
		wait.until(ExpectedConditions.elementToBeClickable(We3));
		
		return We3.isDisplayed();
	}
	
	public String Get_Teaser_Feed() {
	
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We3 = driver.findElement(Teaser_Feed);
		
		wait.until(ExpectedConditions.elementToBeClickable(We3));
		
		return We3.getText();
	}
	
	public void SelectPrivacyOption() {
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Is_Status_option);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}
	
	public boolean Is_File_Tab_Enabled() {
		
		WebElement We = driver.findElement(FileTab);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return driver.findElement(FileTab).isEnabled();
	}

	public boolean Is_File_Tab_Displayed() {
		
		WebElement We = driver.findElement(FileTab); 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		return We.isDisplayed();
	}

	public void click_File_tab() {
		
		WebElement We = driver.findElement(FileTab);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}
	
	public boolean Is_File_Status_Field_Enabled() {
		
		WebElement We = driver.findElement(FileTab_StatusField);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
			
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return	We.isEnabled();
	}
	
	public boolean Is_File_Status_Field_Displayed() {
		
		WebElement We = driver.findElement(FileTab_StatusField);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
			
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return	We.isDisplayed();
	}
	
	public void Click_File_Status_Field() throws InterruptedException {
		
		WebElement we = driver.findElement(FileTab_StatusField);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.sendKeys("How is this pictures");
	}

	public boolean Is_File_Upload_Area_Enabled() {
		
		WebElement We = driver.findElement(FileTab_Upload_Area);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeSelected(We));
		
		return We.isEnabled();
	}

	public boolean Is_File_upload_Area_Displayed() {
		
		WebElement We = driver.findElement(FileTab_Upload_Area);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();				
		}

	public void Click_File_Upload_Area_With_Image() throws InterruptedException 
	{
	
		/*WebElement We = driver.findElement(FileTab_Upload_Area);
	
		String st [] = {"C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg","C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg","C:\\Users\\Public\\Pictures\\Sample Pictures\\Jellyfish.jpg"};
		
		Thread.sleep(3000);
		
		for (int i =0;i<st.length;i++)
		{
			
		We.sendKeys(st[i]);
		
		Thread.sleep(3000);
		
		WebElement We1 = driver.findElement(File_Tab_Post_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,120);
		
		wait.pollingEvery(5, TimeUnit.SECONDS);

		wait.until(ExpectedConditions.elementToBeClickable(We1));
		
		We1.click();
		
		}
		
		driver.findElement(FileTab).click();
		
		Thread.sleep(3000);
		*/
		
		String st [] = {"C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg","C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg","C:\\Users\\Public\\Pictures\\Sample Pictures\\Jellyfish.jpg"};
		{
			for(int i=0; i<st.length;i++)
			{
				
				Thread.sleep(2000);
				
				WebElement We = driver.findElement(FileTab_Upload_Area);
				
				Thread.sleep(2000);
				
				We.sendKeys(st[i]);
				
				Thread.sleep(4000);
				
				boolean popupyes=false;
				try
				{
					
				 popupyes=driver.findElement(Invalid_File_upload_Alert_Close).isDisplayed();
				
				}
				catch(Exception e)
				{
					System.out.println("Pop Not Found");
				}
				
				boolean yes=false;
				if(!popupyes)
				{
					WebElement We1 = driver.findElement(File_Tab_Post_Button);
					
					WebDriverWait wait = new WebDriverWait(driver,120);
					
					wait.pollingEvery(5, TimeUnit.SECONDS);

					wait.until(ExpectedConditions.elementToBeClickable(We1));
					
					We1.click();
					
					//driver.findElement(File_Tab_Post_Button).click();
				
					yes = driver.findElement(FileTab).isDisplayed();
				}
				if(yes&&!popupyes)
				{
					
					Thread.sleep(3000);
					
					driver.findElement(FileTab).click();
					
					Thread.sleep(3000);
						
				}
				else if(popupyes)
				{
				
					Thread.sleep(3000);
					
					driver.findElement(Invalid_File_upload_Alert_Close).click();				
			
					/*driver.findElement(FileTab_Upload_Area);
				
				
					Thread.sleep(3000);*/
				
				}
				else
				{
					
				}
				
								
			}
			
		
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    
	  }
	
	public void ScrollOption()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    js.executeScript("javascript:window.scrollBy(0,400)");
	}

	public boolean Is_File_Upload_Post_Button_Enabled() {
		
		WebElement We = driver.findElement(File_Tab_Post_Button); 
	
		WebDriverWait wait = new WebDriverWait(driver,200);
		
		wait.pollingEvery(5,TimeUnit.SECONDS);

		return We.isEnabled();
	}

	public boolean Is_File_Upload_Post_Button_Displayed() {
		
		WebElement We = driver.findElement(File_Tab_Post_Button);

		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Click_File_Upload_Post_Button() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement We = driver.findElement(File_Tab_Post_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,120);
		
		wait.pollingEvery(5, TimeUnit.SECONDS);

		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	public boolean Is_File_Tab_Empty_Alert_Enabled() {
		
		WebElement We = driver.findElement(File_Tab_Empty_Alert_Popup);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_File_Tab_Empty_Alert_Displayed() {
		
		WebElement We = driver.findElement(File_Tab_Empty_Alert_Popup);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Click_File_Tab_Empty_Alert_Popup() {
		
		WebElement We = driver.findElement(File_Tab_Empty_Alert_Close_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}

	public boolean Is_ThumbNail_Close_Enabled() {
		
		WebElement We = driver.findElement(ThumbNail_Close);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
		
		
	}

	public boolean Is_ThumbNail_Close_Displayed() {
		
		WebElement We = driver.findElement(ThumbNail_Close);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Close_ThumbNail() throws InterruptedException {
	
			
			WebElement We = driver.findElement(ThumbNail_Close);
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			
			wait.until(ExpectedConditions.elementToBeClickable(We));

			We.click();
			
		
	}

	public boolean Is_Image_Enabled() {
	
		WebElement We = driver.findElement(Click_ThumbNail);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
	}

	public boolean Is_Image_Displayed() {
		
		WebElement We = driver.findElement(Click_ThumbNail);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}

	public void Click_Image() {
		
		WebElement We = driver.findElement(Click_ThumbNail);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
				
		wait.until(ExpectedConditions.presenceOfElementLocated(Click_ThumbNail));
		
		We.click();
	}

	public void Wait_To_Image_uploaded() 
	{
		WebElement We = driver.findElement(Click_ThumbNail);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
	}
	
	public void Empty_File_Status_Field() throws InterruptedException {
		
		WebElement we = driver.findElement(FileTab_StatusField);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.sendKeys("             ");
	}

	public boolean Progress_bar_Enabled() {
		
		WebElement We = driver.findElement(Progress_bar);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
		
	}

	public boolean Progress_bar_Displayed() {
		
		WebElement We = driver.findElement(Progress_bar);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();

	}

	public void Click_File_Upload_Area_With_File() throws InterruptedException 
	{
		WebElement We = driver.findElement(FileTab_Upload_Area);
		
		We.sendKeys("D:\\Files\\Test.txt");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

	public boolean Is_File_upload_Bar_Close_Button_Is_Enabled() throws InterruptedException {
		
		WebElement We = driver.findElement(FileUpload_Bar_Close_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();

	}

	public boolean Is_File_upload_Bar_Close_Button_Is_Displayed() {
		
		WebElement We = driver.findElement(FileUpload_Bar_Close_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}

	public void Click_Close_Button_File_Upload_Bar() {
		
		WebElement We = driver.findElement(FileUpload_Bar_Close_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
		
		
		
	}

	public boolean Is_Empty_Alert_Popup_Enabled() {
		
		WebElement We = driver.findElement(File_Tab_Empty_Alert_Popup);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
		
		
	}

	public boolean Is_Empty_Alert_Popup_Displayed() {

		WebElement We = driver.findElement(File_Tab_Empty_Alert_Popup);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}

	public void click_Empty_Alert_Popup_Close() {
	
		WebElement we = driver.findElement(File_Tab_Empty_Alert_Close_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.click();
	}
	
	public void Multiple_File_Upload_Area_With_File() throws InterruptedException 
	{
		String st[]={"D:\\Files\\Test_1.txt","D:\\Files\\Test_2.xls","D:\\Files\\Test_3.pptx","D:\\Files\\Test_1.txt"};
		{
			for(int i=0; i<st.length;i++)
			{
				
				WebElement We = driver.findElement(FileTab_Upload_Area);
				
				Thread.sleep(2000);
				
				We.sendKeys(st[i]);
				
				Thread.sleep(4000);
				
				boolean popupyes=false;
				try
				{
					
				 popupyes=driver.findElement(Invalid_File_upload_Alert_Close).isDisplayed();
				
				}
				catch(Exception e)
				{
					System.out.println("Pop Not Found");
				}
				
				boolean yes=false;
				if(!popupyes)
				{
					driver.findElement(File_Tab_Post_Button).click();
				
					yes = driver.findElement(FileTab).isDisplayed();
				}
				if(yes&&!popupyes)
				{
					
					Thread.sleep(3000);
					
					driver.findElement(FileTab).click();
					
					Thread.sleep(3000);
						
				}
				else if(popupyes)
				{
				
					Thread.sleep(3000);
					
					driver.findElement(Invalid_File_upload_Alert_Close).click();				
			
					/*driver.findElement(FileTab_Upload_Area);
				
				
					Thread.sleep(3000);*/
				
				}
				else
				{
					
				}
				
								
			}
			
		
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	public boolean Is_Invalid_File_upload_Alert_Popup_Enabled() {
		
		
		WebElement We = driver.findElement(Invalid_File_Upload_Alert);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
		
		
	}
	
	public boolean Is_Invalid_File_upload_Alert_Popup_Displayed() {
		
		WebElement We = driver.findElement(Invalid_File_Upload_Alert);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}
	
	public void Invalid_File_upload_Alert_Popup_Close() {
		
		WebElement We = driver.findElement(Invalid_File_upload_Alert_Close);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	
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
		
		//Assert.assertEquals(Is_Meta_Description_Close_button_Enabled(),true);
		
		Thread.sleep(3000);
		
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

	@Override
	public boolean Is_Meta_Description_Enabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Is_Meta_Description_Displayed() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean Is_Meta_Description_Close_button_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Meta_Description_Close);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	@Override
	public boolean Is_Meta_Description_Close_button_Displayed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Click_Meta_Description_Close() {
		// TODO Auto-generated method stub
		
	}

	
	public boolean Is_Feed_Page_Navigation_Enabled() {
		
		WebDriverWait Wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Feed_Page_Navigation);
		
		Wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	
	public boolean Is_Feed_Page_Navigation_Displayed() {
		
		WebDriverWait Wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Feed_Page_Navigation);
		
		Wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	
	public void Click_Feed_Page_Navigation() {
		
		WebDriverWait Wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Feed_Page_Navigation);
		
		Wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}
	
}