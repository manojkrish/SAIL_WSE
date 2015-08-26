package com.obj.TestScript;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.obj.Browser.BrowserInit;
import com.obj.Dashboard_Widget.Dashboard_Widget;

public class DashBoard_Teaser extends BrowserInit {
	
	public WebDriver driver;
	
	@Test
	public void Dashboard_Widget_TestCase() throws InterruptedException
	{
		
		//Teaser Feed Status with public...
		
		Dashboard_Widget dw = new Dashboard_Widget(driver);
		
		Thread.sleep(3000);
		
		dw.Scrolling_The_Page();
		
		dw.Is_Status_Feed_Enabled();
		
		dw.Is_Profile_Image_Enabled();
		
		dw.Is_Profile_Image_Displayed();
		
		dw.Is_Status_feed_Text_Field_Enabled();
		
		dw.Is_Status_feed_Text_Field_Displayed();
		
		dw.Insert_Empty_Feed();
		
		dw.Click_Post_Button();
		
		dw.IsEmpty_Status_Alert_Enabled();
		
		dw.IsEmpty_Status_Alert_Displayed();
		
		dw.close_Empty_Alert();
		
		Thread.sleep(3000);
		
		dw.Scrolling_The_Page();
		
		dw.Insert_Text_In_The_Feed();
		
		dw.Is_Privacy_Drop_Down_Enabled();
		
		dw.Is_Privacy_Drop_Down_Displayed();
		
		dw.SelectPrivacyOption();
		
		dw.Is_EveryOne_Option_Enabled();
		
		dw.Is_EveryOne_Option_Displayed();
		
		dw.SelectEveryone();
		
		dw.Click_Post_Button();
		
		Thread.sleep(3000);
		
		//MyFriend Option

		dw.Scrolling_The_Page();
		
		dw.Insert_Text_In_The_Feed();
		
		dw.Is_Privacy_Drop_Down_Enabled();
		
		dw.Is_Privacy_Drop_Down_Displayed();
		
		dw.SelectPrivacyOption();
		
		dw.Is_MyFriend_Option_Enabled();
		
		dw.Is_MyFriend_Option_Displayed();
		
		dw.SelectMyFriend();
		
		dw.Click_Post_Button();
		
		dw.Is_Logged_In_UserName_Enabled();
		
		dw.Is_Logged_In_UserName_Displayed();
		
		dw.Is_Feed_In_UserName_Enabled();
		
		dw.Is_Feed_In_UserName_Displayed();
		
		if(dw.Get_Feed_UserName() != "You")
		{
			System.out.println("The Feed post is posted by the UserName :" +dw.Get_Logged_UserName());
		}
		
		dw.Is_Teaser_Feed_Enabled();
		
		dw.Is_Teaser_Feed_Displayed();
		
		System.out.println("The content is the status feed  :" +dw.Get_Teaser_Feed());
		
		Thread.sleep(3000);
		
		//FileUpload
		
		dw.Is_File_Tab_Enabled();

		dw.Is_File_Tab_Displayed();

		dw.click_File_tab();
				
		dw.Multiple_File_Upload_Area_With_File();
		
		if(dw.Get_Feed_UserName() != "You")
		{
			System.out.println("The Feed post is posted by the UserName :" +dw.Get_Logged_UserName());
		}
		
		dw.Is_Teaser_Feed_Enabled();
		
		dw.Is_Teaser_Feed_Displayed();
		
		System.out.println("The content is the status feed  :" +dw.Get_Teaser_Feed());
		
		Thread.sleep(3000);
		
		dw.Is_Link_Tab_Enabled();
		
		dw.Is_Link_Tab_Displayed();
		
		dw.Click_Link_Tab();
		
		dw.Is_Link_Text_Field_Enabled();
		
		dw.Is_Link_Text_Field_Displayed();
		
		dw.Click_Link_Text_Field();
		
		if(dw.Get_Feed_UserName() != "You")
		{
			System.out.println("The Feed post is posted by the UserName :" +dw.Get_Logged_UserName());
		}
		
		dw.Is_Teaser_Feed_Enabled();
		
		dw.Is_Teaser_Feed_Displayed();
		
		System.out.println("The content is the status feed  :" +dw.Get_Teaser_Feed());
		
		dw.Is_Teaser_Feed_Enabled();
		
		dw.Is_Teaser_Feed_Displayed();
		
		dw.Click_Feed_Page_Navigation();
		
		System.out.println("The page title is :" +driver.getTitle());
							
	}

}