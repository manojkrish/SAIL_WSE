package com.obj.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.obj.Browser.BrowserInit;
import com.obj.Comment.Comment_In_The_Post;
import com.obj.Dashboard_Widget.Dashboard_Widget;
import com.obj.Edit_Status.Edit_Status;
import com.obj.StatusFeed.StatusFeed;

public class Status_Feed_TestScript extends BrowserInit {
	
	
	public void Status_Feed_TestCase() throws InterruptedException {

		StatusFeed sf = new StatusFeed(driver);
		
		Dashboard_Widget dw = new Dashboard_Widget(driver);
		
		Edit_Status es = new Edit_Status(driver);
		
		sf.Scrolling_The_Page();
		
		dw.Is_Teaser_Feed_Enabled();
		
		dw.Is_Teaser_Feed_Displayed();
		
		dw.Click_Feed_Page_Navigation();
		
		System.out.println("The page title is :" +driver.getTitle());

		Assert.assertEquals(sf.Is_Status_Feed_Enabled(), true);

		Assert.assertEquals(sf.Is_Profile_Image_Enabled(), true);

		Assert.assertEquals(sf.Is_Profile_Image_Displayed(), true);

		Assert.assertEquals(sf.Is_Status_feed_Text_Field_Enabled(), true);

		Assert.assertEquals(sf.Is_Status_feed_Text_Field_Displayed(), true);

		sf.Insert_Empty_Feed();

		sf.SelectMyFriend();

		sf.Click_Post_Button();

		try {

			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

			Assert.assertEquals(sf.IsEmpty_Status_Alert_Enabled(), true);
			
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

			Assert.assertEquals(sf.IsEmpty_Status_Alert_Displayed(), true);

			sf.close_Empty_Alert();
			
		}
		catch (NoSuchElementException e) 
		
		{
			
			System.out.println("Empty Alert popup is not displayed");
		
		}
		
		sf.Insert_Text_In_The_Feed();

		Thread.sleep(2000);

		sf.SelectMyFriend();

		sf.Click_Post_Button();

		sf.Insert_Text_In_The_Feed();

		sf.SelectEveryone();

		sf.Click_Post_Button();

		Assert.assertEquals(sf.Is_Logged_In_UserName_Enabled(), true);

		Assert.assertEquals(sf.Is_Logged_In_UserName_Displayed(), true);

		String st2 = sf.Get_Logged_UserName();
		
		try
		{

		st2=st2.replaceAll("Welcome,.", "");
		
		String st4 = st2.replace("st1.", "st1");
		
		Assert.assertEquals(sf.Is_Feed_In_UserName_Enabled(), true);

		Assert.assertEquals(sf.Is_Feed_In_UserName_Displayed(), true);

		String st3 = sf.Get_Feed_UserName();
		
		Assert.assertEquals(st4, st3);
		
		}
		catch(Exception e)
		{
			System.out.println("UserName is mismatch" +e);
		}

		Assert.assertEquals(sf.Is_Time_Stamp_Enabled(), true);

		Assert.assertEquals(sf.Is_Time_Stamp_Displayed(), true);

		System.out.println("Display the timeStamp :" + sf.Get_Time_Stamp());

		// This is the Code related to the Edit Status post/

		Assert.assertEquals(es.Is_Logged_In_User_Name_IsEnabled(), true);

		Assert.assertEquals(es.Is_Logged_In_User_Name_IsDisplayed(), true);

		Assert.assertEquals(es.Is_Logged_In_Feed_Name_IsEnabled(), true);

		Assert.assertEquals(es.Is_Logged_In_Feed_Name_IsDisplayed(), true);

		Assert.assertEquals(es.Is_Post_Feed_Enabled(), true);

		Assert.assertEquals(es.Is_Post_Feed_Displayed(), true);

		try
		{
			
		if (es.Get_Logged_In_UserName().contentEquals(es.Get_Feed_Name())) 
		
		{
			es.Click_Post_Feed_Option();

			Assert.assertEquals(es.Is_Edit_option_Enabled(), true);

			Assert.assertEquals(es.Is_Edit_Option_Displayed(), true);

			es.Click_Edit_Option();

			es.Clear_Text_Field();

			Thread.sleep(3000);

			Assert.assertEquals(es.Is_Done_Button_Enabled(), true);

			Assert.assertEquals(es.Is_Done_Button_Displayed(), true);

			Assert.assertEquals(es.Is_Cancel_Button_Enabled(), true);

			Assert.assertEquals(es.Is_Cancel_Button_Displayed(), true);

			es.Click_Done_Button();

			try {

				Assert.assertEquals(es.Is_Empty_Alert_Popup_Enabled(), true);

				Assert.assertEquals(es.Is_Empty_Alert_Popup_Displayed(), true);

				sf.close_Empty_Alert();

				}
			
					catch (NoSuchElementException e) 
				{
						
				System.out.println("No Empty Alert Displayed");
				
				}
		

			es.Click_Post_Feed_Option();

			es.Click_Edit_Option();

			es.Clear_Text_Field();

			es.Insert_Text_In_Edit();

			es.Click_Done_Button();

		}

		else 
		
		{
			
			System.out.println("Edit option will not be displayed when the user is not the owner of the Post");
		
		}
		
		}
		catch(Exception e)
		
		{
			
			System.out.println("Not valid User :"+e);
	
		}
		
		Thread.sleep(3000);

		// Edit the post with no content and clicking on the Done button
		
		es.Is_Content_Before_Edit_Enabled();

		es.Is_Content_Before_Edit_Displayed();

		es.Get_Content_Before_Edit();

		es.Click_Post_Feed_Option();

		es.Click_Edit_Option();

		es.Clear_Text_Field();

		es.Click_Done_Button();
		
		try 
		
		{

			Assert.assertEquals(es.Is_Empty_Alert_Popup_Enabled(), true);

			Assert.assertEquals(es.Is_Empty_Alert_Popup_Displayed(), true);

			sf.close_Empty_Alert();

		}
		
		catch (NoSuchElementException e) 
		
		{
			System.out.println("Again No Empty Alert Displayed");
		}
		
		
		es.Is_Content_After_Edit_Enabled();

		es.Is_Content_After_Edit_Displayed();

		es.Get_Content_After_Edit();

		Assert.assertEquals(
				es.Get_Content_Before_Edit().contentEquals(
						es.Get_Content_After_Edit()), true);

		// Edit content with the cancel button

		es.Is_Content_Before_Edit_Enabled();

		es.Is_Content_Before_Edit_Displayed();

		es.Get_Content_Before_Edit();

		Thread.sleep(2000);

		es.Click_Post_Feed_Option();

		es.Click_Edit_Option();

		es.Insert_Text_In_Edit();

		es.Click_Cancel_Button();

		es.Is_Content_After_Edit_Enabled();

		es.Is_Content_After_Edit_Displayed();

		es.Get_Content_After_Edit();

		Assert.assertEquals(
				es.Get_Content_Before_Edit().contentEquals(
						es.Get_Content_After_Edit()), true);

		es.Is_Content_Before_Edit_Enabled();

		es.Is_Content_Before_Edit_Displayed();

		es.Get_Content_Before_Edit();

		es.Click_Post_Feed_Option();

		Thread.sleep(3000);

		es.Click_Edit_Option();

		es.Insert_Text_In_Edit();

		es.Click_Done_Button();

		es.Is_Content_After_Edit_Enabled();

		es.Is_Content_After_Edit_Displayed();
		
		es.Get_Content_After_Edit();

		Assert.assertEquals(
				es.Get_Content_Before_Edit().contentEquals(
						es.Get_Content_After_Edit()), true);

		// To view the Edited History Test Case

		try {

			es.Is_Edited_History_tag_Enabled();

			es.Is_Edited_History_tag_Displayed();

			es.click_Edited_History_tag();

			es.Is_Edited_history_popup_enabled();

			es.Is_Edited_history_popup_displayed();

			es.Get_Edited_History_Popup_Header();
			
			try 
			{
				es.Is_View_More_Enabled();

				es.Is_view_more_Displayed();

				es.click_View_More();
			}
			catch (NoSuchElementException e) 
			{
				System.out.println("No Edited History Content Available");
			}
			es.Get_Edited_History_Content();

			System.out.println("The content is : "
					+ es.Get_Edited_History_Content());

			es.Close_Edited_History_Popup();

		} catch (NoSuchElementException e) {
			System.out.println("No Edit history tag is displayed");
		} 
		
			//Commenting the post\
		
		Comment_In_The_Post cp = new Comment_In_The_Post(driver);
		
		es.Scrolling_The_Page();
		
		Assert.assertEquals(cp.Is_Comment_Enabled(), true);
		
		Assert.assertEquals(cp.Is_Comment_Displayed(), true);
		
		cp.Click_Comment_Field();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Assert.assertEquals(cp.Is_Comment_Button_Enabled(), true);
		
		Assert.assertEquals(cp.Is_Comment_button_Displayed(), true);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		cp.Multiple_Comment();
		
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		cp.Is_Previous_Comment_Enabled();
		
		cp.Is_Previous_Comment_Displayed();
		
		cp.Click_Previous_Comment();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		cp.Is_Comment_Feed_Option_Enabled();
		
		cp.Is_Comment_Feed_Option_Displayed();
		
		cp.Click_Comment_Feed_Option();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		cp.Click_Comment_Field_Edit();
		
		cp.Insert_Comment_Edit();
		
		cp.Is_Comment_Done_Enabled();
		
		cp.Is_Comment_Done_Displayed();
		
		cp.Is_Comment_Cancel_Enabled();
		
		cp.Is_Comment_Cancel_displayed();
		
		cp.click_Comment_Done();
		
		try
		{
		cp.Is_Edited_history_tag_Enabled();
		
		cp.Is_Edited_history_tag_Displayed();
		
		cp.Click_Edited_hitsory_tag();
		
		try 
		{
			es.Is_View_More_Enabled();

			es.Is_view_more_Displayed();

			es.click_View_More();
		} 
		catch (NoSuchElementException e) 
		{
			System.out.println("No Edited History Content Available");
		}
		es.Get_Edited_History_Content();

		System.out.println("The content is : "
				+ es.Get_Edited_History_Content());

		es.Close_Edited_History_Popup();

		} catch (NoSuchElementException e) 
		{
		System.out.println("No Edit history tag is displayed");
		} 		
		
		cp.Is_Comment_Feed_Option_Enabled();
		
		cp.Is_Comment_Feed_Option_Displayed();
		
		Thread.sleep(3000);
		
		cp.Click_Comment_Feed_Option();
		
		cp.Is_Comment_Field_Delete_Enabled();
		
		cp.Is_Comment_Field_Delete_Displayed();
		
		cp.Click_Comment_Field_Delete();
		
		cp.Is_Delete_popup_Delete_Button_Enabled();
		
		cp.Is_Delete_popup_Delete_Button_Displayed();
		
		cp.click_Delete_popup_Delete_Button();
		
		// Deleting the post.

		Thread.sleep(2000);

		es.Is_Post_Feed_Enabled();

		es.Is_Post_Feed_Displayed();
		
		Thread.sleep(3000);

		es.Click_Post_Feed_Option();
		
		Thread.sleep(3000);

		es.Is_Delete_Enabled();

		es.Is_Delete_Displayed();

		es.Click_Delete();

		es.Is_delete_Popup_Enabled();

		es.Is_delete_Popup_Displayed();

		es.Get_popup();

		es.Click_Delete_button();

		Thread.sleep(3000);

	}

}
