package com.obj.About;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.obj.Browser.BrowserInit;

public class About_Test_Case extends BrowserInit {
	
	@Test
	public void Navigate_To_About() throws InterruptedException{
		
		About a = new About(driver);
		
		a.Is_MyWse_Displayed();
		
		a.click_MyWse();
		
		a.My_Profile_Displayed();
		
		a.Click_My_Profile();
		
		a.Is_About_Displayed();
		
		a.Click_About();
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void Profile_Basic_Information_In_About() throws InterruptedException{
		
		About a = new About(driver);
		
		a.Is_MyWse_Displayed();
		
		a.click_MyWse();
		
		a.My_Profile_Displayed();
		
		a.Click_My_Profile();
		
		Thread.sleep(7000);
		
		a.Is_About_Displayed();
		
		a.Click_About();
		
		driver.findElement(By.xpath(".//*[@id='student-activity-tab']/a")).click();
		
		Thread.sleep(7000);
		
		a.Is_About_Displayed();
		
		a.Click_About();
		
		a.Is_Edit_Displayed();
		
		a.Click_Edit();
		
		a.Is_Email_Field_Displayed();
		
		a.Insert_Email();
		
		a.Is_Mobile_Field_Displayed();
		
		a.Insert_Mobile();
		
		a.Is_Home_Field_Displayed();
		
		a.Insert_Home();
		
		a.Is_Work_Field_Displayed();
		
		a.Insert_Work();
		
		a.Is_Social_Network_1_Field_Displayed();
		
		a.Select_Social_Network_1();
		
		a.Is_Social_Network_2_Field_Displayed();
		
		a.Select_Social_Network_2();
		
		a.Is_Social_Network_3_Field_Displayed();
		
		a.Select_Social_Network_3();
		
		a.Is_Social_Network_4_Field_Displayed();
		
		a.Select_Social_Network_4();
		
		Thread.sleep(2000);
		
		a.Is_Preferred_Contact_Field_Displayed();
		
		a.Select_Preferred_Contact();
		
		a.Is_Gender_Field_Displayed();
		
		a.Select_Gender();
		
		a.Is_Territory_Displayed();
		
		a.Select_Territory();
		
		a.Is_Native_Language_Field_Displayed();
		
		a.Select_Native_Language();
		
		a.Is_Secondary_Language_Field_Displayed();
		
		a.Select_Secondary_Language();
		
		a.Is_Personal_motivation_Field_Displayed();
		
		a.Select_Personal_motivation();
		
		a.Is_Profession_Field_Displayed();
		
		a.Select_Profession();
		
		a.Is_Submit_Displayed();
		
		a.Select_Submit();
	}
	
	@Test
	public void About_Me_Test() throws InterruptedException{
		
		About a = new About(driver);
		
		a.Is_MyWse_Displayed();
		
		a.click_MyWse();
		
		a.My_Profile_Displayed();
		
		a.Click_My_Profile();
		
		Thread.sleep(7000);
		
		a.Is_About_Displayed();
		
		a.Click_About();
		
		driver.findElement(By.xpath(".//*[@id='student-activity-tab']/a")).click();
		
		Thread.sleep(7000);
		
		a.Is_About_Displayed();
		
		a.Click_About();
		
		a.Is_Edit_Displayed();
		
		a.Click_Edit();
		
		a.Is_About_Me_Field_Displayed();
		
		a.Select_About_Me();
		
		a.Is_Interests_and_hobbies_Field_Displayed();
		
		a.Select_Interests_and_hobbies();
		
		a.Is_Why_I_Study_English_Field_Displayed();
		
		a.Select_Why_I_Study_English();
		
		a.Is_Submit_Displayed();
		
		a.Select_Submit();
		
		
	}
		
}
		



	
	

