package com.obj.TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.obj.Browser.BrowserInit;
import com.obj.Profile_Activity.Profile_Activity;
import com.obj.StatusFeed.StatusFeed;

public class My_Profile_TestScript extends BrowserInit {
	
	public void My_Profile_Test() throws InterruptedException
	{
		
		StatusFeed sf = new StatusFeed(driver);
		
		Profile_Activity pa = new Profile_Activity(driver);
		
		pa.Is_My_Wse_Enabled();
		
		pa.Is_My_Wse_Displayed();
		
		Thread.sleep(3000);
		
		pa.Click_My_Wse();
		
		pa.Is_My_Profile_Enabled();
		
		pa.Is_My_Profile_Displayed();
		
		pa.Click_My_Profile();
		
		Assert.assertEquals(sf.Is_Logged_In_UserName_Enabled(), true);

		Assert.assertEquals(sf.Is_Logged_In_UserName_Displayed(), true);

		String st2 = sf.Get_Logged_UserName();

		String st4 = st2.substring(9, 29);
		
		String st3 = pa.Get_Profile_User_Name();
				
		Assert.assertEquals(st4.contentEquals(st3), true);
		
		pa.Is_Status_Feed_Tab_Enabled();
		
		pa.Is_Status_Feed_Tab_Displayed();
		
		pa.Click_Status_Feed_Tab();
		
		pa.Is_Status_Feed_Text_Field_Enabled();
		
		pa.Is_Status_Feed_Text_Field_Displayed();
		
		pa.Click_Status_Feed_Text_Field();
		
		pa.Is_Privacy_Status_Enabled();
		
		pa.Is_Privacy_Status_Diplayed();
		
		pa.Click_Privacy_Status();
		
		pa.Is_Every_One_Status_Enabled();
		
		pa.Is_Every_One_Status_Displayed();
		
		pa.Click_Every_One_Status();
		
		pa.Is_Post_Button_Enabled();
		
		pa.Is_Post_Button_Displayed();
		
		pa.Click_Post_Button();
		
		pa.Is_Status_Feed_Text_Field_Enabled();
		
		pa.Is_Status_Feed_Text_Field_Displayed();
		
		pa.Click_Status_Feed_Text_Field();
		
		pa.Is_Privacy_Status_Enabled();
		
		pa.Is_Privacy_Status_Diplayed();
		
		pa.Click_Privacy_Status();
		
		pa.Is_Friends_Status_Enabled();
		
		pa.Is_Friends_Status_Displayed();
		
		pa.Click_Friends_Status();
		
		pa.Is_Post_Button_Enabled();
		
		pa.Is_Post_Button_Displayed();
		
		pa.Click_Post_Button();
		
		pa.Is_Activity_Posted_Status_Feed_Enabled();
		
		pa.Is_Activity_Posted_Status_Feed_Disabled();
		
		String st = pa.Get_Activity_Posted_Feed_Content();
		
		pa.Is_Wse_Header_Enabled();
		
		pa.Is_Wse_Header_Displayed();
		
		pa.click_Wse_Header();
		
		pa.Is_Connect_Field_Enabled();
		
		pa.Is_Connect_Field_Displayed();
		
		pa.click_Connect_Field();
		
		pa.Is_Feeds_Enabled();
		
		pa.Is_Feeds_Displayed();
		
		pa.click_Feeds();
		
		pa.Is_Post_Feed_From_Status_Feed_Enabled();
		
		pa.Is_Post_Feed_From_Status_Feed_Displayed();
		
		String st1 = pa.Get_Post_Feed_From_Status_Feed();
		
		Assert.assertEquals(st.equals(st1), true);
		
		pa.Is_My_Wse_Enabled();
		
		pa.Is_My_Wse_Displayed();
		
		Thread.sleep(3000);
		
		pa.Click_My_Wse();
		
		pa.Is_My_Profile_Enabled();
		
		pa.Is_My_Profile_Displayed();
		
		pa.Click_My_Profile();
		
		pa.Element_Visibility();
		
		pa.getFeeds();
		
	}

}
