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
import com.obj.Links.Links;

public class Link_Upload_TestScript extends BrowserInit {
	

	public void LInksUpload_Test() throws InterruptedException
	{
		Links l = new Links(driver);
		
		Edit_Status es = new Edit_Status(driver);
		
		Dashboard_Widget dw = new Dashboard_Widget(driver);
		
		dw.Is_Teaser_Feed_Enabled();
		
		dw.Is_Teaser_Feed_Displayed();
		
		dw.Click_Feed_Page_Navigation();
		
		System.out.println("The page title is :" +driver.getTitle());
		
		Thread.sleep(3000);
		
		l.Is_Link_Tab_Enabled();
		
		l.Is_Link_Tab_Displayed();
		
		l.Click_Link_Tab();
		
		l.Is_Link_Text_Field_Enabled();
		
		l.Is_Link_Text_Field_Displayed();
		
		l.Click_Link_Text_Field();
		
		Comment_In_The_Post cp = new Comment_In_The_Post(driver);
		
		es.Scrolling_The_Page();
		
		Assert.assertEquals(cp.Is_Comment_Enabled(), true);
		
		Assert.assertEquals(cp.Is_Comment_Displayed(), true);
		
		cp.Click_Comment_Field();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Assert.assertEquals(cp.Is_Comment_Button_Enabled(), true);
		
		Assert.assertEquals(cp.Is_Comment_button_Displayed(), true);
		
		cp.Multiple_Comment();
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		cp.Is_Previous_Comment_Enabled();
		
		cp.Is_Previous_Comment_Displayed();
		
		cp.Click_Previous_Comment();
		
		Thread.sleep(3000);
		
		cp.Is_Comment_Feed_Option_Enabled();
		
		cp.Is_Comment_Feed_Option_Displayed();
		
		cp.Click_Comment_Feed_Option();
		
		Thread.sleep(3000);
		
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
		
		Assert.assertEquals(es.Is_Logged_In_User_Name_IsEnabled(), true);

		Assert.assertEquals(es.Is_Logged_In_User_Name_IsDisplayed(), true);

		Assert.assertEquals(es.Is_Logged_In_Feed_Name_IsEnabled(), true);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Assert.assertEquals(es.Is_Post_Feed_Enabled(), true);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Assert.assertEquals(es.Is_Post_Feed_Displayed(), true);
		
		Assert.assertEquals(es.Is_Logged_In_Feed_Name_IsDisplayed(), true);
		
		driver.navigate().refresh();

		if (es.Get_Logged_In_UserName().contentEquals(es.Get_Feed_Name())) {

			es.Click_Post_Feed_Option();

			Assert.assertEquals(es.Is_Edit_option_Enabled(), true);

			Assert.assertEquals(es.Is_Edit_Option_Displayed(), true);

			es.Click_Edit_Option();

			try
			{
				es.Clear_Text_Field();
			}
			catch(Exception e)
			{
				System.out.println("No Such Element Fouund " +e);
			}
			
			es.Insert_Text_In_Edit();
			
			es.Scrolling_The_Page();
			
			Assert.assertEquals(es.Is_Done_Button_Enabled(), true);

			Assert.assertEquals(es.Is_Done_Button_Displayed(), true);

			Assert.assertEquals(es.Is_Cancel_Button_Enabled(), true);

			Assert.assertEquals(es.Is_Cancel_Button_Displayed(), true);
			
			es.Click_Done_Button();
			
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

			} catch (NoSuchElementException e) 
			{
				System.out.println("No Edit history tag is displayed");
			} 
}
}


}
