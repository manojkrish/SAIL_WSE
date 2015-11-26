package com.obj.TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.obj.Browser.BrowserInit;
import com.obj.MyFriends.MyFriends;
import com.obj.Profile_Activity.Profile_Activity;

public class My_Friend_TestScript extends BrowserInit {
	
	public void My_Friends_Test() throws InterruptedException
	{
		
		Profile_Activity pa = new Profile_Activity(driver);
		
		MyFriends mf = new MyFriends(driver);
		
		pa.Is_My_Wse_Enabled();
		
		pa.Is_My_Wse_Displayed();
		
		Thread.sleep(3000);
		
		pa.Click_My_Wse();
		
		mf.Is_My_Friends_Enabled();
		
		mf.Is_My_Friends_Displayed();
		
		mf.Click_My_Friends();
		
		mf.Is_All_Enabled();
		
		mf.Is_All_Displayed();
		
		mf.click_All_Tab();
		
		mf.get_Members_In_All();
		
		System.out.println("Members in the All Tab is : " +mf.get_Members_In_All());		
		
		mf.Is_Students_Enabled();
		
		mf.Is_Students_Displayed();
		
		mf.click_Students_Tab();
		
		System.out.println("Members in Students tab is :" +mf.get_Members_In_Students());
		
		mf.Is_Staff_Enabled();
		
		mf.Is_Staff_Displayed();
		
		mf.click_Staff_Tab();
		
		System.out.println("Members in Staff tab is :" +mf.get_Members_In_Staff());
		
		mf.Is_My_Center_Enabled();
		
		mf.Is_My_Center_Displayed();
		
		mf.click_My_Center_Tab();
		
		System.out.println("Members in MyCenter tab is : "+mf.get_Members_In_MyCenter());
		
		mf.Is_Total_Friends_Count_Enabled();
		
		mf.Is_Total_Friends_Count_Displayed();
		
		System.out.println("Total Friends count :"+mf.get_Total_Friends_Count());	
		
		mf.Is_Search_Box_Enabled();
		
		mf.Is_Search_Box_Displayed();
		
		mf.Enter_Search_UserName();
		
		System.out.println("Result of the Search in MyCenter is : "+mf.get_Members_In_MyCenter());
		
		mf.click_All_Tab();
		
		System.out.println("Result of the Search in All is : "+mf.get_Members_In_All());
		
		mf.click_Students_Tab();
		
		System.out.println("Result of the Search in Student is : "+mf.get_Members_In_Students());
		
		mf.click_Staff_Tab();
		
		System.out.println("Result of the Search in Staff is : "+mf.get_Members_In_Staff());
		
		mf.Is_Find_Friend_Enabled();
		
		mf.Is_Find_Friend_Displayed();
		
		mf.Click_Find_Friends();
		
	}

}
